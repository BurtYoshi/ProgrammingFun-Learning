import java.util.Scanner;
/*Future Features:
ability to roll multiple types of die at once
dice sides defaults to 6 and number of dice defaults to 1
ability to roll up to 100 of each dice
an infinite game until the user ends it
a breakdown showing the math behind the final calculation (each die type added together)
three phases of the game, # of sides, # of dice, and calculation period
(warn that once a period is finished, you cannot go back)
phases do not work properly, fix to where all paths end with going to next phase*/
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
            if (UserInput == -1) {
                //Write this towards the end when all conditions are created (for a loop)
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
                AmountSelection = false;
            }
        }
        while (SideSelection) { //Start of the second phase of the game
            System.out.println("\nPhase two has been reached");
            System.out.println("How many sides do you want each dice to have?");
            UserInput = InputReader.nextInt();
            if (UserInput == -1) {
                //Write this towards the end when all conditions are created (for a loop)
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
                System.out.println("\nYou have chosen to have " + DiceSides + " dice");
                SideSelection = false;
            }
        }
        while (CalculationTime) {

        }
    }
}