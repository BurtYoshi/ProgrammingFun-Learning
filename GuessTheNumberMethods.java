import java.util.*;
public class GuessTheNumberMethods {
    public static void Introduction(int min, int max, int guesses) {
        System.out.println("Welcome to Guess The Number!");
        System.out.println("I've picked a number for you to guess\n");
        System.out.println("Typing -1 at any time will restart the game");
        System.out.println("Typing -2 at any time will end the game\n");
        System.out.println("The number is between " + min + " and " + max);
        System.out.println("You have " + (guesses) + " guesses left.");
        System.out.println("Enter guess number: ");
    } public int NumberGenerator(int min, int max) {
        Random randomizer = new Random();
        return randomizer.nextInt(max) + 1;
    } public static void ResetGame() {

    } public static void MinMaxRange() {

    } public int GetUserGuess(Scanner InputReader) {
        return InputReader.nextInt();
    } public static void WinExecution(int answer, int attempts) {

    } public static void ZeroGuesses(int answer) {

    } public static void main(String[] args) {
        GuessTheNumberMethods GTNM = new GuessTheNumberMethods();
        GTNM.Introduction(1, 100, 6);
        GTNM.NumberGenerator(1, 100);

        int Answer;
    }
}