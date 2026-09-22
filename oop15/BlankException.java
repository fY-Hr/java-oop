package oop15;

/*
 * RUNTIME EXCEPTION (UNCHECKED EXCEPTION)
 *
 * RuntimeException adalah jenis exception yang terjadi saat program sedang berjalan (runtime).
 * Merupakan class turunan dari java.lang.RuntimeException (yang juga merupakan turunan dari Exception).
 *
 * 2. UNCHECKED EXCEPTION (RUNTIME EXCEPTION):
 *    - Bersifat "Unchecked": compiler TIDAK AKAN memaksa kita untuk menangani exception ini.
 *    - Artinya:
 *      1. Method yang melempar (throw) RuntimeException TIDAK WAJIB mendeklarasikan kata kunci 'throws'
 *         pada signature method-nya.
 *      2. Pemanggil method TIDAK WAJIB membungkus pemanggilan kode tersebut dengan blok 'try-catch'.
 *    - Namun jika terjadi exception saat program berjalan dan kita TIDAK menangkapnya (catch),
 *      maka program akan langsung BERHENTI (crash) saat runtime!
 *    - Biasanya RuntimeException terjadi akibat kesalahan logika programmer (bug),
 *      misalnya:
 *      - NullPointerException (mengakses object yang masih bernilai null)
 *      - IllegalArgumentException (argumen yang dikirim tidak sesuai)
 *      - IndexOutOfBoundsException (mengakses indeks array di luar panjang array)
 *      - ArithmeticException (seperti pembagian angka dengan nol)
 *
 *    - Kapan membuat custom RuntimeException?
 *      Ketika kita ingin membuat validasi atau error handling yang tidak ingin "mengotori"
 *      signature method dengan kata kunci 'throws' di mana-mana, dan membiarkan exception tersebut
 *      ditangani di lapisan terluar (misalnya Controller / Global Exception Handler).
 *
 *    - Contoh custom: BlankException di bawah ini (digunakan saat data bernilai kosong/blank).
 */
public class BlankException extends RuntimeException {

    // Constructor menerima pesan error dan meneruskannya ke superclass RuntimeException
    public BlankException(String message) {
        super(message);
    }
}
