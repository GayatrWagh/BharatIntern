import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        double num1, num2;
        
        do {
            System.out.print("Enter operator (+, -, *, /) or 'q' to quit: ");
            operator = scanner.next().charAt(0);
            
            if (operator == 'q') {
                break;
            }
            
            System.out.print("Enter two numbers: ");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            
            switch(operator) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please try again.");
            }
            
        } while (true);
        
        System.out.println("Goodbye!");
        scanner.close();
    }
}
