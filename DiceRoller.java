import java.util.Scanner;
/*Future Features:
ability to roll multiple types of die at once
dice sides defaults to 6 and number of dice defaults to 1
ability to roll up to 100 of each dice
an infinite game until the user ends it
a breakdown showing the math behind the final calculation (each die type added together)
three phases of the game, # of sides, # of dice, and calculation period
(warn that once a period is finished, you cannot go back) */
public class DiceRoller {
    public static void main(String[] args) {
        //Declaration of the games default variables
        boolean SideSelection = true;
        int DiceNumber = 3;
        int DiceSides = 6;

        System.out.println("This is a basic dice roller machine, welcome :)");
        System.out.println("How many dice do you want to roll? (maximum of 100)");
        Scanner InputReader = new Scanner(System.in);
        int UserInput = InputReader.nextInt();
        while (SideSelection) {
            if (UserInput == -1) {
                //Write this towards the end when all conditions are created
            }
            else if (UserInput == -2) {
                System.out.println("You have chosen to end the game");
                System.out.println("Thank you for playing!");
                gameactive = false;
            }
            else if (UserInput > 100 || UserInput < 0) {
                System.out.println("Please type an integer between 1 and 100");
                UserInput = InputReader.nextInt();
            }
            else if () {

            }
        }
    }
}