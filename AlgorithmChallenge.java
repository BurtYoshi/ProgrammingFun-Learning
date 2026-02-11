import java.util.*;
//SelectionTime appears to be running properly, moving onto numerical algorithms
public class AlgorithmChallenge {
    public static void main(String[] args) {
        //declaration of game variables
        int UserInput;
        String UserString;
        boolean SelectionTime = true;
        boolean FactorTime = false;
        boolean EvenTime = false;
        boolean VowelTime = false;
        boolean ReverseTime = false;
        //rest of boolean for other algorithms, all set to false
        Scanner InputReader = new Scanner(System.in);

        System.out.println("Welcome to the Algorithm Challenge!\n");
        System.out.println("1. Find Factors\n2. Find even digits");
        System.out.println("3. Hide vowels\n4. Reverse string");
        System.out.print("\nChoose a challenge from the list above: ");
        UserInput = InputReader.nextInt();

        while (SelectionTime) {
            //loop section of phase 1
            if (UserInput < 0 || UserInput > 4) {
                System.out.println("You have ended the game");
                System.out.println("Thank you for playing!");
                break;
            } else if (UserInput == 1) {
                System.out.println("Find factors has been chosen");
                FactorTime = true;
                break;
            } else if (UserInput == 2) {
                System.out.println("Find even digits has been chosen");
                EvenTime = true;
                break;
            } else if (UserInput == 3) {
                System.out.println("Hide vowels has been chosen");
                VowelTime = true;
                break;
            } else if (UserInput == 4) {
                System.out.println("Reverse string has been chosen");
                ReverseTime = true;
                break;
            }
            //initial instructions looped, don't know why Compu wants this
            System.out.println("\n1. Find Factors\n2. Find even digits");
            System.out.println("3. Hide vowels\n4. Reverse string");
            System.out.print("\nChoose a challenge from the list above: ");
            UserInput = InputReader.nextInt();
        }
        while (FactorTime) {
            //loop section of phase 2
            System.out.print("\nEnter a number: ");
            UserInput = InputReader.nextInt();

            //continue here
        }
        while (EvenTime) {
            System.out.print("\nEnter a number:");
            UserInput = InputReader.nextInt();
        }
        while (VowelTime) {
            System.out.print("\nEnter a vowel:");
            UserInput = InputReader.nextInt();
        }
        while (ReverseTime) {
            System.out.print("\nEnter a string:");
            UserString = InputReader.nextLine();

            for (int i = UserString.length(); i > 0; i--) {
                //start of loop likely required for this section
            }
        }
    }
}