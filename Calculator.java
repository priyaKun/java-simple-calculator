import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Simple Calculator ===");

        boolean running = true;

        // Milestones 1, 2, and 5: Menu loop, input handling, and exit condition
        while (running) {
            printMenu();
            System.out.print("Enter your choice (1-5): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.\n");
                scanner.next(); // Clear non-integer input
                continue;
            }

            int choice = scanner.nextInt();

            // Milestone 5: Exit option
            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                running = false;
                continue;
            }

            // Milestone 5: Handling wrong choices
            if (choice < 1 || choice > 5) {
                System.out.println("Error: Option out of range. Choose between 1 and 5.\n");
                continue;
            }

            // Milestone 2: Read two operands
            System.out.print("Enter first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid number. Try again: ");
                scanner.next();
            }
            double a = scanner.nextDouble();

            System.out.print("Enter second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid number. Try again: ");
                scanner.next();
            }
            double b = scanner.nextDouble();

            // Milestone 4: Division by zero check & calculation
            if (choice == 4 && b == 0) {
                System.out.println("Error: Division by zero is undefined.\n");
            } else {
                double result = calculate(choice, a, b);
                System.out.printf("Result: %.2f%n%n", result);
            }
        }

        scanner.close();
    }

    // Milestone 1: Print the options
    static void printMenu() {
        System.out.println("-------------------------");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.println("-------------------------");
    }

    // Milestone 3: Perform calculation using a switch statement
    static double calculate(int choice, double a, double b) {
        switch (choice) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                return 0;
        }
    }
}