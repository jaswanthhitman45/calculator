import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        int choice = sc.nextInt();

        double result = 0;

        switch(choice) {
            case 1:
                result = a + b;
                System.out.println("Result: " + result);
                break;

            case 2:
                result = a - b;
                System.out.println("Result: " + result);
                break;

            case 3:
                result = a * b;
                System.out.println("Result: " + result);
                break;

            case 4:
                if(b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
