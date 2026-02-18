import java.util.*;
//
public class AlgorithmChallenge {
    public static void main(String[] args) {
        int UserInput;
        String UserString;
        boolean GameTime = true;
        boolean GameLooped = false;
        Scanner InputReader = new Scanner(System.in);

        System.out.println("Welcome to the Algorithm Challenge!\n");
        System.out.println("1. Find Factors\n2. Find Even Digits");
        System.out.println("3. Hide Vowels\n4. Reverse String");
        System.out.print("\nChoose a challenge from the list above: ");
        UserInput = InputReader.nextInt();

            while (GameTime) {
                //new section to try and fix the instructions
                if (GameLooped) {
                    System.out.println("\n\n1. Find Factors\n2. Find Even Digits");
                    System.out.println("3. Hide Vowels\n4. Reverse String");
                    System.out.print("\nChoose a challenge from the list above: ");
                    UserInput = InputReader.nextInt();
                }
                if (UserInput < 1 || UserInput > 4) {
                    System.out.println("You have ended the game");
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
                    System.out.print("\nEnter a vowel:");
                    UserString = InputReader.nextLine();

                } else if (UserInput == 4) {
                    System.out.println("Reverse string has been chosen");
                    System.out.print("\nEnter a string:");
                    UserString = InputReader.nextLine();

                    for (int i = UserString.length(); i > 0; i--) {
                        //start of loop likely required for this section
                    }
                }
                GameLooped = true;
            }
        System.out.println("\nThank you for playing!");
        }
    }