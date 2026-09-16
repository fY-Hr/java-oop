package oop06;

/*
    Encapsulation
    adalah konsep dalam pemrograman untuk menyembunyikan detail
    implementasi dari suatu objek dan hanya memungkinkan akses
    melalui metode yang telah ditentukan.

    dalam contoh dibawah yang disembunyikan adalah atribut id dan expensive.
    dan hanya bisa diakses melalui metode getId() dan isExpensive().

    ini biasanya disebut getter dan setter.
 */

public class Category {
    private String id;
    private boolean expensive;

    // di intellij idea bisa menggunakan shortcut
    // 'alt + insert' untuk membuat getter dan setter.

    // keuntungan menggunakan getter dan setter adalah kita bisa membuat validasi
    // untuk memastikan data yang dimasukkan sesuai dengan kebutuhan.

    public String getId() {
        return id;
    }

    // contoh validasi pada setId()
    public void setId(String id) {
        if(id == null || id.isEmpty()){
            throw new IllegalArgumentException("id cannot be null or empty");
        }
        this.id = id;
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
