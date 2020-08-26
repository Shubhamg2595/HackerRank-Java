package com.HackerRank.Exer;

import java.util.Scanner;

class MyCalculator1 {
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if(n==0&&p==0){
            throw new Exception("n and p should not be zero.");
        }else if (p == 0) {
            return 1;
        }
        else if(n==0){
            return 0;
        }else if (p==1)
        {
            return n;
        }
        else {
            return n * power(n, p - 1);
        }
    }
}

public class ThrowsException37 {
    public static final MyCalculator1 my_calculator = new MyCalculator1();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
