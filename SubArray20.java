package com.HackerRank.Exer;

import java.util.Scanner;

public class SubArray20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        int tempSum;
        int count = 0;
        for (int i = 0; i < n; i++) {
            tempSum = 0;
            for (int j = i; j < n; j++) {
                tempSum+=a[j];
                if(tempSum<0){
                    count++;
                }
                System.out.println(tempSum+" "+count);
            }
        }


    }
}

//1 -2 4 -5 1
//
//i=0 : -1 3
//i=1 : -2 6
//i=2 :  0 7
//i=3 :  -4 9
//i=5 : 1 9