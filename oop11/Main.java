package oop11;

public class Main {

    /*
     * ANONYMOUS CLASS SEBAGAI INSTANCE FIELD:
     *
     * Bentuk sintaks:
     *   TargetType variable = new TargetType() {
     *       // implementasi / override method di sini
     *   };
     * Note: TargetType disini biasanya interface
     *
     * Di balik layar:
     * 1. Java membuat class baru tanpa nama yang mengimplementasikan interface ISO (atau turunan class).
     * 2. Java langsung menginstansiasi objek dari class tanpa nama tersebut dengan keyword 'new'.
     * 3. Cocok untuk implementasi sekali pakai tanpa perlu membuat file class terpisah (.java baru).
     * 4. Di sini, 'fakeIso' disimpan sebagai instance field dari class Main.
     */
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

    // Instance method: dieksekusi dalam konteks objek tertentu (memiliki akses ke 'this')
    public void testIso() {
        fakeIso.isoType(); // sama dengan: this.fakeIso.isoType();
    }

    public static void main(String[] args) {

        // =========================================================
        // 1. INNER CLASS
        // =========================================================
        // Instansiasi inner class non-static membutuhkan objek outer class terlebih dahulu.
        Company mayora = new Company();
        mayora.setName("Mayora");

        // Sintaks instansiasi: outerObject.new InnerClass()
        Company.Employee employee = mayora.new Employee();
        employee.setName("John Doe");
        System.out.println(employee.getCompany());


        // =========================================================
        // 2. ANONYMOUS CLASS (SEBAGAI LOCAL VARIABLE)
        // =========================================================
        // Contoh deklarasi langsung di dalam method (local scope).
        // Objek ini hanya dapat diakses selama variabel 'customIso' masih dalam scope main().
        ISO customIso = new ISO() {
            @Override
            public void isoType() {
                System.out.println("Local Custom ISO");
            }

            @Override
            public void requirements() {
                System.out.println("Meet local standard requirements");
            }
        };
        customIso.isoType();


        // =========================================================
        // 3. STATIC VS INSTANCE MEMBER
        // =========================================================
        // - Instance Member:
        //   Dimiliki oleh objek (instance). Memerlukan 'new Main()' untuk dipanggil
        //   dan memiliki keyword 'this'.
        Main mainObj = new Main();
        mainObj.testIso(); // Memanggil instance method melalui objek (line 33)

        // - Static Member (keyword 'static'):
        //   Dimiliki langsung oleh CLASS, bukan oleh instance objek dari class tersebut.
        //   Dipanggil langsung via nama class: Main.staticExample() tanpa 'new'.
        //   Karena tidak memiliki 'this', method static TIDAK BISA mengakses
        //   instance field (seperti fakeIso diatas, line 20) secara langsung tanpa membuat objeknya dulu.
        //
        //   instance field adalah field yang dimiliki oleh instance objek dari class tersebut.
        //   jadi meskipun kita memang mendefinisikannya di dalam class Main,
        //   ia tidak bisa diakses secara langsung dari static method (seperti staticExample()).
        //   karna secara konsep, instance field hanya bisa diakses melalui instance objek.
        //
        //   'instance' adalah kata yang digunakan untuk merujuk class yang sudah dibuat menjadi objek
        //   dengan pernyataan konsep diatas, maka instance field adalah field di dalam objek.
    }
}
