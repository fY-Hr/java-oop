package oop15;

/*
 * ERROR CLASS (FATAL ERROR)
 *
 * Error adalah class turunan langsung dari Throwable (sejajar posisinya dengan Exception).
 *
 * 3. ERROR:
 *    - Digunakan untuk menandakan masalah yang SANGAT FATAL, SERIUS, dan kritis
 *      yang biasanya terjadi di tingkat sistem, JVM, hardware, atau infrastruktur internal.
 *    - Masalah yang diwakili oleh Error umumnya bersifat TIDAK BISA DIPULIHKAN (unrecoverable).
 *
 * ATURAN PENTING (GOLDEN RULE):
 *    - Error SANGAT TIDAK DIREKOMENDASIKAN untuk ditangkap (catch) menggunakan blok try-catch!
 *    - Kenapa? Karena jika Error terjadi, kondisi internal program atau JVM sudah rusak / tidak stabil.
 *      Memaksakan aplikasi tetap berjalan justru berisiko menyebabkan data corrupt atau bug yang lebih fatal.
 *    - Tindakan terbaik saat Error terjadi adalah membiarkan program mati (terminate),
 *      sehingga tim developer atau system administrator bisa menyelidiki penyebab masalahnya.
 *
 * Contoh Error bawaan Java:
 *    - OutOfMemoryError (memori RAM untuk JVM sudah habis total)
 *    - StackOverflowError (pemanggilan method rekursif tanpa henti hingga stack memory habis)
 *    - NoClassDefFoundError (class yang dibutuhkan saat runtime tidak ditemukan)
 *
 * Contoh Custom Error:
 *    - DatabaseError di bawah ini (misalnya saat startup aplikasi gagal total tersambung
 *      ke database utama, sehingga aplikasi sama sekali tidak berguna dan harus segera dihentikan).
 */
public class DatabaseError extends Error {

    // Constructor menerima pesan error dan meneruskannya ke superclass Error
    public DatabaseError(String message) {
        super(message);
    }
}
