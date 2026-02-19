import java.util.*;
//V1.1 update: (cleaning up and simplifying code further)
public class AlgorithmChallenge {
    public static void main(String[] args) {
        int UserInput = -1;
        boolean GameTime = true;
        boolean GameLooped = true;
        Scanner InputReader = new Scanner(System.in);
        System.out.println("Welcome to the Algorithm Challenge!");

        while (GameTime) {
            System.out.println("\n1. Find Factors\n2. Find Even Digits");
            System.out.println("3. Hide Vowels\n4. Reverse String");
            System.out.println("(Any other integer inputs will end the game)");
            System.out.print("\nChoose a challenge from the list above: ");
            UserInput = InputReader.nextInt();
            
            if (UserInput < 1 || UserInput > 4) {
                System.out.println("You chosen to end the game");
                GameTime = false;
            } else if (UserInput == 1) {
                System.out.println("Find factors has been chosen");
                System.out.print("\nEnter a number: ");
                UserInput = InputReader.nextInt();
                System.out.println("Factors: ");
                for (int i = 1; i <= UserInput; i++) {
                    if (UserInput % i == 0) {
                        System.out.print(i + ", ");
                    }
                }
            } else if (UserInput == 2) {
                System.out.println("Find even digits has been chosen");
                System.out.print("\nEnter a number: ");
                UserInput = InputReader.nextInt();
                System.out.print("Even digits: ");
                while (UserInput > 0) {
                    int Digit = UserInput % 10;
                    if (Digit % 2 == 0) {
                        System.out.print(Digit + ", ");
                    }
                    UserInput /= 10;
                }
            } else if (UserInput == 3) {
                System.out.println("Hide vowels has been chosen");
                System.out.print("Enter a string: ");
                InputReader.nextLine();
                String VowelString = InputReader.nextLine();
                VowelString = VowelString.replaceAll("[aeiou]", "x");
                VowelString = VowelString.replaceAll("[AEIOU]", "X");
                System.out.print("Result: " + VowelString);
            } else if (UserInput == 4) {
                System.out.println("Reverse string has been chosen");
                System.out.print("\nEnter a string: ");
                InputReader.nextLine();
                String ReverseString = "";
                String UserString = InputReader.nextLine();
                for (int i = UserString.length() - 1; i >= 0; i--) {
                    ReverseString += UserString.charAt(i);
                }
                System.out.print("Result: " + ReverseString);
            }
        }
        System.out.println("\nThank you for playing!");
        }
    }