package com.HackerRank.Exer;

import java.util.*;

public class String_Anagrams_15 {

    static HashMap<Character, Integer> createWordList(char[] arr) {
        HashMap<Character, Integer> wordList = new HashMap();
        for (char ch : arr) {
            if (wordList.containsKey(ch)) {
                wordList.replace(ch, wordList.get(ch) + 1);
            } else {
                wordList.put(ch, 1);
            }
        }
        return wordList;
    }

    static boolean compareHashMapsUsingKeySet(HashMap a, HashMap b) {
        Iterator itr = a.keySet().iterator();
        while (itr.hasNext()) {
            char key = (char) itr.next();
            Integer valueA = (Integer) a.get(key);
            Integer valueB = (Integer) b.get(key);
//            System.out.print(key + " " + a.get(key) + " ");
            if (valueA != valueB) {
                return false;
            }
        }
        return true;
    }

    static boolean isAnagram(String a, String b) {
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        HashMap wordList1 = createWordList(charArrayA);
        HashMap wordList2 = createWordList(charArrayB);
        //  System.out.println(compareHashMapsUsingKeySet(wordList1, wordList2));

        return compareHashMapsUsingKeySet(wordList1, wordList2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

// A SIMPLE WAY
//    static boolean isAnagram(String a, String b) {
//        char[] charArrayA = a.toLowerCase().toCharArray();
//        char[] charArrayB = b.toLowerCase().toCharArray();
//        // Get lenghts of both strings
//        int n1 = charArrayA.length;
//        int n2 = charArrayB.length;
//
//        // If length of both strings is not same,
//        // then they cannot be anagram
//        if (n1 != n2)
//            return false;
//
//        // Sort both strings
//        java.util.Arrays.sort(charArrayA);
//        java.util.Arrays.sort(charArrayB);
//
//        // Compare sorted strings
//        for (int i = 0; i < n1; i++)
//            if (charArrayA[i] != charArrayB[i])
//                return false;
//
//        return true;
//    }