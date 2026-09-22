package oop17;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    Annotation adalah kegiatan menambahkan informasi tambahan (metadata) ke kode program.

    Tidak semua orang biasanya menambahkan annotation ke kode program.
    Biasanya digunakan pada saat kita membuat kode kita publik atau kita membuat
    sebuah library yang akan digunakan oleh orang lain.

    Annotation sendiri bisa diakses menggunakan Reflection (oop18).
    Nah Annotation sendiri banyak yang merupakan built-in annotation.
    contohnya:
    - @Override
    - @Deprecated
    - @SuppressWarnings
    - dll
    Dan cara menggunakannya adalah dengan menggunakan @ symbol diikuti dengan nama annotation.

    Tapi kita juga bisa membuat annotation sendiri.
    dengan menggunakan kata kunci @interface.
 */

// dalam @interface ada @Target dan @Retention
@Target({ElementType.TYPE, ElementType.METHOD})
// Target digunakn untuk menentukan di mana annotation tersebut dapat digunakan
// karna diatas kita menambahkan TYPE dan METHOD, maka Fancy bisa digunakan di class dan method
@Retention(RetentionPolicy.RUNTIME)
// Retention digunakan untuk menentukan kapan annotation tersebut akan dihapus
// retention bisa jadi hanya ingin ditampilkan di source code dan ketika sampai ke runtime dihapus
// atau muncul di keduanya
public @interface Fancy {
    // untuk field harus menambahkan ()
    String name();

    String[] tags() default {};
    // kita bisa menambahkan default value. Jika kita menggunakna default value
    // maka kita tidak perlu menambahkan value untuk tags pada saat menggunakan annotation Fancy
}
