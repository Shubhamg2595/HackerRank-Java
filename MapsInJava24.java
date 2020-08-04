package com.HackerRank.Exer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapsInJava24 {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String,Long> phoneBook = new HashMap<>();

        while(n>0){

            String name = sc.nextLine();
            Long phoneNumber = sc.nextLong();
            sc.nextLine();
            phoneBook.put(name,phoneNumber);


            n--;
        }

        while (sc.hasNext()){
            String query = sc.nextLine();
            if(phoneBook.containsKey(query)){
                System.out.println(query+"="+phoneBook.get(query));
            }
            else
            {
                System.out.println("Not found");
            }

        }



        sc.close();
// OPTIMAL WAY TO PRINT HASHMAPS
//        phoneBook.forEach((k,v) -> {
//            System.out.print(k+" "+v);
//            System.out.println();
//    });


    }
}
