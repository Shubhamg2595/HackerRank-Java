package com.HackerRank.Exer;

import java.util.Scanner;

public class Static_Initializer_Block_8 {

    public static Scanner sc = new Scanner(System.in);
    static int B;
    static int H;
    static Boolean flag = true;

    static {

         B = sc.nextInt();
         H = sc.nextInt();
         sc.close();


        try {
            if(B<=0 || H<=0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }

        }
        catch (Exception e){
            System.out.println(e);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
