package oop04;

public class Main {
    static void main() {
        Child child = new Child();
        child.name = "Heru";
        child.doIt();
        System.out.println(child.name);

        /*
         * DEMONSTRASI PERBEDAAN: METHOD OVERRIDING vs VARIABLE HIDING
         *
         * Saat objek Child di-casting menjadi tipe referensi Parent:
         */
        Parent parent = (Parent) child; // Polimorfisme & Type Casting

        // 1. Method Overriding (Runtime Polymorphism):
        // Method doIt() yang dijalankan tetap implementasi milik Child ("Do it from child"),
        // karena pemanggilan method yang di-override dievaluasi berdasarkan instansiasi objek aslinya saat runtime.
        parent.doIt();

        // 2. Variable Hiding (Compile Time Resolution):
        // Output bernilai 'null', karena resolusi field ditentukan oleh tipe referensinya
        // (yaitu Parent), sehingga yang diakses adalah field Parent.name, bukan Child.name.
        System.out.println(parent.name);
    }
}
