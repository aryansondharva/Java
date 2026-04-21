import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter you name:");

        // String name = sc.nextLine();

        // System.out.println("Hello " + name);

        System.out.println("Enter number 1: ");
        int a = sc.nextInt();

        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
    }
}