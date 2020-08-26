package com.HackerRank.Exer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Add {
    void add(int ...a){
        int sum = 0;
        int count = 0;
        for(int i:a){
            if(count == a.length-1){
                System.out.print(i);
            }
            else
            {
                System.out.print(i+"+");
            }
            sum+=i;
            count++;
        }
        System.out.println("="+sum);
    }
}

public class VarArgsJava39 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            int n6 = Integer.parseInt(br.readLine());
            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);
////            Method[] methods = Add.class.getDeclaredMethods();
////            Set<String> set = new HashSet<>();
////            boolean overload = false;
////            for (int i = 0; i < methods.length; i++) {
////                if (set.contains(methods[i].getName())) {
////                    overload = true;
////                    break;
////                }
////                set.add(methods[i].getName());
////
////            }
//            if (overload) {
//                throw new Exception("Overloading not allowed");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
