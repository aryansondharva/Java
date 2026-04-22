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



// import java.util.Scanner;  // bring Scanner tool into your file
// javaScanner sc = new Scanner(System.in);  // sc = your keyboard listener
// javaSystem.out.println("Enter number 1: ");  // show message to user
// int a = sc.nextInt();  // wait for user to type, store in 'a'
// javaSystem.out.println("Enter number 2: ");
// int b = sc.nextInt();  // store second number in 'b'
// javaSystem.out.println("Sum = " + (a + b));  // print result