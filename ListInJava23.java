package com.HackerRank.Exer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInJava23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numList.add(sc.nextInt());
        }

        int q = sc.nextInt();

        while (q > 0) {
            String operation = sc.next();
            sc.nextLine();
            int index;
            int value;

            switch (operation) {
                case "Insert":
                    index = sc.nextInt();
                    value = sc.nextInt();
                    numList.add(index, value);
                    break;
                case "Delete":
                    index = sc.nextInt();
                    numList.remove(index);
                    break;
                default:
                    break;
            }
            q--;

        }

        for (Integer i : numList) {
            System.out.print(i + " ");
        }


    }
}
