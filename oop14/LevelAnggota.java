package oop14;

/**
 * ENUM CLASS
 *
 * saat membuat aplikasi, kadang kita bertemu dengan jenis-jenis data
 * yang nilainya sudah ditentukan.
 *
 * Misalnya:
 * - gender: female / male (terbatas pada 2 data)
 * - ukuran baju: S / M / L / XL (terbatas pada 4 data)
 *
 * Dalam kasus seperti inilah enum class digunakan, yaitu class berisi
 * nilai terbatas yang sudah ditentukan.
 *
 * Saat membuat enum class, secara otomatis dia akan meng extends class java.lang.Enum,
 * sama seperti Record, karna sudah melakukan extends maka tidak bisa lagi melakukan extends
 * class lain tetapi masih bisa melakukan implements.
 */

public enum LevelAnggota {
    // biasanya penulisan ENUM menggunakan huruf kapital
    STANDARD("Standard Level Membership"),
    PREMIUM("Premium Level Membership"),
    VIP("VIP Membership");

    // sama seperti class biasanya, di enum class juga bisa memiliki member (field, method, constructor)
    // namun khusus constructor kita tidak bisa membuatnya public, karna memang tujuan enum class
    // bukan untuk di instansiasi secara bebas

    // field di dalam enum class hanya bisa diakses lewat enum member, jadi harus
    // dimasukkan ke constructor
    // contoh cara akses:
    // LevelAnggota.STANDARD.description; <-- maka ini akan memberikan description dari STANDARD
    //                                        yang merupakan salah satu enum member

    // dan kenapa private? karna Enum class bisa diakses langsung, jika public
    // akan memungkinkan isi dari fieldnya akan diganti.
    private String description;

    public String getDescription() {
        return description;
    }

    // karna kita tidak akan membuat instance dari enum class, maka constructor tidak perlu public
    // jika di public pun akan error.
    // Setelah menambahkan constructor, kita harus menambahkan
    // argumen ke ENUM diatas. Jadi pengisian descriptionnya akan dilakukan diatas.
    LevelAnggota(String description) {
        this.description = description;
    }

    // kita tetap bisa membuat static field, karna ini adalah class
    private static String secretLevel = "Moderator";

    // dan juga static method
    public static String getSecretLevel() {
        return secretLevel;
    }

}
