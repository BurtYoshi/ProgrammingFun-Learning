import java.util.Scanner;
import java.util.Random;
/* Future Features:
A way to convert the number rolled to the computer's move (found solution but need to understand)
Assign the inputs to a number value and find an equation that computes it correctly, (modulus)
*/
public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Welcome to the game, a game as old as time...");
        System.out.println("Rock, Paper, Scissors!");
        System.out.println("Choose a move.");

        Scanner reader = new Scanner(System.in);
        String UserMove = reader.nextLine();

        Random NumberGenerator = new Random();
        int ComputerMove = NumberGenerator.nextInt(3) + 1;

    }
}
