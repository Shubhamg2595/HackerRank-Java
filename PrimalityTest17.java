package com.HackerRank.Exer;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        BigInteger number = new BigInteger(n);

        if(n.length()<=100 && number.isProbablePrime(1)){
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }

        sc.close();
    }
}
