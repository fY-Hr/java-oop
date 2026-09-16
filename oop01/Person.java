package oop01;

/**
 * Class Person merepresentasikan cetak biru (blueprint) untuk objek Person.
 */
public class Person {
    // Field / Properti / Atribut (variabel penyimpan data pada objek)
    int age;
    String name;

    // Field Immutable (konstanta):
    // Kata kunci 'final' membuat nilai field tidak dapat diubah setelah diinisialisasi
    final String race = "Human";

    // Method (fungsi atau perilaku yang melekat pada objek)
    String greet() {
        return "Hello my name is " + name + "!";
    }

    // Method dengan parameter
    String greetSomeone(String someone) {
        return "Hello " + someone + ", my name is " + name + "!";
    }

    // Static Method:
    // Method tingkat class, tidak terikat ke objek tertentu dan dapat dipanggil langsung dari nama class
    static String greetStatic() {
        return "Hello from static method! You don't need to create an object to use this method";
    }
}
