import java.util.Scanner;
/*Future Features:
An if statement with else ifs to have all possible options that ends in rolling the dice
allow multiple types of dice to be rolled and show the math calculations that happen
 */
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
