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
        System.out.println("Rock, Paper, Scissors!");
        System.out.println("Choose a move.");

        Scanner InputReader = new Scanner(System.in);
        String UserMove = InputReader.nextLine();


        Random NumberGenerator = new Random();
        int ComputerMove = NumberGenerator.nextInt(3) + 1; //prevents a zero being returned

        InputReader.close(); //Apparently a resource risk when not closed
    }
}
