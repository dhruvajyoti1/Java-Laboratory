class StudentsGrade {
    String name;
    int rollNo;
    int[] marks;

    StudentsGrade(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    double calculateAverage() {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 50) return 'C';
        else return 'D';
    }

    void display() {
        System.out.println("Student: " + name + " (Roll: " + rollNo + ")");
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 80};
        StudentsGrade s1 = new StudentsGrade("Rahul", 101, marks);
        s1.display();
    }
}
