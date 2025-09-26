import java.util.Scanner;
import java.util.Random;
//loop works but does not display text correctly afterwards, infinite game without end condition
//displays text correctly when guessed the first time but not any proceeding time
//make the continue game condition false and still able to continue the loop (i think just make it always false, AFTER THE SCANNER THING, THAT'S THE MORE IMPORTANT THING)
class NumberGuessingGame {
    public static void main(String[] args) {
        //Variables to control parameters of the game
        int min = 0; //recommended to be zero, untested situations where it isn't zero
        int max = 5;
        int guesses = 3; //make 1 less than desired value
        int attempts = 1; //counts attempts until correct guess (do not manipulate)
        Random rand = new Random(); //Randomizer for the game answer
        int answer = rand.nextInt(max) + 1; //edit only the number in parenthesis
        boolean continuegame = true;

        System.out.println("Welcome to the Number Guessing Game!\n");
        System.out.println("I've picked a number for you to guess");
        System.out.println("The number is between " + min + " and " + max);

        //Creating the scanner that runs the game
        Scanner reader = new Scanner(System.in);
        System.out.println("You have " + (guesses) + " guesses left.");
        System.out.println("Enter guess number: ");
        int response = reader.nextInt();

        //Basic gameplay loop, runs through a checklist, letters break it
        while (guesses >= 0 && continuegame) {
            //When the user fails to guess the answer before running out of guesses
            if (guesses == 0) {
                System.out.println("You have encountered an error or ran out of guesses.");
                System.out.println("Try again sometime!");
                System.out.println("The answer was " + answer);
                guesses = -1; //prevents an infinite loop due to the condition always being met
                System.out.println("Do you want to play again? (-1 = No, -2 = Yes");
                response = reader.nextInt();

            if (response == -2) {
                // restarts the game when user continues the game
                guesses = 3;
                attempts = 1;
                min = 0;
                max = 5;
                answer = rand.nextInt(max) + 1;
                System.out.println("\nNew game started!");
                System.out.println("The number is between " + min + " and " + max);
                System.out.println("Enter guess number: ");
                response = reader.nextInt();
            } else if (response == -1) {
                    continuegame = false; //ends the game
            }
            //When the input is not between the min and max
            else if (response > max || response < min) {
                System.out.println("\nWrite a number between " + min + " and " + max);
                attempts++;
                guesses--;
                System.out.println("Guesses remaining: " + (guesses + 1));
                response = reader.nextInt();
            }
            //When the input is greater than the answer
            else if (response > answer && response < max) {
                max = response;
                System.out.println("\nGuess a lower number!");
                System.out.println("High guess: " + max);
                System.out.println("Low guess: " + min);
                guesses--;
                attempts++;
                System.out.println("Guesses remaining: " + (guesses + 1));
                response = reader.nextInt();
            }
            //When the input is less than the answer
            else if (response < answer && response > min) {
                System.out.println("\nGuess a higher number!");
                min = response;
                System.out.println("High guess: " + max);
                System.out.println("Low guess: " + min);
                guesses--;
                attempts++;
                System.out.println("Guesses remaining: " + (guesses + 1));
                response = reader.nextInt();
            }
            //When the user guesses the answer
            else if (response == answer) {
                System.out.println("\nYou have guessed the number!");
                System.out.println("You took " + attempts + " attempts!");
                guesses = -1;
                System.out.println("Do you want to play again? (-1 = No, -2 = Yes");
                response = reader.nextInt();

                if (response == -2) {
                    // restarts the game when user continues the game
                    guesses = 3;
                    attempts = 1;
                    min = 0;
                    max = 5;
                    answer = rand.nextInt(max) + 1;
                    System.out.println("\nNew game started!");
                    System.out.println("The number is between " + min + " and " + max);
                    System.out.println("Enter guess number: ");
                    response = reader.nextInt();
                } else {
                    continuegame = false; // ends the game
                }
                }
            }
        }
    }
}