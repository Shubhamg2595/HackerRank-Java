package com.HackerRank.Exer;

import java.util.Scanner;

public class End_of_file_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNext()){
            String userInput = sc.nextLine();
            System.out.println(count + " " + userInput );
            count++;
        }

    }
}
