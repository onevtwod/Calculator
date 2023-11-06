import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String input = scanner.nextLine();

        try {
            double result = evaluateExpression(input);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: Invalid expression");
        }
    }

    public static double evaluateExpression(String expression) {
        String[] tokens = expression.split(" ");
        double operand1 = Double.parseDouble(tokens[0]);
        double operand2 = Double.parseDouble(tokens[2]);
        String operator = tokens[1];
        double result = 0.0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        return result;
    }
}
