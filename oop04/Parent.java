package oop04;

/*
 * ATURAN CLASS & ACCESS MODIFIER:
 * 1. Top-level class (class terluar) hanya boleh menggunakan access modifier:
 *    - 'public' (dapat diakses dari package mana pun).
 *    - 'default' / package-private (hanya dapat diakses dalam package yang sama).
 *    Top-level class TIDAK BISA menggunakan modifier 'private' atau 'protected'.
 * 2. Dalam satu file .java, hanya boleh ada maksimal SATU public class,
 *    dan namanya HARUS sama persis dengan nama file (contoh: Parent.java -> public class Parent).
 */
public class Parent {
    // Default / package-private: hanya bisa diakses oleh class di dalam package yang sama (oop04)
    String name;

    // Default / package-private method
    void doIt() {
        System.out.println("Do it from parent");
    }
}
