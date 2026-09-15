package oop01;

// Basic oop
// Melingkup field / properties, dan method.
// if it's on the same package, we don't need to import it

public class Main {
   public static void main(String[] args) {
      Person person = new Person();
      // field or properties manipulation
      // only available for non-final fields and if the field is not private
      person.name = "John";
      person.age = 29;

      Person person1;
      person1 = new Person();
      person1.name = "Hill";
      person1.age = 25;

      var person2 = new Person(); // auto casting to Person type
      person2.name = "Alex";
      person2.age = 21;

      System.out.println(person);
      System.out.println(person.greet());
      System.out.println(person.race);
      System.out.println(person.greetSomeone("Jane"));
      System.out.println(person1);
      System.out.println(person1.greet());
      System.out.println(person2);
      System.out.println(person2.greet());

      // the greeStatic is a static method, and static method belonged to the Person class, so you can use it without creating an object
      System.out.println(Person.greetStatic());
   }
}

