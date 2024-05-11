package Qus1w9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator ca = new Calculator();
        char choice;
        do {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.print("Please enter one of the symbols (+, -, *, /): ");
            char symbol = sc.next().charAt(0);

            ca.calculateResult(num1, num2, symbol);

            System.out.print("Would you like to do more calculations? (Y/N): ");
            choice = sc.next().charAt(0);
        } while (Character.toUpperCase(choice) == 'Y');

        sc.close();

    }
}
