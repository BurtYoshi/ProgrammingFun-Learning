import java.util.*;
//figure out why the initial instructions are repeating themselves
public class AlgorithmChallenge {
    public static void main(String[] args) {
        //declaration of game variables
        int UserInput;
        boolean SelectionTime = true;
        boolean AlgorithmTime = true;
        Scanner InputReader = new Scanner(System.in);

        System.out.println("Welcome to the Algorithm Challenge!\n");
        System.out.println("1. Find Factors\n2. Find even digits");
        System.out.println("3. Hide vowels\n4. Reverse string");
        System.out.println("\nChoose a challenge from the list above: ");
        UserInput = InputReader.nextInt();

        while (SelectionTime) {
            //initial instructions looped
            System.out.println("\n1. Find Factors\n2. Find even digits");
            System.out.println("3. Hide vowels\n4. Reverse string");
            System.out.println("\nChoose a challenge from the list above: ");
            //main actual part of intro phase
            if (UserInput == 1) {
                System.out.println("Find factors has been chosen");
                UserInput = InputReader.nextInt();
            } else if (UserInput == 2) {
                System.out.println("Find even digits has been chosen");
                UserInput = InputReader.nextInt();
            } else if (UserInput == 3) {
                System.out.println("Hide vowels has been chosen");
                UserInput = InputReader.nextInt();
            } else if (UserInput == 4) {
                System.out.println("Reverse string has been chosen");
                UserInput = InputReader.nextInt();
            } else if (UserInput < 0 || UserInput > 4) {
                System.out.println("Only inputs 1-4 are accepted");
                System.out.println("You have ended the selection phase");
                SelectionTime = false;
            }
        }
        while (AlgorithmTime) {
            System.out.println("Phase two reached");
            AlgorithmTime = false;
        }
    }
}