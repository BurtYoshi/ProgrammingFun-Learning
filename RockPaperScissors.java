import java.util.Scanner;
import java.util.Random;
/* Future Features:
A randomizer to select the computer's move, a 1 in 3
A way to convert the number rolled to the computer's move, currently have no ideas
*/
public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Welcome to the game, a game as old as time...");
        System.out.println("Rock, Paper, Scissors!");
        System.out.println("Choose a move.");

        Scanner reader = new Scanner(System.in);
        String UserMove = reader.nextLine();

        Random NumberGenerator = new Random();
        int ComputerMove = NumberGenerator.nextInt(100) + 1;

        if (UserMove.equals("Rock") && ComputerMove == 1) {
            System.out.println("Your move: Rock");
            System.out.println("Computer Move: " +  ComputerMove);
        }
    }
}
