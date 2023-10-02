import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    static void add(float num1, float num2) {
        System.out.printf("the sum of %f and %f is %f", num1, num2, num1 + num2);
    }

    static void subtract(float num1, float num2) {
        System.out.printf("the difference of %f and %f is %f", num1, num2, num1 - num2);
    }

    static void multiply(float num1, float num2) {
        System.out.printf("the product of %f and %f is %f", num1, num2, num1 * num2);
    }

    static void divide(float num1, float num2) {
        System.out.printf("the quotient of %f and %f is %f ", num1, num2, num1 / num2);
    }

    public static void main(String[] args) {
        int choice;
        float num1, num2;
        boolean exit = false;
        while (true) {
            System.out.print("enter num1:");
            num1 = scanner.nextInt();
            System.out.print("enter num2:");
            num2 = scanner.nextInt();
            System.out.println("Enter");
            System.out.println("1 to add ");
            System.out.println("2 to subtract");
            System.out.println("3 to multiply");
            System.out.println("4 to divide");
            System.out.println("5 to exit");
            System.out.print("enter your choice:");
            choice = scanner.nextInt();
            if (!(choice >= 1 && choice <= 5)) {
                System.out.println("\n !! Enter a valid choice !!\n");
                continue;
            }
            switch (choice) {
                case 1:
                    add(num1, num2);

                    break;
                case 2:
                    subtract(num1, num2);
                    break;
                case 3:
                    multiply(num1, num2);

                    break;
                case 4:
                    divide(num1, num2);

                    break;
                case 5:
                    exit = true;
            }
            if (exit) {
                break;
            }
        }
    }
}
