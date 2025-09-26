import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        //initial game values, need to edit looped ones when changing these
        int min = 1; //Recommended to be zero
        int max = 100;
        int guesses = 5; //make 1 more than desired value
        int attempts = 0;
        Random randomizer = new Random();
        int answer = randomizer.nextInt(max) + 1; //edit max value to edit answer
        boolean continuegame = true;

        //Initial instructions, not repeated in the loop
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number for you to guess\n");
        System.out.println("Typing -1 at any time will restart the game");
        System.out.println("Typing -2 at any time will end the game\n");
        System.out.println("The number is between " + min + " and " + max);
        System.out.println("You have " + (guesses) + " guesses left.");
        System.out.println("Enter guess number: ");

        //Creationo of the scanner and start of the loop
        Scanner inputreader = new Scanner(System.in);
        int userinput = inputreader.nextInt();

        while (continuegame) { //Starts with end conditions then goes to regular gameplay
            //When the user continues to play again after a win
            if (userinput == -1) {
                min = 1;
                max = 100;
                guesses = 5;
                attempts = 0;
                answer = randomizer.nextInt(max); //edit max value to edit answer
                System.out.println("\nTyping -1 at any time restarts the game");
                System.out.println("Typing -2 at any time ends the game\n");
                System.out.println("Typing -3 at any time will let you change the value of max");
                System.out.println("The number is between " + min + " and " + max);
                System.out.println("You have " + (guesses) + " guesses remaining");
                System.out.println("Enter guess number: ");
                userinput = inputreader.nextInt();
            }
            //when user chooses to end the game
            else if (userinput == -2) {
                System.out.println("\nYou have chosen to end the game.");
                System.out.println("Thank you for playing!");
                continuegame = false;
            }
            //When the user runs out of guesses
            if (guesses == 0) {
                System.out.println("You have ran out of guesses");
                System.out.println("Do you wish to play again? (-1 = Yes, -2 = No");
                userinput = inputreader.nextInt();
            }
            else if (userinput == -3) { //user wants to change max value
                guesses = 5;
                min = 1;
                System.out.println("What do you want the new max value to be? (must be less than 10,000)");
                System.out.println("You will have to change this value at the start of every round, sorry");
                System.out.println("Please write the value as a negative, it will be converted ");
                max = Math.abs(inputreader.nextInt());
                System.out.println("New max:" + max);
                System.out.println("\nThe number is between " + min + " and " + max);
                System.out.println("You have " + (guesses) + " guesses remaining");
                userinput = inputreader.nextInt();
            }
            else if (userinput == -4) { //developer thing to check variables before use
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
            else if (userinput >= min && userinput < answer) {
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
            else if (userinput <= max && userinput > answer) {
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