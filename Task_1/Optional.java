import java.util.Scanner;

public class Optional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs from user
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter distance: ");
        int distance = sc.nextInt();

        System.out.print("Is Java fun? (true/false): ");
        boolean isJavaFun = sc.nextBoolean();

        System.out.print("Enter value of pi: ");
        double pi = sc.nextDouble();

        // Calculations
        int sum = age + distance;
        boolean result = isJavaFun && (pi < 3.5);

        // Output
        System.out.println("\nSum of age and distance: " + sum);
        System.out.println("Is Java fun and pi < 3.5? " + result);

        sc.close();
    }
}
