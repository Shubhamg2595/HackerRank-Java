package com.HackerRank.Exer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class String_palin_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String revStr="";
        char[] charArray = A.toCharArray();
        for(int i=A.length()-1;i>=0;i--){
            revStr+=charArray[i];
        }
//        System.out.println(revStr);
//        System.out.println(A);

        if(revStr.equals(A)){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
