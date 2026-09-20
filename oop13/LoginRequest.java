package oop13;

/*
    RECORD CLASS
    kita sering membuat class yang isinya hanya berisi data, dan getter, equals, hashCode, dan toString.
    Record class digunakan untuk mempermudah pembuatan class jenis tersebut.

    Saat kita membuat record class, java akan membuatkan constructor, getter, equals, hashCode,
    dan juga toString method secara otomatis

    Saat membuat record class, secara otomatis juga kita melakukan extends
    terhadap java.lang.Record class. Artinya, kita tidak bisa melakukan extends class lain, tapi
    bisa melakukan implements interface.
 */


// constructor pada record class berada di parameternya.
public record LoginRequest(String username, String password) {
    // jika kita ingin melakukan sesuatu dengan constructor, kita bisa menambahkan compact constructor
    // perbedaannya dengan constructor biasa adalah, compact constructor tidak bisa memiliki parameter
    public LoginRequest {
        System.out.println("ini adalah compact constructor");
    }

    // kita juga bisa melakukan constructor overloading, tetapi
    // wajib memanggil constructor utamanya dengan keyword this
    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }

    // untuk member, kita hanya bisa memiliki method
    void sayHello() {
        System.out.println("Hello " + this.username);
    }

    // int x = 10; jika kita menambahkan field maka akan error
}
