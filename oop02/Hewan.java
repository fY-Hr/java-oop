package oop02;

public class Hewan {
    String name;
    Person owner;

    Hewan(String name, Person owner){
        this.name = name; // jika tidak menggunakan kata this, maka name yang akan di refer adalah name apda parameter
        this.owner = owner;
    }

    void makan(){
        System.out.println("makan apa aja");
    }

    // method private tidak akan bisa diakses dari luar class bahkan subclass
    private void tidur(){
        System.out.println("tidur");
    }
}

// kita bis amelakukan inheritance dengan menggunakan kata exntends
// ini akan mewarisi semua atribut dan method dari class Hewan
// di java, sebuah subclass atau child hanya bisa memiliki satu parent atau superclass
class Kucing extends Hewan {
    // karna Hewan memiliki constructor dengan parameter, maka kita harus memanggil constructor dari superclass
    Kucing(String name, Person owner){
        // serta mengisi parameter yang ada di constructor superclass
        super(name, owner);
    }

    void meow() {
       System.out.println("meow");
    }

    // method overriding
    // decorator override disini digunakan untuk menandakan bahwa method ini merupakan overriding dari method yang ada di superclass
    // jika tidak menggunakan pun juga bisa, tetapi jika ada salah ketik maka method akan dianggap sebagai method baru.
    // dengan decoator maka kesalahan ketik akan mengeluarkan error karna tidak sama dengan method yang ada di superclass
    @Override
    void makan(){
       System.out.println("makan wiskas");
    }

    void makanParent(){ // dengan menggunakan kata kunci super, maka method makan yang ada di superclass akan dijalankan
        super.makan();
    }
}
