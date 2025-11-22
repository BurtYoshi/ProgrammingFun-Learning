import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int guesses = 6;
        int attempts = 0;
        Random randomizer = new Random();
        int answer = randomizer.nextInt(max) + 1;
        boolean continuegame = true;

        //initial instructions, not repeated in the loop
        System.out.println("Welcome to Guess The Number!");
        System.out.println("I've picked a number for you to guess\n");
        System.out.println("Typing -1 at any time will restart the game");
        System.out.println("Typing -2 at any time will end the game\n");
        System.out.println("The number is between " + min + " and " + max);
        System.out.println("You have " + (guesses) + " guesses left.");
        System.out.println("Enter guess number: ");

        //creation of the scanner and start of the loop
        Scanner inputreader = new Scanner(System.in);
        int userinput = inputreader.nextInt();

        while (continuegame) { //starts with end conditions then goes to regular gameplay
            //irregular conditions, loop and ending game
            if (userinput == -1) { //when the player continues to play again after a win
                min = 1;
                max = 100;
                guesses = 6;
                attempts = 0;
                answer = randomizer.nextInt(max); //edit max value to edit answer
                System.out.println("\nYou have started a new game!");
                System.out.println("Enter guess number: ");
                userinput = inputreader.nextInt();
            } else if (userinput == -2) { //when the player chooses to end the game
                System.out.println("\nYou have chosen to end the game.");
                System.out.println("Thank you for playing Guess The Number!");
                inputreader.close();
                System.exit(0);
            } 
            //regular gameplay conditions
            if (guesses == 0) { //when player runs out of guesses
                System.out.println("You have ran out of guesses");
                System.out.println("The correct answer was: " + answer);
                System.out.println("Do you wish to play again? (-1 = Yes, -2 = No)");
                userinput = inputreader.nextInt();
            } else if (userinput > max || userinput < min) { //guess is outside the range of acceptable guesses
                attempts ++;
                guesses --;
                System.out.println("\nGuesses must be between " + min + " and  " + max);
                System.out.println("You have " + (guesses) + " guesses remaining");
                userinput = inputreader.nextInt();
            } else if (userinput >= min && userinput < answer) { //guess is above previous minimum but less than the answer
                attempts ++;
                guesses --;
                min = userinput;
                System.out.println("\nGuess a higher number!");
                System.out.println("You have " + (guesses) + " guesses remaining");
                System.out.println("High guess: " + max);
                System.out.println("Low guess: " + min);
                userinput = inputreader.nextInt();
            } else if (userinput <= max && userinput > answer) { //guess is below the previous maximum but greater than the answer
                attempts ++;
                guesses --;
                max = userinput;
                System.out.println("\nGuess a lower number!");
                System.out.println("You have " + (guesses) + " guesses remaining");
                System.out.println("High guess: " + max);
                System.out.println("Low guess: " + min);
                userinput = inputreader.nextInt();
            } else if (userinput == answer) { //when the correct answer is guessed
                attempts ++;
                guesses --;
                System.out.println("\nYou have guessed the number!" + " (" + answer + ")");
                System.out.println("You took " + attempts + " attempts!");
                System.out.println("Do you wish to play again? (-1 = Yes, -2 = No)");
                userinput = inputreader.nextInt();
            }
        }
    }
}