package com.HackerRank.Exer;

import java.util.ArrayList;
import java.util.Scanner;

class Stack {
    ArrayList<Character> newStack;

    public Stack(ArrayList<Character> list) {
        this.newStack = list;
    }

    public void push(char element) {
        this.newStack.add(element);
    }

    public void pop() {
        this.newStack.remove(newStack.size() - 1);
    }

    public int getSize() {
        return this.newStack.size();
    }


}

public class ParanthesisBalancerStack25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        ArrayList<Character> paranthesisList = new ArrayList<>();


//        Stack myStack = new Stack(paranthesisList);
        while (sc.hasNext()) {
            ArrayList<Character> paranthesisList = new ArrayList<>();

            String userInput = sc.nextLine();
            char[] myCharacterArray = userInput.toCharArray();
            boolean extraKey = false;
            for (int i = 0; i < userInput.length(); i++) {
                if (myCharacterArray[i] == '{'
                        || myCharacterArray[i] == '['
                        || myCharacterArray[i] == '(') {
                    paranthesisList.add(myCharacterArray[i]);
                }
                if (myCharacterArray[i] == '}'
                        || myCharacterArray[i] == ']'
                        || myCharacterArray[i] == ')') {
                    if (paranthesisList.size() > 0) {
                        paranthesisList.remove(paranthesisList.size() - 1);
                    }
                    else
                    {
                        extraKey = true;
                    }
                }

            }
            if(paranthesisList.size() == 0 && !extraKey ){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
//            System.out.println("size "+paranthesisList.size());
//            paranthesisList.forEach((item) -> {
//                System.out.print(item+ " ");
//            });
        }


    }

}
