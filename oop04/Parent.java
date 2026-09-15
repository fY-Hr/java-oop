package oop04;

// pada file ini akan sedikit menjelaskan tentang variable hiding

public class Parent {
    String name;
    void doIt(){
        System.out.println("Do it from parent");
    }
}

// pada class child akan ada method overriding, tapi tidak ada yang namanya field overriding atau property overriding
class Child extends Parent{
    String name; // field ini tetap dimiliki oleh subclass,
    // tetapi jika nanti sebuah object child di type casting ke parent class, maka
    // field/property name yang dimiliki oleh child class akan di shadowing oleh parent class.
    // Hal ini disebabkan oleh akses field yang ditentukan oleh tipe referensi variable.
    // jika sebuah object child di type casting ke parent class, maka akses ke field/property name
    // yang dimiliki oleh child class akan mengarah ke parent class.
    // inilah mengapa @Override penting.

    void doIt(){ // overriding method doIt()
       System.out.println("Do it from child");
   }
}
