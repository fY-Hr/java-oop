package oop05;

/*
    Abstract class
    adalah sebuah class yang tidak bisa dijadikan instance objek secara langsung,
    abstract class hanya bisa diturunkan (inheritance) lalu membuat instance objek dari subclass-nya

    fungsi abstract class biasanya untuk membuat sebuah semcama kontrak atau kelas dasar
    yang memang dimiliki oleh banyak subclass tapi tidak memiliki informasi spesifik jika berdiri sendiri.

 */
public abstract class Location {
    String name;
}
