package com.HackerRank.Exer;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker35 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        // If a PatternSyntaxException is not thrown by Pattern.compile, the regular expresion is valid
        while (testCases-- > 0) {
            String pattern = scan.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException exception) {
                System.out.println("Invalid");
            }
        }
    }
}
