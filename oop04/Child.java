package oop04;

public class Child extends Parent {

    /*
     * 1. VARIABLE HIDING / FIELD SHADOWING
     * Di Java:
     * - Method mendukung OVERRIDING (bersifat dinamis / dynamic dispatch saat runtime).
     * - Field/Properti TIDAK MENDUKUNG OVERRIDING, melainkan mengalami VARIABLE HIDING (Field Shadowing).
     *
     * Field 'name' ini milik subclass (Child).
     * Jika sebuah objek Child di-casting ke tipe referensi Parent, maka pemanggilan field 'name'
     * akan merujuk ke field milik Parent, bukan Child.
     * Hal ini karena akses field ditentukan saat COMPILE TIME berdasarkan tipe referensi variabelnya,
     * bukan tipe objek sebenarnya di memori.
     */
    public String name;

    /*
     * 2. RINGKASAN ACCESS MODIFIER DI JAVA:
     * - public    : Dapat diakses dari mana saja (class, package sama, subclass, hingga package lain).
     * - protected : Dapat diakses dalam class yang sama, package yang sama, serta subclass di luar package.
     * - default (tanpa modifier / package-private): Hanya dapat diakses dari package yang sama.
     * - private   : Hanya dapat diakses di dalam class itu sendiri.
     */

    // Method Overriding: Menimpa implementasi method doIt() yang ada di superclass Parent
    @Override
    void doIt() {
        System.out.println("Do it from child");
    }
}
