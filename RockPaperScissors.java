import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //Initial setup of the game
        System.out.println("Welcome to the game, a game as old as time...");
        System.out.println("Rock(1), Paper(2), Scissors(3)!");
        System.out.println("Choose a move.");
        Scanner InputReader = new Scanner(System.in);
        int UserInput = InputReader.nextInt();
        boolean Continue = true;
        boolean Results = true;
        Random NumberGenerator = new Random();

        while (Continue) { //loop to ensure the player does not continue before choosing a move
            if (UserInput > 0 && UserInput < 4) {
                //Creates the player and computer move variables
                String ComputerMove;
                String PlayerMove;
                String[] Moves = {"Rock", "Paper", "Scissors"};

                //Determines and stores the player and computer's moves
                PlayerMove = Moves[UserInput - 1];
                System.out.println("You have chosen: " + PlayerMove);
                ComputerMove = Moves[NumberGenerator.nextInt(3)];
                System.out.println("The computer has chosen: " + ComputerMove);

                Continue = false;
            } else if (UserInput >= 4 || UserInput <= 0){
                System.out.println("Type a number between 1 and 3!");
                UserInput = InputReader.nextInt();
            } else {
                System.out.println("You have found a new error, please report this");
                System.exit(0);
            }
        }
        while (Results) {
            //System.out.println("You chose: " + PlayerMove);
            //System.out.println("The Computer Chose: " + ComputerMove);
            Results = false;
        }
        InputReader.close();
    }
}