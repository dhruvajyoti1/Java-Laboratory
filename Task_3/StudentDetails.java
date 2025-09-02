import java.util.Scanner;

class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks in Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter Marks in Subject 3: ");
        int m3 = sc.nextInt();

        // Processing
        int total = m1 + m2 + m3;
        double average = total / 3.0;

        // Output
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}

