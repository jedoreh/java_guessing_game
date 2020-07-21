package org.jotlash.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Show a welcome message
        System.out.println("Welcome To Guessing Game By Jotham Edoreh");

        //Ask name and say hello
        System.out.println("What is Your Name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name);

        //Ask to start game
        System.out.println("Lets Play a Guessing game! Shall we Begin?\n Press any key to Start Game and 0 to quit");
        int intStart = scanner.nextInt();
        Boolean gameOn = false;
        //System.out.println(intStart);
        if (intStart == 1) {
            gameOn = true;
        }

        //System.out.println(gameOn);

        do {
            if (gameOn) {

                //on positive answer generate random number and ask user to guess
                System.out.println("Let Us Start");
                Random random = new Random();
                int number = random.nextInt(10);
                int i = 0;
                do {

                    System.out.println("Guess a Number between 0 and 10! Do not be Shy");
                    int guessNumber = scanner.nextInt();
                    System.out.println("You Guessed " + guessNumber);
                    //if it is correct congratulate and quit game
                    //System.out.println("Random Number: " + number);

                    if (guessNumber == number) {
                        System.out.println("Congratulations!!! You Won.");
                        gameOn = false;
                        intStart = 0;

                    } else if (guessNumber > number) {
                        //tell the user a hint to guess higher or lower each time he loses
                        System.out.println("Incorrect!! Go Lower");
                    } else if (guessNumber < number) {
                        //tell the user a hint to guess higher or lower each time he loses
                        System.out.println("Incorrect!! Go Higher");
                    }
                    i++;
                    //System.out.println(i);
                    if (i == 5){
                        System.out.println("You Lose!!! You have already made 5 tries");
                        System.out.println("The number you are trying to guess is " + number);
                        gameOn = false;

                        break;

                    }
                    //if not correct keep on asking till answer is correct
                    //System.out.println("Game On: " + gameOn);
                } while (gameOn);

                //if user fails 5 times then game over and quit
            } else {

                //Prompt for correct input
                //System.out.println("Enter 1 to Start");
                intStart = 0;
            }
            System.out.println("Enter 1 to start game or 0 to quit");
            intStart = scanner.nextInt();
            if (intStart == 1) {
                gameOn = true;
            }
        } while (intStart != 0);

        //quit game
        System.out.println("Good Bye");
    }
}
