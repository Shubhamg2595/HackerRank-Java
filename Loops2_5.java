package com.HackerRank.Exer;

import java.util.Scanner;

public class Loops2_5 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int count=0;
            int currentSum = a;
            while(n>0){
                System.out.print(currentSum + (int)Math.pow(2,count)*b + " ");
                currentSum = currentSum + (int)Math.pow(2,count)*b;
                count++;
                n--;
            }
            System.out.println();
        }
        in.close();
    }
}
