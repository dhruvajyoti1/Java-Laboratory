import java.util.Arrays;

class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    // Constructor
    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Calculate average marks
    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    // Determine grade based on average
    public char getGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }

    // Print result
    public void printResult() {
        System.out.println("Student: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + getGrade());
        System.out.println("-------------------------");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, new int[]{95, 88, 92});
        Student s2 = new Student("Bob", 102, new int[]{70, 65, 60});
        Student s3 = new Student("Charlie", 103, new int[]{45, 50, 42});
        Student s4 = new Student("David", 104, new int[]{30, 25, 40});

        s1.printResult();
        s2.printResult();
        s3.printResult();
        s4.printResult();
    }
}
