package com.HackerRank.Exer;

import java.util.Scanner;

public class If_Else_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%2 != 0){
            System.out.println("Weird");
        }
        else{
            if(N>=6 && N<=20){
                System.out.println("Weird");
            }
            else if((N>=6 && N<=20) || N>20){
                System.out.println("Not Weird");
            }
        }


    }
}
