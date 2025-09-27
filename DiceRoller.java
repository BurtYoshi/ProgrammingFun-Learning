import java.util.Scanner;
/*Future Features:
ability to roll multiple types of die at once
an infinite game until the user ends it
a breakdown showing the math behind the final calculation (each die type added together) */
public class DiceRoller {
    public static void main(String[] args) {
        //Declaration of the games default variables
        boolean AmountSelection = true; //Three booleans are phases of the game
        boolean SideSelection = true;
        boolean CalculationTime = true;
        int NumberOfDice;
        int DiceSides;
        int RollTotal;

        System.out.println("This is a basic dice roller machine, welcome :)");
        System.out.println("How many dice do you want to roll? (maximum of 100)");
        Scanner InputReader = new Scanner(System.in);
        int UserInput = InputReader.nextInt();
        while (AmountSelection) { //Start of the first phase of the game
            if (UserInput == -1) { //Confirmation block, sends the code to the next loop afterwards
                System.out.println("You have confirmed your selection, it cannot be changed");
                AmountSelection = false;
            }
            else if (UserInput == -2) {
                System.out.println("\nYou have chosen to end the game");
                System.out.println("Thank you for playing!");
                System.exit(0);
            }
            else if (UserInput > 100 || UserInput < 0) {
                System.out.println("\nPlease type an integer between 1 and 100");
                UserInput = InputReader.nextInt();
            }
            else if (0 < UserInput && UserInput < 100) {
                NumberOfDice = UserInput;
                System.out.println("\nYou have chosen to roll " + NumberOfDice + " dice");
                System.out.println("Type '-1' to confirm decision and -2 to end the game");
                UserInput = InputReader.nextInt();
            }
        }
        //Intro to the second phase
        System.out.println("\nPhase two has been reached, selecting the number of sides on each dice");
        System.out.println("How many sides do you want each dice to have?");
        UserInput = InputReader.nextInt();
        while (SideSelection) { //Start of the second phase of the game
            if (UserInput == -1) {
                System.out.println("You have confirmed your selection, it cannot be changed");
                SideSelection = false;
            }
            else if (UserInput == -2) {
                System.out.println("\nYou have chosen to end the game");
                System.out.println("Thank you for playing!");
                System.exit(0);
            }
            else if (UserInput > 100 || UserInput < 0) {
                System.out.println("\nPlease type an integer between 1 and 100");
                UserInput = InputReader.nextInt();
            }
            else if (0 < UserInput && UserInput < 100) {
                DiceSides = UserInput;
                System.out.println("\nYou have chosen to have " + DiceSides + " sides on each dice");
                System.out.println("Type '-1' to confirm decision and -2 to end the game");
                UserInput = InputReader.nextInt();
            }
        }
        //Intro to the third and final phase
        System.out.println("\nPhase three has been reached, the rolling must commence");
        System.out.println("Tell the programmer to make the code, it does not exist");
        System.out.println("Fourth wall break :)"); //Delete this and the proceeding line
        UserInput = InputReader.nextInt();
        while (CalculationTime) { //Different from first two phases, use RollTotal as final answer
            /*if (UserInput == -1)*/ {

            }
        }
    }
}