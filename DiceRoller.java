import java.util.Scanner;
/*Future Features:
ability to roll multiple types of die at once
dice sides defaults to 6 and number of dice defaults to 1
ability to roll up to 100 of each dice
an infinite game until the user ends it
a breakdown showing the math behind the final calculation (each die type added together) */
public class DiceRoller {
    public static void main(String[] args) {
        Scanner InputReader = new Scanner(System.in);
        System.out.println("How many dice should be rolled? (Max 100)");
        int DiceNumber = InputReader.nextInt();
            if (DiceNumber > 100 || DiceNumber <0) {
                System.out.println("Please choose a positive value equal or less than 100");
            } else {
                System.out.println(DiceNumber + " dice will be rolled");
            }
        System.out.println("How many sides should each dice have?");
    }
}
