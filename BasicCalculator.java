import java.util.*;
import java.lang.Math;
//Version 0.2.1, addition of square root (2.0), bug fixes + square root only requires 1 input (2.1)
//Errors: None discovered :)
class BasicCalculator {
    private double add(double a, double b) {
        return a + b;
    } private double subtract(double a, double b) {
        return a - b;
    } private double multiply(double a, double b) {
        return a * b;
    } private double divide(double a, double b) {
        if (a == 0 || b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        } else {
            return a / b;
        }
    } private double sqrt(double a, double b) {
        return Math.sqrt(a) + Math.sqrt(b);
    }
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
        Scanner InputReader = new Scanner(System.in);
        boolean Loop = true;
        while (Loop) {
            String Operation = "";
            double UserInput1 = 0;
            double UserInput2 = 0;
            System.out.println("Current options: add, subtract, multiply, divide, square root");
            System.out.println("Format: \n(Operation) \n(1st input) \n(2nd input)");
            Operation = InputReader.nextLine();
            if (Operation.equalsIgnoreCase("quit")) {
                System.exit(1);
            } UserInput1 = InputReader.nextDouble();
            if (!Operation.equalsIgnoreCase("square root")) {
                UserInput2 = InputReader.nextDouble();
            }
            InputReader.nextLine();
            //switch statement for operations
            switch (Operation.toLowerCase()) {
                case "add":
                    System.out.println("Result: " + calc.add(UserInput1, UserInput2));
                    break;
                case "subtract":
                    System.out.println("Result: " + calc.subtract(UserInput1, UserInput2));
                    break;
                case "multiply":
                    System.out.println("Result: " + calc.multiply(UserInput1, UserInput2));
                    break;
                case "divide":
                    System.out.println("Result: " + calc.divide(UserInput1, UserInput2));
                    break;
                case "square root", "sqrt":
                    System.out.println("Result: " + calc.sqrt(UserInput1, UserInput2));
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}