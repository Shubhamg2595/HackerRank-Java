package com.HackerRank.Exer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetJava26 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        HashSet<String> pairs = new HashSet<String>(t);


        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")");
            System.out.println(pairs.size());
        }


    }
}
