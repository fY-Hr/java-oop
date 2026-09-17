package oop08;

import java.util.Objects;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    // toString() digunakan sebagai representasi object dalam bentuk String.
    // Jika object diberikan kepada println(), maka println() akan
    // memanggil method toString() dari object tersebut.
    @Override
    public String toString(){
        return "Product name: " + this.name + ", price: " + this.price;
    }

    // equals() digunakan untuk menentukan apakah dua object
    // dianggap sama berdasarkan nilai/data yang dimilikinya.
    //
    // Secara default, equals() dari class Object membandingkan
    // apakah dua reference menunjuk ke object yang sama.
    // Kita override equals() agar Product dapat dibandingkan
    // berdasarkan name dan price.
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;

        // Jika obj bukan instance dari Product, maka object tersebut
        // tidak mungkin dianggap sama dengan Product ini.
        if(!(obj instanceof Product)) return false;

        // Setelah dipastikan bahwa obj merupakan Product,
        // kita dapat melakukan casting dari Object menjadi Product.
        Product product = (Product) obj;

        if(price != product.price) return false;

        return name != null
                ? name.equals(product.name)
                : product.name == null;
    }

    // hashCode() menghasilkan sebuah nilai integer yang disebut hash code.
    //
    // hashCode() terutama digunakan oleh struktur data berbasis hash,
    // seperti HashMap dan HashSet, untuk menentukan bucket
    // tempat sebuah object dikelompokkan.
    //
    // hashCode() BUKAN ID unik dari object.
    // Dua object yang berbeda boleh memiliki hashCode yang sama.
    // Kondisi ketika dua object memiliki hashCode yang sama disebut
    // hash collision.
    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + price;
        return result;
    }

    /*
        Hubungan equals() dengan hashCode():

        1. Jika dua object dianggap sama oleh equals(),
           maka hashCode() dari kedua object tersebut HARUS sama.

               a.equals(b) == true
                       ↓
               a.hashCode() == b.hashCode()

        2. Jika dua object tidak sama menurut equals(),
           hashCode() mereka BOLEH sama.

               a.equals(b) == false
                       ↓
               hashCode() boleh sama atau berbeda

           Jika hashCode mereka sama tetapi equals() false,
           kondisi tersebut disebut hash collision.

        3. Jika hashCode() dua object berbeda,
           maka kedua object tersebut PASTI tidak sama
           menurut equals().

               a.hashCode() != b.hashCode()
                       ↓
               a.equals(b) == false


        Secara sederhana:

            hashCode() → menentukan kelompok/bucket
            equals()   → memastikan apakah object benar-benar sama


        Karena equals() pada Product membandingkan name dan price,
        maka hashCode() juga harus menggunakan name dan price.

            equals()
            ├── name
            └── price

            hashCode()
            ├── name
            └── price


        Jangan menganggap hashCode() sebagai nilai unik.
        Hash code hanya membantu struktur data berbasis hash
        menemukan object dengan lebih efisien.
    */
}
