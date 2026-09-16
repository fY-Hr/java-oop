package oop03;

// Superclass (Parent Class)
public class Employee {
    String name;

    // Constructor superclass
    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is " + this.name);
    }
}

// Subclass Manager yang mewarisi Employee
class Manager extends Employee {
    String company;

    Manager(String name) {
        // Memanggil constructor superclass
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    // Method overriding: mengubah implementasi method sayHello khusus untuk Manager
    @Override
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is manager " + this.name + (this.company != null ? " from " + this.company : ""));
    }
}

// Subclass Engineer yang mewarisi Employee
class Engineer extends Employee {
    String company;

    Engineer(String name, String company) {
        super(name);
        this.company = company;
    }

    // Method overriding: mengubah implementasi method sayHello khusus untuk Engineer
    @Override
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is engineer " + this.name + (this.company != null ? " from " + this.company : ""));
    }
}
