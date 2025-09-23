import java.util.Scanner;
import java.util.Random;

class MathGuessingGame {
    public static void main(String[] args) {
        //Variables to control parameters of the game
        int min = 0; //recommended to be zero, untested situations where it isn't zero
        int max = 100;
        int guesses = ((max / 10) - 1); //make this 1 less than you actually want
        int attempts = 1; //counts attempts until correct guess
        Random rand = new Random(); //Randomizer, to make the game  unpredictable
        int answer = rand.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!\n");
        System.out.println("I've picked a number for you to guess");
        System.out.println("The number is between " + min + " and " + max);

        Scanner reader = new Scanner(System.in);
        System.out.println("You have " + (guesses + 1) + " guesses left.");
        System.out.println("Enter guess number: ");
        int response = reader.nextInt();

        while (guesses >= 0) {
            if (guesses == 0) {
                System.out.println("You have encountered an error or ran out of guesses");
                System.out.println("Try again sometime!");
                reader.close();
                guesses = -1;
            }
            else if (response >= max || response <= min) {
                System.out.println("\nWrite a number between " + min + " and " + max);
                guesses --;
                attempts ++;
                System.out.println("Guesses remaining: " + (guesses + 1));
                response = reader.nextInt();
            } else if (response > answer && response < max) {
                max = response;
                System.out.println("\nGuess a lower number!");
                System.out.println("High guess: " + max);
                System.out.println("Low guess: " + min);
                guesses --;
                attempts ++;
                System.out.println("Guesses remaining: " + (guesses + 1));
                response = reader.nextInt();
            } else if (response < answer && response > min) {
                System.out.println("\nGuess a higher number!");
                min = response;
                System.out.println("High guess: " + max);
                System.out.println("Low guess: " + min);
                guesses --;
                attempts ++;
                System.out.println("Guesses remaining: " + (guesses + 1));
                response = reader.nextInt();
            } else if (response == answer) {
                System.out.println("\nYou have guessed the number!");
                System.out.println("You took " + attempts + " attempts!");
                guesses = -1;
            }
        }
    }
}
