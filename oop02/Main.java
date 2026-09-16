package oop02;

/**
 * oop02: Constructor & Constructor Overloading
 *
 * Aturan Java:
 * - Dalam satu file .java, hanya diperbolehkan ada maksimal satu class 'public',
 *   dan namanya harus sama persis dengan nama file.
 * - Class tambahan dalam file yang sama tidak boleh menggunakan modifier 'public'
 *   (menggunakan default / package-private).
 */
class Person {
    String name;
    int age;

    // 1. Constructor Utama:
    // Method khusus yang otomatis dijalankan saat objek pertama kali dibuat ('new').
    // Tidak memiliki return type (bahkan bukan void) dan namanya sama persis dengan nama class.
    Person(String name, int age) {
        // Kata kunci 'this' merepresentasikan instance objek saat ini.
        // Digunakan untuk membedakan antara field objek dan parameter method yang memiliki nama sama (variable shadowing).
        this.name = name;
        this.age = age;
    }

    // 2. Constructor Overloading:
    // Kemampuan membuat lebih dari satu constructor dalam satu class dengan parameter berbeda (jumlah/tipe data).
    Person(String name) {
        // 'this(...)' digunakan untuk memanggil constructor lain dalam class yang sama.
        // Pemanggilan ini harus menjadi baris instruksi pertama di dalam constructor.
        this(name, 0); // Memanggil Person(String, int)
    }

    // 3. Constructor tanpa parameter (default constructor versi kustom)
    Person() {
        this(null, 0); // Memanggil Person(String, int)
    }
}

public class Main {
    static void main() {
        // Memanggil constructor dengan 2 parameter: Person(String, int)
        Person orang = new Person("John", 20);
        System.out.println(orang.name + " " + orang.age);

        // Memanggil constructor tanpa parameter: Person()
        Person orang2 = new Person();
        orang2.name = "Bambang";
        System.out.println(orang2.name);

        // Membuat objek Kucing dari class yang berada di file Hewan.java (package yang sama)
        Kucing kucingBambang = new Kucing("Cici", orang2);
        kucingBambang.meow();
    }
}
