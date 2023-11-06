import java.util.Scanner;

public class Calculator {
    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static int division(int number1, int number2) {
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator:");
        
        // Read the first number
        System.out.print("Enter the first number: ");
        int input1 = scanner.nextInt();

        // Read the operation (+, -, *, /)
        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.next();

        // Read the second number
        System.out.print("Enter the second number: ");
        int input2 = scanner.nextInt();

        int answer = 0;

        // Perform the corresponding operation based on user input
        switch (operation) {
            case "+":
                answer = addition(input1, input2);
                break;
            case "-":
                answer = subtraction(input1, input2);
                break;
            case "*":
                answer = multiplication(input1, input2);
                break;
            case "/":
                if (input2 != 0) {
                    answer = division(input1, input2);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }

        // Print the answer
        System.out.println("Answer: " + answer);
    }
}
