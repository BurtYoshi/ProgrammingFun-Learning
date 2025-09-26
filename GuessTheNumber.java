import java.util.Scanner;
import java.util.Random;
//Will be the rewrite of NumberGuessing because it's getting too complicated
/*
Initialize variables first time outside 'while' and have a thing at the beginning to reset them
blocks for when number is above/below max and min, below max but above answer, above min but below answer,
 when user says -1 (continue game) and -2 (end game), when guesses = 0, when they guess the correct answer
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        //initial game values, need to edit looped ones when changing these
        int min = 0; //Recommended to be zero
        int max = 10;
        int guesses = 3; //make 1 less than desired value
        int attempts = 1; //do not edit, counts attempt till game completion
        Random randomizer = new Random();
        int answer = randomizer.nextInt(max) + 1; //edit max value to edit answer
        boolean continuegame = true;

        System.out.println("Welcome to the Number Guessing Game!\n");
        System.out.println("I've picked a number for you to guess");
        System.out.println("The number is between " + min + " and " + max);
        System.out.println("You have " + (guesses) + " guesses left.");
        System.out.println("Enter guess number: ");

        Scanner inputreader = new Scanner(System.in);
        int userinput = inputreader.nextInt();

        while (continuegame) {

        }
    }
}
