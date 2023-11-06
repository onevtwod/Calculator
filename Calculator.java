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
        String delimiterPattern = "[+-*/]+"; 
        scanner.useDelimiter(delimiterPattern);
        System.out.print("Calculator:\n");
        while (scanner.hasNext()) {
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();
        }
        
        System.out.println("Answer: " + answer);
    }
}