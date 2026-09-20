package oop12;

/*
 * STATIC KEYWORD
 *
 * static keyword berfungsi untuk mendeklarasikan variabel atau method
 * yang dapat diakses tanpa harus membuat instance objek dari sebuah class yang
 * memiliki static keyword tersebut.
 *
 * Static keyword juga menandakan bahwa variabel atau method tersebut
 * adalah milik class itu sendiri.
 *
 * Static keyword dapat digunakan di:
 * - Variabel
 * - Method
 * - Blok kode, static block akan otomatis dieksekusi ketika class tersebut di-load.
 * - Nested class, yaitu class yang dideklarasikan secara static di dalam class lain (inner class).
 *   Static nested class dapat diakses tanpa membuat instance dari outer class.
 *   Karena static nested class tidak memiliki implicit reference ke instance outer class,
 *   static nested class tidak dapat mengakses member non-static outer class secara langsung.
 *
 * FYI:
 * Nested class = istilah umum untuk class yang dideklarasikan di dalam class/interface lain.
 * Inner class = nested class yang tidak static.
 * Static nested class = nested class yang static.
 */

public class Aplikasi {

    public int x = 10;
    public static final int PROCESSOR;

    // static blok kode, akan dijalankan pada saat class di load
    static {
        System.out.println("Static blok kode dijalankan");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }

    // biasanya variabel static diberi nama huruf besar dan juga biasanya final
    // tapi tidak wajib
    public static final String APP_NAME = "Belajar Java";


    // sebuah static method tidak bisa mengakses properti non-static meski di dalam
    // class yang sama. Hal ini disebabkan oleh tidak adanya implicit reference ke instance class.
    // dan karena public int x diatas dimiliki oleh instance class Aplikasi, ini membuat static member.
    // tidak akan mengetahui bagaimana cara mengakses member non-static outer class.
    public static void running(String[] args) {
        System.out.println(APP_NAME);
        // System.out.println(x); // error
    }

    // static nested class (inner class)
    // menggunakan static keyword pada nested class membuatnya dapat diakses tanpa membuat instance dari outer class.
    public static class Fitur {

        // aturan static pada nested class masih sama.
        // member non-static tidak bisa diakses melalui class langsung tanpa instance objek.
        int y = 20;

        public void fitur1() {
            System.out.println("Fitur 1");
        }

        // hanya member static yang bisa langsung diakses. Lihat Main.java
        public static void fitur2() {
            System.out.println("Fitur 2");
        }
    }




}
