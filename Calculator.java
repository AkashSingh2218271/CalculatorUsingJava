import java.util.Scanner;

class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
    
    public static int mod(int a, int b) {
        return a % b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int ch = 1, num1 = 0, num2 = 0;

        while (ch != 0) {
            System.out.println("Menu : \nEnter 1 for addition\nEnter 2 for subtraction\nEnter 3 for multiplication\nEnter 4 for division\nEnter 5 for modulus\nEnter 0 for exit\n");
            System.out.println("Enter your choice ");
            ch = sc.nextInt();

            if (ch != 0) {
                System.out.println("Enter value of num1 and num2 respectively ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
            }

            switch (ch) {
                case 1:
                    System.out.println("Addtion of " + num1 + " and " + num2 + " is " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + sub(num1, num2));
                    break;
                case 3:
                    System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Division of " + num1 + " and " + num2 + " is " + div(num1, num2));
                    break;
                case 5:
                    System.out.println("Modulus of " + num1 + " and " + num2 + " is " + mod(num1, num2));
                    break;
                case 0:
                    System.out.println("Exiting the calculator.");
                    break;
                default:
                    System.out.println("Enter a valid input.\n");
                    break;
            }
        }

        sc.close();
    }
}