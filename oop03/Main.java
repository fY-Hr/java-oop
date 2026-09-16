package oop03;

import oop04.Parent;
import oop04.Child;

public class Main {
    static void main(String[] args) {
        /*
         * 1. KONSEP DASAR POLIMORFISME (POLYMORPHISM)
         * Polimorfisme adalah kemampuan suatu objek untuk mengambil banyak bentuk.
         * Objek dengan tipe superclass (Employee) dapat diisi atau menampung
         * instansiasi dari subclass-nya (Engineer atau Manager).
         */

        // Dideklarasikan dengan tipe referensi Employee
        Employee pejuangRupiah = new Employee("Amar");

        // Dapat di-reassign dengan subclass Engineer (Polimorfisme)
        pejuangRupiah = new Engineer("Amar", "PT. Rupiah");
        // Selama method didefinisikan di superclass, method tersebut tetap dapat dipanggil
        pejuangRupiah.sayHello("Budi");

        // Dapat di-reassign kembali dengan subclass Manager
        pejuangRupiah = new Manager("Amin", "PT. Rupiah");
        pejuangRupiah.sayHello("Budi");


        /*
         * 2. POLIMORFISME PADA PARAMETER METHOD
         * Method sayHello menerima parameter bertipe Employee.
         * Karena Employee adalah superclass, method ini dapat menerima objek
         * dari Employee itu sendiri maupun subclass turunannya (Engineer, Manager).
         */
        sayHello(new Employee("Fakhry"));
        sayHello(new Engineer("Fakhry", "PT. Rupiah"));
        sayHello(new Manager("Fakhry", "PT. Rupiah"));


        /*
         * 3. PEMBUKTIAN ACCESS MODIFIER LINTAS PACKAGE (dari package oop04)
         * - Member tanpa access modifier (default / package-private) pada class Parent
         *   tidak dapat diakses dari package oop03.
         */
        // Parent contohParent = Parent.doIt(); // ERROR: doIt() bersifat package-private

        Child anakTiri = new Child();
        anakTiri.name = "Bambang"; // Dapat diakses karena field name pada Child bertipe public
        // anakTiri.doIt(); // ERROR: doIt() bersifat package-private di package oop04

        Parent orangTua = (Parent) anakTiri;
        // System.out.println(orangTua.name); // ERROR: name pada Parent bersifat default (package-private)
        // Catatan: Variable hiding juga berlaku pada konteks ini.
    }

    /*
     * 4. TYPE CHECK & CASTING PADA TIPE DATA NON-PRIMITIF
     * - 'instanceof' digunakan untuk memeriksa tipe objek asli saat runtime (Type Check).
     * - Casting operator '(TargetClass)' digunakan untuk mengonversi referensi ke tipe yang lebih spesifik.
     */
    static void sayHello(Employee employee) {
        if (employee instanceof Engineer) {
            // Type casting ke Engineer agar dapat mengakses properti/method spesifik Engineer
            Engineer tukang = (Engineer) employee;
            tukang.sayHello("Budi");
        } else if (employee instanceof Manager) {
            // Type casting ke Manager
            Manager manager = (Manager) employee;
            manager.sayHello("Budi");
        } else {
            System.out.println("Hello, " + employee.name);
        }
    }
}
