class Person1 {
    Person1() {
        System.out.println("Person constructor called");
    }
}

class Employee extends Person1 {
    Employee() {
        System.out.println("Employee constructor called");
    }
}

class Manager extends Employee {
    Manager() {
        System.out.println("Manager constructor called");
    }
}

public class ConstructorChainingExample {
    public static void main(String[] args) {
        Manager m1 = new Manager();
    }
}

