import java.util.Scanner;
import java.util.Random;
//Feature to allow the user to choose the range of numbers at initialization and start of future rounds, default is 100 but can be changed to anything up to 10,000. Need to make a formula for number of guesses to balance difficulty 
public class GuessTheNumber {
    public static void main(String[] args) {
        //initial game values, need to edit looped ones when changing these
        int min = 0; //Recommended to be zero
        int max = 100 + 1; //1st is the desired input, 2nd because later functions do not include the end points
        int guesses = 4; //make 1 more than desired value
        int attempts = 1; //do not edit, counts attempt till game completion
        Random randomizer = new Random();
        int answer = randomizer.nextInt(max) + 1; //edit max value to edit answer
        boolean continuegame = true;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number for you to guess\n");
        System.out.println("The number is between " + min + " and " + max + " (0 and 11 are not valid inputs)");
        System.out.println("You have " + (guesses) + " guesses left.");
        System.out.println("Enter guess number: ");

        Scanner inputreader = new Scanner(System.in);
        int userinput = inputreader.nextInt();

        while (continuegame) {
            //Starts with end conditions then goes to regular gameplay
            //When the user continues to play again after a win
            if (userinput == -1) {
                min = 0; //Recommended to be zero
                max = 100;
                guesses = 4; //make 1 more than desired value
                attempts = 1; //do not edit, counts attempt till game completion
                answer = randomizer.nextInt(max); //edit max value to edit answer
                System.out.println("\nThe number is between " + min + " and " + max + " (0 and 11 are not valid inputs)");
                System.out.println("You have " + (guesses) + " guesses remaining");
                System.out.println("Enter guess number: ");
                userinput = inputreader.nextInt();
            }
            //when user chooses to end the game after a win
            else if (userinput == -2) {
                System.out.println("\nYou have chosen to end the game.");
                System.out.println("Thank you for playing!");
                continuegame = false;
            }
            else if (userinput == -3) { //developer thing to check variables before use
                System.out.println("Minimum: " + min);
                System.out.println("Maximum: " + max);
                System.out.println("Attempts: " + attempts);
                System.out.println("Guesses: " + guesses);
                System.out.println("Answer: " + answer);
                continuegame = false;
            }
            //guess is outside the range of acceptable guesses
            else if (userinput > max || userinput < min) {
                attempts ++;
                guesses --;
                System.out.println("\nGuesses must be between " + min + " and  " + max);
                System.out.println("You have " + (guesses) + " guesses remaining");
                userinput = inputreader.nextInt();
            }
            //guess is above previous minimum but less than the answer
            else if (userinput > min && userinput < answer) {
                attempts ++;
                guesses --;
                min = userinput;
                System.out.println("\nGuess a higher number!");
                System.out.println("You have " + (guesses) + " guesses remaining");
                System.out.println("High guess: " + max);
                System.out.println("Low guess: " + min);
                userinput = inputreader.nextInt();
            }
            //guess is below the previous maximum but greater than the answer
            else if (userinput <max && userinput > answer) {
                attempts ++;
                guesses --;
                max = userinput;
                System.out.println("\nGuess a lower number!");
                System.out.println("You have " + (guesses) + " guesses remaining");
                System.out.println("High guess: " + max);
                System.out.println("Low guess: " + min);
                userinput = inputreader.nextInt();
            }
            //when the correct answer is guessed
            else if (userinput == answer) {
                attempts ++;
                guesses --;
                System.out.println("\nYou have guessed the number!" + " (" + answer + ")");
                System.out.println("You took " + attempts + " attempts!");
                System.out.println("Do you wish to play again? (-1 = Yes, -2 = No");
                userinput = inputreader.nextInt();
            }
        }
    }
}