package oop15;

public class ValidationUtil {

    /*
     * 1. CHECKED EXCEPTION:
     *
     * Exception biasanya terjadi di method. Ketika method berpotensi melempar Checked Exception,
     * maka method tersebut WAJIB ditandai dengan kata kunci 'throws' diikuti nama exception-nya.
     *
     * Jika pemanggil method tidak menangkapnya (try-catch) atau tidak mendeklarasikan 'throws' lagi,
     * maka program akan gagal kompilasi (compile error).
     */
    public static void validate(LoginRequest request) throws ValidationException, NullPointerException {
        // Jika method bisa menimbulkan lebih dari 1 exception, kita bisa menambahkan nama-nama exception
        // yang dipisahkan dengan tanda koma pada deklarasi 'throws' di atas.
        if (request == null) {
            // Untuk melempar exception, kita menggunakan kata kunci 'throw' diikuti OBJECT exception-nya (ada kata 'new')
            throw new ValidationException("Request cannot be null");
        } else if (request.username() == null) {
            throw new NullPointerException("Username cannot be null");
        } else if (request.username().isBlank()) {
            throw new ValidationException("Username cannot be empty");
        } else if (request.password() == null) {
            throw new NullPointerException("Password cannot be null");
        } else if (request.password().isBlank()) {
            throw new ValidationException("Password cannot be empty");
        }
    }

    /*
     * 2. RUNTIME EXCEPTION (UNCHECKED EXCEPTION):
     *
     * Perhatikan method di bawah ini!
     * Method ini melempar BlankException & NullPointerException (keduanya merupakan turunan RuntimeException).
     *
     * Perbedaannya dengan Checked Exception:
     * KITA TIDAK PERLU menambahkan kata kunci 'throws BlankException, NullPointerException'
     * pada signature method di bawah ini!
     *
     * Java compiler mengizinkan kita melempar RuntimeException secara bebas tanpa memaksa deklarasi 'throws'.
     * Pemanggil method juga TIDAK DIPAKSA untuk menggunakan blok try-catch.
     *
     * Tapi ketika kita membuat aplikasi yang besar kita biasanya akan menumpuk RuntimeException
     * dan menangani error tersebut di level yang lebih tinggi. Biasanya disebut Error Handling.
     *
     * lalu menggunakan try catch untuk menangani error yang sudah ditumpuk.
     */
    public static void validateRuntime(LoginRequest request) {
        if (request == null) {
            throw new NullPointerException("Request cannot be null");
        } else if (request.username() == null) {
            throw new NullPointerException("Username cannot be null");
        } else if (request.username().isBlank()) {
            // Melempar custom RuntimeException kita sendiri
            throw new BlankException("Username cannot be empty");
        } else if (request.password() == null) {
            throw new NullPointerException("Password cannot be null");
        } else if (request.password().isBlank()) {
            throw new BlankException("Password cannot be empty");
        }
    }

    /*
     * 3. ERROR (FATAL ERROR):
     *
     * Sama seperti RuntimeException, class turunan Error juga bersifat 'unchecked'
     * sehingga TIDAK PERLU dideklarasikan dengan 'throws' pada method signature.
     *
     * Digunakan ketika terjadi kegagalan fatal yang membuat aplikasi tidak dapat berjalan normal,
     * misalnya saat startup aplikasi gagal terhubung ke database.
     */
    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            // Melempar custom Error
            throw new DatabaseError("Tidak bisa konek ke database! Kredensial username atau password kosong.");
        }
        System.out.println("Koneksi ke database berhasil terhubung!");
    }
}
