package com.drobek.practice;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner reader= new Scanner(System.in);
    public static void main(String... arg){
        int maxGuess = 10;
        int lastGuess = 0;
        System.out.println("We are going to play a guessing game....");
        System.out.println("Im going to pick a random number, and you have to guess it in under 10 guesses.");
        System.out.println("Pick your range from zero to ??????");
        System.out.println();
        System.out.println("Enter the Max number in the range");
        int userPick = reader.nextInt();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(userPick);
//        System.out.println(randomInt);

        System.out.println("Try to guess the sectret number 0-"+ userPick+ " in under 10 tries:");

        while (maxGuess >= 1) {

            int input = reader.nextInt();

            if (input < randomInt && input !=lastGuess) {
                maxGuess = maxGuess - 1;
                lastGuess=input;
                System.out.println("guess higher " + "\u2191 " + maxGuess + " guesses remain");
            }
            if (input > randomInt && input !=lastGuess) {
                maxGuess = maxGuess - 1;
                lastGuess =input;
                System.out.println("guess lower " + " \u2193 " + maxGuess + " guesses remain");
            }

            if (input == randomInt ) {
                System.out.println("yay! you won in " + (11 - maxGuess) + " tries");
            }
            else{
                System.out.println("Guess a different number " + maxGuess + " guesses remain");
            }

        }
        System.out.println();
        System.out.println("Sorry game over....The secret number was:  " + randomInt);
    }
}
