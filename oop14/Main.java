package oop14;

import java.util.Arrays;

public class Main {
    static void main(String[] args){
        Anggota anggota1 = new Anggota();
        anggota1.setName("John Doe");

        // untuk mengakses enum class pun sama seperti static field pada sebuah class
        anggota1.setLevel(LevelAnggota.STANDARD);
        System.out.println(anggota1.getLevel());
        System.out.println(anggota1.getLevel().getDescription()); // getDescription bisa digunakna seperti ini

        System.out.println(LevelAnggota.STANDARD.getDescription()); // atau langsung saja
        System.out.println(LevelAnggota.getSecretLevel());

        // konversi enum ke string
        String levelString = LevelAnggota.VIP.name();
        System.out.println(levelString);

        // atau sebaliknya
        LevelAnggota level = LevelAnggota.valueOf("PREMIUM"); // jika salah memasukkan maka error
        System.out.println(level);

        // untuk mengecek isi dari LevelAnggota bisa menggunakan .values()
        System.out.println(Arrays.toString(LevelAnggota.values()));
        // harus menggunakan Array.toString() karena values() mengembalikan LevelAnggota[] (array)
    }
}
