package com.snake_ladder;

import java.util.Random;

public class SnakeAndLadder {
    public static  int USER=0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");
        Random r = new Random();

        int deice= r.nextInt(1,7);
        System.out.println("Current score of user is: " +USER);
        System.out.println("Rolling the deice " +deice);

    }
}
