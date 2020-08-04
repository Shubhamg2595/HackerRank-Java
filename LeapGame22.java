package com.HackerRank.Exer;

import java.util.Scanner;

public class LeapGame22 {

    public static boolean canWin(int leap, int[] game) {

        return leapGameWithRecurion(leap, game, 0);

    }

    public static boolean leapGameWithRecurion(int leap, int[] game, int idx) {
        if (idx >= game.length) {
            return true;
        }
        if (idx < 0 || game[idx] == 1) {
            return false;
        }

        game[idx] = 1;
        return leapGameWithRecurion(leap, game, idx + leap) ||
                leapGameWithRecurion(leap, game, idx + 1) ||
                leapGameWithRecurion(leap, game, idx -1);

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int q = scan.nextInt();
        int q = 1;
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }


}


// my long solution : not working for 140 test cases out of 5000
//int len = game.length;
//        if (leap >= len) {
////            System.out.println("inside 1");
//                return true;
//                }
//                int currentPos = 0;
//
//                while (game[currentPos] == 0) {
//                System.out.println(currentPos + " " + game[currentPos]);
//
//                if (currentPos + leap > len ||
//                (currentPos + leap == (len - 1) &&
//                game[currentPos + leap] == 0)) {
//
////                System.out.println("inside 2 cpos: " + currentPos);
//                return true;
//                }
//
//                else if (currentPos + leap < len && game[currentPos + leap] == 0) {
//        currentPos = currentPos + leap;
//        }
//        else
//        {
//        currentPos++;
//        }
//
//
//        }
//
//        System.out.println("FINAL "+currentPos + " " + game[currentPos]);
//
//
//        return false;
//
//        }
