package oop07;

/*
    Interface
    semua method yang ada di dalam interface akan
    bersifat public abstract secara default.

    kecuali untuk method default dan static.
    'default' disini juga merupakan access modifier.

    jika ingin mendeklarasi field/properti di dalamnya
    hanya bisa bersifat konstanta (final) dan akan secara
    default menjadi public static final.


    Interface cocok digunakan ketika kita ingin mendefinisikan
    kontrak atau kemampuan yang dapat dimiliki oleh berbagai class.
    Abstract class lebih cocok ketika beberapa class memiliki hubungan
    yang erat dan perlu berbagi state atau implementasi.
    Jadi interface tidak selalu "lebih baik" atau "lebih sering"
    daripada abstract class. Keduanya memiliki tujuan yang berbeda.


    ada pengecualian tidak perlu override pada static method dan default method
    pada interface. Static method dan default method pada interface
    tidak menjadi kontrak yang harus diimplementasi oleh subclassnya.

    penggunaan static juga merepresentasikan bahwa method
    tersebut adalah milik interface atau class itu sendiri,
    jadi static method tidak bisa dioverride
*/

/*
    public, default (pada saat tidak menuliskan apa apa), private, protected adalah access modifier,
    static, abstract dan final adalah non-access modifier.

    urutan penulisan biasanya diawali dengan access modifier,
    kemudian non-access modifier, dan terakhir tipe data dan nama method/field.
*/

interface JapaneseCar {
    void starterVoice();
}

interface Vehicle {
    String ENGINE_TYPE = "Chrome V8 ENGINE";
}

// Jika interface ingin mewarisi interface lain, maka bisa menggunakan extends ke interface lain.
public interface Car extends Vehicle {
    // Contoh field:
    int MAX_SPEED = 200;
    // sama dengan:
    // public static final int MAX_SPEED = 200;
    // static field masih bisa diwariskan ke class yang mengimplementasikan interface Car.

    // Contoh method:
    void drive();
    // sama dengan:
    // public abstract void drive();

    int getTier();

    // ini adalah contoh default method, bukan default (tidak menuliskan apa apa)
    // ini khusus ada di interface, memungkinkan untuk membuat method yang memiliki blok kode dan tidak abstrak
    default boolean driftingAbility(){
        return false;
    }
    // ini adalah method yang bukan abstract dan tidak perlu di override
    // oleh class yang mengimplementasikan interface Car.
    // mengapa ada ini? karna jika sudah banyak sekali class yang mengimplementasikan
    // interface ini, akan sangat sulit jika tiba2 ada penambahan method baru.

    // ini hanya dimiliki oleh interface Car,
    // jika class yang mengimplementasikan Car juga membuat method dengan
    // nama yang sama, maka method tersebut adalah
    // sepenuhnya milik class yang mengimplementasikan interface Car.
    static void info(){
        System.out.println("Car interface");
    }

    // jika dalam class, static method bisa diwariskan ke subclass
    // dan jika subclass dari class tsb mendeklaraasikan static method
    // yang namanya sama, maka akan disebut method hiding.
    // ini hanya berlaku pada STATIC METHOD, dan tidak ke method biasa.

}


