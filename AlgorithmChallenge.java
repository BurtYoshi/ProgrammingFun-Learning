import java.util.*;
//add if statement to see if input is valid first then print instructions
//while loop does not properly loop, question is asked though
public class AlgorithmChallenge {
    public static void main(String[] args) {
        int UserInput;
        String UserString;
        boolean SelectionTime = true;
        boolean FactorTime = false;
        boolean EvenTime = false;
        boolean VowelTime = false;
        boolean ReverseTime = false;
        boolean Gaming = true;
        Scanner InputReader = new Scanner(System.in);

        System.out.println("Welcome to the Algorithm Challenge!\n");
        System.out.println("1. Find Factors\n2. Find Even Digits");
        System.out.println("3. Hide Vowels\n4. Reverse String");
        System.out.print("\nChoose a challenge from the list above: ");
        UserInput = InputReader.nextInt();

        while (Gaming) {
            while (SelectionTime) {
                if (UserInput < 1 || UserInput > 4) {
                    System.out.println("You have ended the game");
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
                System.out.println("\n1. Find Factors\n2. Find even digits");
                System.out.println("3. Hide vowels\n4. Reverse string");
                System.out.print("\nChoose a challenge from the list above: ");
                UserInput = InputReader.nextInt();
            }
            SelectionTime = false;
            while (FactorTime) { //loop is done
                System.out.print("\nEnter a number: ");
                UserInput = InputReader.nextInt();
                System.out.println("Factors: ");
                for (int i = 1; i <= UserInput; i++) {
                    if (UserInput % i == 0) {
                        System.out.print(i + ", ");
                    }
                }
                FactorTime = false;
            }
            while (EvenTime) {
                System.out.print("\nEnter a number:");
                UserInput = InputReader.nextInt();
                System.out.println("Even digits: ");
                while (UserInput > 0) {
                    int Digit = UserInput % 10;
                    if (Digit % 2 == 0) {
                        System.out.print(Digit + ", ");
                    }
                    UserInput /= 10;
                }
                SelectionTime = true;
                EvenTime = false;
            }
            while (VowelTime) {
                System.out.print("\nEnter a vowel:");
                UserString = InputReader.nextLine();

                VowelTime = false;
            }
            while (ReverseTime) {
                System.out.print("\nEnter a string:");
                UserString = InputReader.nextLine();


                for (int i = UserString.length(); i > 0; i--) {
                    //start of loop likely required for this section
                }
                ReverseTime = false;
            }
            System.out.println("\n\nChoose another algorithm from the list");
            UserInput = InputReader.nextInt();
        }
        System.out.println("\nThank you for playing!");
    }
}