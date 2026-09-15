package oop03;

public class Main {
    static void main(String[] args){
        // ini adalah representasi dari polymorphism

        // di deklarasi dengan tipe Employee
        Employee pejuangRupiah = new Employee("Amar");

        // tapi bisa di reassign dengan tipe Engineer karna merupakan subclass dari Employee
        pejuangRupiah = new Engineer("Amar", "PT. Rupiah");
        // selama methodnya masih sama dengan method di superclass maka tetap bisa digunakan
        pejuangRupiah.sayHello("Budi");

        pejuangRupiah = new Manager("Amin", "PT. Rupiah");
        pejuangRupiah.sayHello("Budi");

        // method polymorphism
        sayHello(new Employee("Fakhry"));
        sayHello(new Engineer("Fakhry", "PT. Rupiah"));
        sayHello(new Manager("Fakhry", "PT. Rupiah"));
        // meskipun tipe data parameter adalah employee, tapi masih tetap bisa digunakan
    }

    static void sayHello(Employee employee){
        // type check & casting tipe data non primitif
        if (employee instanceof Engineer) { // typecheck menggunakan instanceof
            Engineer tukang = (Engineer) employee; // casting menggunakan casting operator
            tukang.sayHello("Budi");
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            manager.sayHello("Budi");
        } else {
            System.out.println("Hello, " + employee.name);
        }
    }
}
