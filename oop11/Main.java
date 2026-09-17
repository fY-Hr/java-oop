package oop11;

public class Main {

    static void main(String[] args) {

        // =========================================================
        // INNER CLASS
        // =========================================================

        // Berikut cara membuat object dari inner class.
        Company mayora = new Company();

        mayora.setName("Mayora");

        // Karena Employee adalah inner class dari Company,
        // kita membuat object Employee melalui object Company.
        //
        // Company.Employee
        //      ↑
        //      tipe dari object
        //
        // mayora.new Employee()
        //      ↑
        //      membuat object Employee yang terhubung
        //      dengan object Company "mayora"

        Company.Employee employee = mayora.new Employee();

        employee.setName("John Doe");

        System.out.println(employee.getCompany());


        // =========================================================
        // ANONYMOUS CLASS
        // =========================================================

        /*
            Anonymous class adalah class yang tidak memiliki nama.

            Contoh:

            ISO fakeIso = new ISO() {

                @Override
                public void isoType() {
                    System.out.println("Fake ISO License");
                }

                @Override
                public void requirements() {
                    System.out.println("Just be fake");
                }
            };

            Di sini kita membuat object dari anonymous class
            yang mengimplementasikan interface ISO.

            Anonymous class biasanya digunakan ketika kita
            membutuhkan implementation sederhana yang hanya
            digunakan pada tempat tertentu.
        */


        /*
            Misalnya:

            ISO fakeIso = new ISO() {
                ...
            };

            fakeIso.isoType();

            Selama fakeIso adalah local variable di dalam main(),
            variable tersebut hanya bisa digunakan di dalam scope main().

            Jadi yang membatasi aksesnya di sini adalah
            SCOPE VARIABLE, bukan karena anonymous class
            "hilang" setelah blok selesai.

            Object anonymous class tersebut tetap merupakan object,
            tetapi reference "fakeIso" hanya dapat digunakan
            selama scope variable tersebut masih berlaku.
        */


        // =========================================================
        // INSTANCE FIELD DAN INSTANCE METHOD
        // =========================================================

        // fakeIso yang didefinisikan di bawah adalah instance field.
        //
        // Karena fakeIso adalah instance field, setiap object Main
        // memiliki field fakeIso miliknya sendiri.
        //
        // Untuk menggunakan instance field dan instance method Main,
        // kita membutuhkan object Main itu sendiri:

        Main main = new Main();

        main.testIso(); // disini kita bisa menggunakan instance field dan instance method Main


        // =========================================================
        // MENGAPA Main BISA MEMBUAT OBJECT Main?
        // =========================================================

        // Java memperbolehkan sebuah class membuat object
        // dari class itu sendiri.
        //
        // Main adalah sebuah TYPE.
        //
        // Karena Main merupakan type yang valid, kita dapat menulis:
        //
        // Main main = new Main();
        //
        // Bahkan jika kode tersebut berada di dalam class Main sendiri.
        //
        // Yang perlu dibedakan:
        //
        // Main
        //  ↑
        //  class / type
        //
        // new Main()
        //  ↑
        //  membuat object dari type Main
        //
        // main
        //  ↑
        //  reference yang menunjuk ke object tersebut, dan namanya bisa apa saja.


        // =========================================================
        // OBJECT DAN METHOD
        // =========================================================

        // Ketika kita membuat object:
        //
        // Main main = new Main();
        //
        // secara konseptual:
        //
        // Class Main
        // │
        // ├── testIso()
        // │      ↑
        // │      satu method yang didefinisikan pada class
        // │
        // └── object (new Main())
        //      └── fakeIso
        //             ↑
        //             field instance milik object
        //
        //
        // PENTING:
        //
        // testIso() TIDAK dibuat ulang atau dicopy
        // untuk setiap object.
        //
        // Jika kita membuat:
        //
        // Main main1 = new Main();
        // Main main2 = new Main();
        //
        // maka:
        //
        // main1 dan main2 memiliki fakeIso masing-masing,
        // tetapi keduanya menggunakan method testIso()
        // yang sama yang didefinisikan pada class Main.


        // =========================================================
        // INSTANCE METHOD
        // =========================================================

        // testIso() adalah instance method karena tidak menggunakan
        // keyword static.
        //
        // Karena merupakan instance method, method tersebut
        // memiliki konteks object ketika dipanggil.
        //
        // Contoh:
        //
        // main.testIso();
        //
        // Secara konseptual, ketika testIso() dijalankan:
        //
        // this = main
        //
        // sehingga:
        //
        // fakeIso.isoType();
        //
        // dapat dipahami sebagai:
        //
        // this.fakeIso.isoType();
        //
        // Artinya, gunakan fakeIso yang dimiliki
        // oleh object yang sedang menjalankan method tersebut.


        // =========================================================
        // STATIC METHOD
        // =========================================================

        // Berbeda dengan instance method, static method
        // merupakan member yang dimiliki oleh CLASS,
        // bukan oleh object tertentu.
        //
        // Contoh:
        //
        // Main.someStaticMethod();
        //
        // Kita tidak membutuhkan object Main untuk memanggilnya.
        //
        // Karena static method tidak memiliki konteks object
        // (tidak memiliki this), static method tidak dapat
        // mengakses instance field secara langsung.
        //
        // Contoh:
        //
        // static void testIso() {
        //     fakeIso.isoType(); // ERROR
        // }
        //
        // Kenapa?
        //
        // fakeIso adalah instance field.
        //
        // Jika terdapat:
        //
        // Main main1 = new Main();
        // Main main2 = new Main();
        //
        // maka terdapat:
        //
        // main1.fakeIso
        // main2.fakeIso
        //
        // Jika kita memanggil:
        //
        // Main.testIso();
        //
        // Java tidak tahu harus menggunakan fakeIso milik
        // object yang mana.
        //
        // Oleh karena itu static method tidak bisa
        // mengakses instance field secara langsung.


        // =========================================================
        // STATIC MEMBER DAN INHERITANCE
        // =========================================================

        // Static member dapat diwariskan oleh subclass,
        // tetapi cara kerjanya berbeda dengan instance member.
        //
        // Static member tetap merupakan member milik CLASS,
        // bukan milik object.
        //
        // Contoh:
        //
        // class Parent {
        //     static String name = "Parent";
        //
        //     static void hello() {
        //         System.out.println("Hello");
        //     }
        // }
        //
        // class Child extends Parent {
        // }
        //
        // Child dapat mengakses:
        //
        // Child.name;
        // Child.hello();
        //
        // Tetapi static member tersebut tetap berasal dari
        // class Parent.
        //
        // Tidak berarti setiap object Child memiliki salinan
        // name dan hello() sendiri.
        //
        //
        // Secara konseptual:
        //
        // Parent
        // ├── static name
        // └── static hello()
        //
        // Child
        // └── mewarisi akses terhadap static member Parent
        //
        //
        // Jadi:
        //
        // STATIC MEMBER
        //     ↓
        // dapat diwariskan / diakses oleh subclass
        //     ↓
        // tetapi tetap merupakan member milik CLASS
        //
        //
        // Jangan menyimpulkan:
        //
        // "static tidak diwariskan"
        //
        // Lebih tepat:
        //
        // "Static member dapat diwariskan oleh subclass,
        // tetapi static member tetap terkait dengan class,
        // bukan dengan instance."


        // =========================================================
        // STATIC VS INSTANCE
        // =========================================================

        // INSTANCE:
        //
        // Main main = new Main();
        // main.testIso();
        //
        // testIso() adalah instance method.
        //
        // Method tersebut dijalankan dalam konteks
        // object main.


        // STATIC:
        //
        // Main.someStaticMethod();
        //
        // someStaticMethod() adalah static method.
        //
        // Method tersebut dijalankan dalam konteks
        // class Main dan tidak membutuhkan object.


        // =========================================================
        // STATIC MEMBER BISA DIAKSES MELALUI OBJECT,
        // TETAPI TIDAK DIREKOMENDASIKAN
        // =========================================================

        // Java secara teknis mengizinkan static member
        // diakses melalui object:
        //
        // Main main = new Main();
        // main.someStaticMethod();
        //
        // Tetapi ini misleading karena static method
        // sebenarnya tidak dimiliki oleh object tersebut.
        //
        // Lebih baik:
        //
        // Main.someStaticMethod();
        //
        // Karena menunjukkan bahwa method tersebut
        // merupakan member dari class.


        // =========================================================
        // KESIMPULAN
        // =========================================================

        // INSTANCE MEMBER
        //
        // - dimiliki oleh object
        // - membutuhkan object untuk digunakan
        // - setiap object memiliki state/field instance sendiri
        // - instance method memiliki konteks "this"
        //
        //
        // STATIC MEMBER
        //
        // - dimiliki oleh class
        // - tidak membutuhkan object untuk digunakan
        // - tidak memiliki konteks "this"
        // - dapat mengakses static member secara langsung
        // - tidak dapat mengakses instance member secara langsung
        // - dapat diwariskan / diakses oleh subclass
        // - tetap merupakan member milik class


        // =========================================================
        // MENTAL MODEL
        // =========================================================

        // CLASS
        //
        // Main
        // │
        // ├── static member
        // │      ↑
        // │      milik class
        // │
        // └── instance member
        //        ↑
        //        digunakan oleh object
        //
        //
        // OBJECT
        //
        // Main main = new Main();
        //
        // main
        // └── instance state / field
        //
        //
        // INSTANCE METHOD
        //
        // main.testIso();
        //      │
        //      └── this = main
        //
        //
        // STATIC METHOD
        //
        // Main.someStaticMethod();
        //      │
        //      └── tidak ada this
    }


    // =============================================================
    // ANONYMOUS CLASS SEBAGAI INSTANCE FIELD
    // =============================================================

    // fakeIso adalah instance field.
    //
    // Anonymous class dibuat sebagai object yang mengimplementasikan
    // interface ISO.

    ISO fakeIso = new ISO() {

        @Override
        public void isoType() {
            System.out.println("Fake ISO License");
        }

        @Override
        public void requirements() {
            System.out.println("Just be fake");
        }
    };


    // =============================================================
    // INSTANCE METHOD
    // =============================================================

    public void testIso() {

        // Karena testIso() adalah instance method,
        // kita memiliki konteks object (this).
        //
        // Jadi kode ini secara konseptual sama dengan:
        //
        // this.fakeIso.isoType();

        fakeIso.isoType();
    }
}
