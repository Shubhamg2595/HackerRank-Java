package com.HackerRank.Exer;

import java.util.ArrayList;
import java.util.Scanner;

public class QuesArrayList21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] numList = new ArrayList[n];

        // initializing
        for (int i = 0; i < n; i++) {
            numList[i] = new ArrayList<Integer>();
            int arrSize = sc.nextInt();
            for (int j = 0; j < arrSize; j++) {
                numList[i].add(sc.nextInt());
            }
        }
//        for (ArrayList<Integer> list : numList) {
//            System.out.println(list);
//        }

        int numOfQueries = sc.nextInt();
        int[] outputArr = new int[numOfQueries];
        int yPosition;
        int xLine;

        for (int i = 0; i < numOfQueries; i++) {
            yPosition = sc.nextInt();
            xLine = sc.nextInt();
            System.out.println("y pos " + yPosition + " x: " + xLine);
            if (numList[yPosition - 1].size() > 0 && xLine <= numList[yPosition - 1].size()) {
                System.out.println("inside");
                System.out.println(numList[yPosition - 1].get(xLine - 1));
                outputArr[i] = numList[yPosition - 1].get(xLine - 1);
            } else {
                outputArr[i] = -1;
            }
        }


        System.out.println("check the output");
        for (int i : outputArr) {
            if (i < 0) {
                System.out.println("ERROR!");
            } else {
                System.out.println(i);

            }
        }


    }


}
