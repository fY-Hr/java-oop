package oop03;

public class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("Hi " + name + ", My name is " + this.name);
    }
}


class Manager extends Employee {
    String company;

    Manager(String name){
        super(name);
    }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    @Override
    void sayHello(String name){
        System.out.println("Hi " + name + ", My name is manager " + this.name + (this.company != null ? " from " + this.company : ""));
    }
}

class Engineer extends Employee {
    String company;

    Engineer(String name, String company){
        super(name);
        this.company = company;
    }

    @Override
    void sayHello(String name){
        System.out.println("Hi " + name + ", My name is engineer " + this.name + (this.company != null ? " from " + this.company : ""));
    }
}