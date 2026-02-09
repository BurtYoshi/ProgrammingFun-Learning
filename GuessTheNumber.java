import java.util.Random;
import java.util.Scanner;
//Loop does not work properly
//Commented lines are not required but could be used for testing
public class GuessTheNumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int guesses = 6;
        int attempts = 0;
        Random randomizer = new Random();
        int answer = randomizer.nextInt(max) + 1;
        boolean ContinueGame = true;
        boolean Gaming = true;
        boolean Looper = false;

        //initial instructions, not repeated in the loop
        System.out.println("Welcome to Guess The Number!");
        System.out.println("I've picked a number for you to guess\n");
        /*System.out.println("Typing -1 at any time will restart the game");
        System.out.println("Typing -2 at any time will end the game\n");*/
        System.out.println("The number is between " + min + " and " + max);
        System.out.println("You have " + (guesses) + " guesses left.");
        System.out.println("Enter guess number: ");

        //creation of the scanner and start of the loop
        Scanner InputReader = new Scanner(System.in);
        String continuethegameyn = ""; //string to replace negative inputs for non guessing inputs
        int UserInput = InputReader.nextInt();

        while (ContinueGame) {
            while (Gaming) { //starts with end conditions then goes to regular gameplay
                if (UserInput == -3) { //debug command
                    System.out.println("The answer is... " + answer);
                }
                //regular gameplay conditions
                if (guesses == 0) { //when player runs out of guesses
                    System.out.println("You have ran out of guesses");
                    System.out.println("The correct answer was: " + answer);
                    System.out.println("Do you wish to play again? (Yes or No)");
                    Looper = true;
                    Gaming = false;
                } else if (UserInput > max || UserInput < min) { //guess is outside the range of acceptable guesses
                    attempts++;
                    guesses--;
                    System.out.println("\nGuesses must be between " + min + " and  " + max);
                    System.out.println("You have " + (guesses) + " guesses remaining");
                    UserInput = InputReader.nextInt();
                } else if (UserInput >= min && UserInput < answer) { //guess is above previous minimum but less than the answer
                    attempts++;
                    guesses--;
                    min = UserInput;
                    System.out.println("\nGuess a higher number!");
                    System.out.println("You have " + (guesses) + " guesses remaining");
                    System.out.println("High guess: " + max);
                    System.out.println("Low guess: " + min);
                    UserInput = InputReader.nextInt();
                } else if (UserInput <= max && UserInput > answer) { //guess is below the previous maximum but greater than the answer
                    attempts++;
                    guesses--;
                    max = UserInput;
                    System.out.println("\nGuess a lower number!");
                    System.out.println("You have " + (guesses) + " guesses remaining");
                    System.out.println("High guess: " + max);
                    System.out.println("Low guess: " + min);
                    UserInput = InputReader.nextInt();
                } else if (UserInput == answer) { //when the correct answer is guessed
                    attempts++;
                    guesses--;
                    System.out.println("\nYou have guessed the number!" + " (" + answer + ")");
                    System.out.println("You took " + attempts + " attempts!");
                    System.out.println("Do you wish to play again? (Yes or No)");
                    Gaming = true;
                }
            }
            UserInput = 1;
            continuethegameyn = InputReader.nextLine();
            while (Looper) {
                if (continuethegameyn.equalsIgnoreCase("Yes")) { //when the player continues to play again after a win
                    min = 1;
                    max = 100;
                    guesses = 6;
                    attempts = 0;
                    answer = randomizer.nextInt(max); //edit max value to edit answer
                    System.out.println("\nYou have started a new game!");
                    System.out.println("Enter guess number: ");
                    UserInput = InputReader.nextInt();
                    Gaming = true;
                    Looper = false;
                } else if (continuethegameyn.equalsIgnoreCase("No")) { //when the player chooses to end the game
                    System.out.println("\nYou have chosen to end the game.");
                    System.out.println("Thank you for playing Guess The Number!");
                    InputReader.close();
                    Looper = false;
                    System.exit(0);
                }
            }
        }
    }
}
