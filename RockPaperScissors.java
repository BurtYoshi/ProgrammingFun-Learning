import java.util.Random;
import java.util.Scanner;
/* Future Features: (This shall be worked on later when I can understand the code that is required to do this)
A way to convert the number rolled to the computer's move (found solution but need to understand)
Assign the inputs to a number value and find an equation that computes it correctly, (modulus)
*/
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
        //Game does not do anything below, figure this out
        while (Continue) { //loop to ensure the player does not continue before choosing a move
            if (UserInput > 0 && UserInput < 4) {
                //Creates the player and computer move variables
                String ComputerMove;
                String PlayerMove;
                String[] Moves = {"Rock", "Paper", "Scissors"};
        System.out.println("Rock (1), Paper (2), Scissors (3)!");
        System.out.println("Choose a move.");
        Scanner InputReader = new Scanner(System.in);
        int UserInput = InputReader.nextInt();

        //if statements to do game because I cannot figure out the incredibly short solution
        if (UserInput == 1) {
            System.out.println("You have chosen rock");
            System.out.println("The computer has chosen...");
        }
        else if (UserInput == 2) {
            System.out.println("You have chosen paper");
            System.out.println("The computer has chosen...");
        }
        else if (UserInput == 3) {
            System.out.println("You have chosen scissors");
            System.out.println("The computer has chosen...");
        }

        Random Randomizer = new Random();
        int ComputerMove = Randomizer.nextInt(3)+ 1;
        System.out.println(ComputerMove);

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
            }
        }
        InputReader.close(); //Apparently a resource risk when not closed
    }
}
