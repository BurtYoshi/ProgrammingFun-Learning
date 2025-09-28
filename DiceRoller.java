import java.util.Random;
import java.util.Scanner;
/*Future Features:
an infinite game until the user ends it (later development thing)
ability to roll multiple types of dice at the same time*/
public class DiceRoller {
    public static void main(String[] args) {
        //Declaration of the games default variables
        boolean AmountSelection = true; //Three booleans are phases of the game
        boolean SideSelection = true;
        boolean CalculationTime = true;
        int NumberOfDice = 1;
        int DiceSides = 6;
        int RollTotal;

        System.out.println("This is a basic dice roller machine, welcome :)");
        System.out.println("How many dice do you want to roll? (maximum of 100 dice)");
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
                InputReader.close();
                System.exit(0);
            }
            else if (UserInput > 100 || UserInput < 0) {
                System.out.println("\nPlease type an integer between 1 and 100");
                UserInput = InputReader.nextInt();
            }
            else if (0 < UserInput && UserInput <= 100) {
                NumberOfDice = UserInput;
                System.out.println("\nYou have chosen to roll " + NumberOfDice + " dice");
                System.out.println("Type '-1' to confirm decision and -2 to end the game");
                UserInput = InputReader.nextInt();
            }
        }
        //Intro to the second phase
        System.out.println("\nPhase two has been reached, selecting the number of sides on each dice");
        System.out.println("How many sides do you want each dice to have? (maximum of 100 sides)");
        UserInput = InputReader.nextInt();
        while (SideSelection) { //Start of the second phase of the game
            if (UserInput == -1) {
                System.out.println("You have confirmed your selection, it cannot be changed");
                SideSelection = false;
            }
            else if (UserInput == -2) {
                System.out.println("\nYou have chosen to end the game");
                System.out.println("Thank you for playing!");
                InputReader.close();
                System.exit(0);
            }
            else if (UserInput > 100 || UserInput < 0) {
                System.out.println("\nPlease type an integer between 1 and 100");
                UserInput = InputReader.nextInt();
            }
            else if (0 < UserInput && UserInput <= 100) {
                DiceSides = UserInput;
                System.out.println("\nYou have chosen to have " + DiceSides + " sides on each dice");
                System.out.println("Type '-1' to confirm decision and -2 to end the game");
                UserInput = InputReader.nextInt();
            }
        }
        //Intro to the third and final phase
        System.out.println("\nPhase three has been reached, the rolling must commence");
        Random TheRoller = new Random();
        while (CalculationTime) {
            RollTotal = 0;
            //Loop to roll all of the dice, has to be one at a time
            for (int i = 0; i < NumberOfDice; i++) {
                int roll = TheRoller.nextInt(DiceSides) + 1; //+1 because otherwise range is 0 - DiceSides
                RollTotal += roll;
                System.out.println("Die " + (i + 1) + ": " + roll);
            }
            System.out.println("\nThe result of rolling the " + NumberOfDice + " with " + DiceSides + " sides is...");
            System.out.println(RollTotal + " (" + NumberOfDice + "*" + DiceSides + ")");
            System.out.print("The average roll with these conditions: = ");
            System.out.print(NumberOfDice * (DiceSides / 2));
            CalculationTime = false;
        }
        System.out.println("Thank you for playing a dice game!");
    }
}