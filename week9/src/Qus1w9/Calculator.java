package Qus1w9;

public class Calculator {
    // Addition method
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
    }

    // Subtraction method
    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }

    // Multiplication method
    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
    }

    // Division method
    public void division(int a, int b) {
        if (b != 0) {
            System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
        } else {
            System.out.println("Not divide by zero!");
        }
    }

    // Calculate result method
    public void calculateResult(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
        }
        System.out.println("Invalid symbol!");
    }
}
