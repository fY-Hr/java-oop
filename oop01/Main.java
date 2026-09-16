package oop01;

/**
 * oop01: Dasar-Dasar Pemrograman Berorientasi Objek (OOP)
 * - Mengenal Class, Object, Field (Properti), dan Method.
 * - Class dalam package yang sama tidak memerlukan pernyataan 'import'.
 */
public class Main {
   public static void main(String[] args) {
      // 1. Instansiasi objek pertama menggunakan operator 'new'
      Person person = new Person();

      // Manipulasi Field / Properti objek:
      // Hanya dapat diubah jika field tidak bersifat 'final' dan memiliki hak akses yang sesuai (bukan private).
      person.name = "John";
      person.age = 29;

      // 2. Deklarasi variabel referensi terlebih dahulu, lalu instansiasi objek
      Person person1;
      person1 = new Person();
      person1.name = "Hill";
      person1.age = 25;

      // 3. Menggunakan kata kunci 'var' (Type Inference):
      // Tipe data variabel otomatis ditentukan oleh compiler berdasarkan nilai inisialisasinya (tipe Person).
      var person2 = new Person();
      person2.name = "Alex";
      person2.age = 21;

      // Menampilkan informasi objek (mencetak referensi memori bawaan toString())
      System.out.println(person);
      System.out.println(person.greet());
      System.out.println(person.race);
      System.out.println(person.greetSomeone("Jane"));

      System.out.println(person1);
      System.out.println(person1.greet());

      System.out.println(person2);
      System.out.println(person2.greet());

      // Static Method:
      // Method milik class Person itu sendiri, sehingga dapat dipanggil langsung tanpa perlu membuat objek.
      System.out.println(Person.greetStatic());
   }
}

