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

        //Game does not do anything below, figure this out
        while (Continue) {
            if (UserInput > 0 && UserInput < 4) {
                String ComputerMove;
                String PlayerMove;
                String[] Moves = {"Rock", "Paper", "Scissors"};

                ComputerMove = Moves[InputReader.nextInt(2)];
                System.out.println(ComputerMove);
                PlayerMove = Moves[InputReader.nextInt(2)];
                System.out.println(PlayerMove);
            } else {
                System.out.println("Type a number between 1 and 3!");
            }
        }
        InputReader.close(); //Apparently a resource risk when not closed
    }
}
