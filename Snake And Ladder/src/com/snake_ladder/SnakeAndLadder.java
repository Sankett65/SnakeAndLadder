package com.snake_ladder;

import java.util.Random;

public class SnakeAndLadder {
    public static  int USER=0;
    public static final int TARGET =100;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");
        Random r = new Random();
        Random c = new Random();
        int count =1;

        for (int i = 0; i < 35; i++) {
            if (USER == 100)
                break;
            int deice = r.nextInt(1, 7);
            int check = c.nextInt(3);
           
            System.out.println("\nScore : " +USER);
             count++;

            System.out.println("Rolling the deice " + deice);
            USER=USER+deice;
            System.out.println("Current score of user is: " + USER);

            if (USER==100 )
                break;

            if (check==0 ){
                System.out.println("You got nothing you can continue");
                System.out.println("Current score for = "+USER);

            } else
                if (check==1 ) {
                    System.out.println("You have got a Ladder and you have to increase you score by "+deice + " and play again");
                    USER=USER+deice;
                    System.out.println("Current score of is "+USER);
                    continue;

                } else  {
                    System.out.println("You have got a Snake and you have to increase you score by "+deice);
                    USER=USER-deice;
                    System.out.println("Current score of is "+USER);

                }
            }
        if (count>=35 && USER<TARGET){
            System.out.println("\nComputer has Won the game");
        }else {
            System.out.println("\nYOU HAVE WON!!!" );
        }

        System.out.println("\nThe score of s: " + USER);
        System.out.println("try taking  "+count);

        }
    }

