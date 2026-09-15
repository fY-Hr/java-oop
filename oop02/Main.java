package oop02;

// Jika ingin menambah class lain dalam 1 file yang sama maka classnya tidak boleh public
class Person {
    String name;
    int age;

    // ini adalah constructor, method yang akan dipanggil ketika membuat object
    Person(String name, int age){ // bisa memiliki parameter ataupun tidak
        // this merepresentasikan object yang sedang dibuat yaitu Person sendiri.
        this.name = name;
        this.age = age;
    }

    // constructor overloading
    // overloading adalah kemampuan membuat method dengan nama yang sama tetapi memiliki parameter yang berbeda
    Person(String name){
        // dengan menggunakan this() maka kita akan memanggil constructor pada line 9
        this(name, 0);

    }
    // disini bahkan tidak memiliki parameter sama sekali
    Person(){
        this(null, 0);
    }
}

public class Main {
    static void main(){
       // membuat person dengan argumen wajib
       Person orang = new Person("John", 20) ;
       System.out.println(orang.name + " " + orang.age);


       // jika kita tidak memiliki parameter sama sekali maka akan memanggil constructor tanpa parameter yang sudah dibuat
       Person orang2 = new Person();
       orang2.name = "Bambang";
       System.out.println(orang2.name);

       Kucing kucingBambang = new Kucing("Cici", orang2);
       kucingBambang.meow();
    }
}
