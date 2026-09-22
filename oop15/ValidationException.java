package oop15;

/*
 * EXCEPTION CLASS (CHECKED EXCEPTION)
 *
 * Dalam Java, Exception merupakan sebuah class yang digunakan untuk menangani
 * kesalahan atau kondisi yang tidak diinginkan saat program berjalan.
 *
 * HIRARKI THROWABLE DI JAVA:
 *
 *                  Throwable
 *                 /         \
 *            Exception       Error (Fatal, level sistem/JVM, TIDAK direkomendasikan di-catch)
 *                |
 *          RuntimeException (Unchecked Exception, TIDAK wajib try-catch / throws)
 *                |
 *      (Checked Exception lainnya - wajib try-catch / throws)
 *
 * 1. CHECKED EXCEPTION:
 *    - Merupakan class turunan langsung dari Throwable atau Exception
 *      (tetapi BUKAN turunan dari RuntimeException).
 *    - Bersifat "Checked": dicek secara ketat oleh compiler saat proses kompilasi.
 *    - Method yang bisa menghasilkan Checked Exception WAJIB menandai signature-nya
 *      dengan kata kunci 'throws NamaException'.
 *    - Pemanggil method tersebut WAJIB menangani exception menggunakan blok try-catch
 *      atau mendeklarasikannya kembali dengan 'throws' pada method-nya.
 *    - Jika tidak ditangani, kode TIDAK AKAN BISA DI-COMPILE.
 *    - Contoh bawaan Java: IOException, SQLException, ClassNotFoundException, dll.
 *    - Contoh custom: ValidationException di bawah ini.
 *
 * Seluruh error handling di Java berakar pada class Throwable.
 * Kita bisa membuat class exception sendiri (custom exception) dengan meng-extends
 * class Throwable / Exception / RuntimeException / Error sesuai kebutuhan.
 */
public class ValidationException extends Throwable {

    // Kita bisa langsung menggunakan constructor lalu memasukkan message ke super class Throwable
    public ValidationException(String message) {
        super(message); // Di dalam Throwable, constructor yang menerima parameter message akan mengisi field message
    }
}
