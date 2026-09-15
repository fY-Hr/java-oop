package oop01;

public class Person {
    // field or properties
    int age;
    String name;
    // immutable properties
    final String race = "Human";

    // method
    String greet(){
        return "Hello my name is " + name + "!";
    }

    String greetSomeone(String someone){
        return "Hello " + someone + ", my name is " + name + "!";
    }

    // static method
    static String greetStatic(){
        return "Hello from static method! You don't need to create an object to use this method";
    }
}
