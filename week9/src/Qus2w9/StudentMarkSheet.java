package Qus2w9;

import java.util.Scanner;

public class StudentMarkSheet {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char choice;
    while (true) {
        System.out.print("Enter the student's marks (0-100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered. Please try again.");
        } else {
            String grade;

            if (marks >= 90) {
                grade = "A+";
            } else if (marks >= 80) {
                grade = "A";
            } else if (marks >= 70) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("The student's grade is: " + grade);
        }

        System.out.print("Do you want to calculate another student's grade? (Y/N): ");
        choice = sc.next().charAt(0);

        if (Character.toUpperCase(choice) == 'N') {
            break;
        }
    }

        sc.close();
    }
}
