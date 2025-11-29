import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        //Initial setup of the game
        System.out.println("Welcome to the game, a game as old as time...");
        System.out.println("Rock, Paper, Scissors!");
        System.out.println("Choose a move.");

        Scanner InputReader = new Scanner(System.in);
        String UserInput = InputReader.nextLine();
        boolean Continue = true;
        boolean Results = true;
        Random NumberGenerator = new Random();

        String PlayerMove = "";
        String ComputerMove = "";
        String[] Moves = {"Rock", "Paper", "Scissors"}; // dont think is necessary

        while (Continue) {
            //Human decides move
            if (UserInput.equalsIgnoreCase("Rock")) {
                PlayerMove = "Rock";
            } else if (UserInput.equalsIgnoreCase("Paper")) {
                PlayerMove = "Paper";
            } else if (UserInput.equalsIgnoreCase("Scissors")) {
                PlayerMove = "Scissors";
            } else {
                System.out.println("There has been an error while choosing your move");
            }
            System.out.println("Player move: " + PlayerMove);
            //Computer 'decides' move
            ComputerMove = Moves[NumberGenerator.nextInt(3)];
            System.out.println("Computer move: " + ComputerMove);
            
            Continue = false;
        }
        while (Results) { 
            if (PlayerMove.equals(ComputerMove)) {
                System.out.println("The result is a tie, how unfortunate!");
            } else {
                System.out.println("There has been an error while scoring");
            }
        }
    InputReader.close();    
    }
}