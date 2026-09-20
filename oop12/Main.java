package oop12;

// jika berbeda package, bisa melakukan static import agar langsung
// mengimport semua static member dalam suatu class tanpa perlu
// mengimport classnya terlebih dahulu

import static oop12.Aplikasi.PROCESSOR; // <-- seperti ini

public class Main {
    static void main(String[] args){
        // mengakses fitur2 yang merupakan method static dari inner class Fitur
        Aplikasi.Fitur.fitur2();

        // jika kita ingin mengakses y, dan fitur 1, maka:
        Aplikasi.Fitur fitur = new Aplikasi.Fitur();
        fitur.fitur1();
        System.out.println(fitur.y);

        int hasil = MathUtil.sum(fitur.y, 2);
        System.out.println(hasil);

        System.out.println(PROCESSOR);
    }
}
