class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() { // public so it's callable across packages too
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    Teacher(String name, int age, String subject, double salary) {
        super(name, age); // call parent constructor
        this.subject = subject;
        this.salary = salary;
    }

    public void displayTeacher() {
        displayPerson();  // reuse parent method
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alice", 30, "Math", 45000);
        t1.displayTeacher();
    }
}
