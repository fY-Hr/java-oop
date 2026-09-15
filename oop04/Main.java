package oop04;

public class Main {
    static void main(){
        Child child = new Child();
        child.name = "Heru";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child; // plymorphism
        parent.doIt(); // akan menggunakan method yang di override karna child mengoverride method doIt()
        System.out.println(parent.name); // null, karena field yang diakses adalah field dari superclass berdasarkan tipe datanya.
    }
}
