package com.HackerRank.Exer;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if(a.length()<=200 && b.length()<=200){
            BigInteger n1 = new BigInteger(a);
            BigInteger n2 = new BigInteger(b);

            System.out.println(n1.add(n2));
            System.out.println(n1.multiply(n2));


        }

    }
}
