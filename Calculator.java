import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Simple Calculator ===");
        System.out.println();

        while (true) {
            printMenu();
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Please choose a number from 1 to 5.");
                System.out.println();
                continue;
            }

            System.out.print("First number: ");
            double a = scanner.nextDouble();

            System.out.print("Second number: ");
            double b = scanner.nextDouble();

            if (choice == 4 && b == 0.0) {
                System.out.println("Cannot divide by zero.");
            } else {
                double result = calculate(choice, a, b);
                char op = getOperator(choice);
                System.out.printf("%.2f %c %.2f = %.2f%n", a, op, b, result);
            }

            System.out.println();
        }

        scanner.close();
    }

    static void printMenu() {
        System.out.println("Add\n");
        System.out.println("Subtract\n");
        System.out.println("Multiply\n");
        System.out.println("Divide\n");
        System.out.println("Exit\n");
    }

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

    static char getOperator(int choice) {
        switch (choice) {
            case 1: return '+';
            case 2: return '-';
            case 3: return '*';
            case 4: return '/';
            default: return ' ';
        }
    }
}