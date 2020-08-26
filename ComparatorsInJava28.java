package com.HackerRank.Exer;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
       if(o1.score == o2.score){
           return o1.name.compareTo(o2.name);
       }
        return o2.score-o1.score;
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


public class ComparatorsInJava28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();


//        Comparator<Player> ByScore;

        // old way
//        ByScore = new Comparator<Player>() {
//            @Override
//            public int compare(Player o1, Player o2) {
//                return o2.score-o1.score;
//            }
//        };
        // lambda way
//        ByScore = (o1, o2) -> o2.score-o1.score;

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}
