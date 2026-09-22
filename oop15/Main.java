package oop15;

public class Main {

    static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("1. DEMO: CHECKED EXCEPTION");
        System.out.println("==================================================");
        /*
         * Saat kita menggunakan method yang bisa menyebabkan Checked Exception (seperti ValidationException),
         * kita WAJIB menggunakan try-catch statement di Java.
         *
         * Gunanya adalah untuk menangkap exception yang terjadi. Jika tidak ditangkap (atau tidak di-throws),
         * program TIDAK AKAN BISA DI-COMPILE.
         */
        LoginRequest request1 = new LoginRequest(null, null);

        try {
            ValidationUtil.validate(request1);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException e) {
            // Multiple try-catch: menggabungkan beberapa tipe exception dalam satu blok catch menggunakan tanda '|' (pipe)
            System.out.println("Data tidak valid: " + e.getMessage());
        } /* catch (NullPointerException e) {
            // Ini adalah multiple try catch cara lama (1 per 1), di mana sebuah exception
            // bisa ditangkap oleh catch yang berbeda-beda tergantung tipe exception-nya.
            // System.out.println("Data null: " + e.getMessage());
        } */
        finally {
            // Blok kode yang akan SELALU DIEKSEKUSI meskipun terjadi error maupun sukses.
            // Sangat sering dipakai untuk clean-up seperti menutup file/koneksi.
            System.out.println("Finally block: Selalu dieksekusi!");
        }


        System.out.println("\n==================================================");
        System.out.println("2. DEMO: RUNTIME EXCEPTION (UNCHECKED EXCEPTION)");
        System.out.println("==================================================");
        /*
         * Berbeda dengan Checked Exception, RuntimeException TIDAK WAJIB ditangkap dengan try-catch.
         * Kode berikut valid dan bisa di-compile tanpa error:
         *
         *     LoginRequest request2 = new LoginRequest("", "rahasia");
         *     ValidationUtil.validateRuntime(request2); // Tidak wajib dibungkus try-catch!
         *
         * Namun, jika terjadi exception saat program berjalan dan tidak ditangkap,
         * program akan langsung berhenti / crash seketika (Runtime Error).
         *
         * Oleh karena itu, kita tetap BISA menangkapnya dengan try-catch jika ingin mengamankan program:
         */
        LoginRequest request2 = new LoginRequest("", "rahasia");

        try {
            ValidationUtil.validateRuntime(request2);
            System.out.println("Data runtime valid");
        } catch (BlankException | NullPointerException e) {
            System.out.println("Terjadi RuntimeException: " + e.getMessage());
        }


        System.out.println("\n==================================================");
        System.out.println("3. DEMO: STACK TRACE (PELACAKAN ERROR)");
        System.out.println("==================================================");
        /*
         * StackTrace adalah catatan jejak eksekusi yang menunjukkan file, class, method,
         * dan nomor baris terjadinya exception secara berurutan (dari pemanggil paling awal sampai lokasi crash).
         *
         * Sangat krusial untuk proses DEBUGGING ketika mencari sumber penyebab error.
         * Method bawaan Throwable:
         * - e.getMessage()       : mengambil pesan string error saja.
         * - e.printStackTrace()  : mencetak seluruh jejak call stack ke standard error output console.
         */
        try {
            LoginRequest request3 = new LoginRequest("budi", "");
            ValidationUtil.validateRuntime(request3);
        } catch (RuntimeException e) {
            System.out.println("Pesan error : " + e.getMessage());
            System.out.println("Mencetak StackTrace ke console:");
            e.printStackTrace(); // Akan mencetak jejak lokasi baris error
        }


        System.out.println("\n==================================================");
        System.out.println("4. DEMO: ERROR (FATAL ERROR)");
        System.out.println("==================================================");
        /*
         * Error digunakan untuk masalah fatal yang terjadi di level sistem / JVM / koneksi vital.
         *
         * ATURAN: ERROR SANGAT TIDAK DIREKOMENDASIKAN UNTUK DITANGKAP DENGAN TRY-CATCH!
         * Mengapa? Karena saat Error terjadi, sistem sudah tidak dalam kondisi stabil atau aman.
         * Jika dipaksakan jalan terus, bisa merusak data lainnya.
         *
         * Blok try-catch di bawah ini HANYA UNTUK DEMO BELAJAR, agar program Main tidak langsung mati:
         */
        try {
            ValidationUtil.connectDatabase(null, null); // Akan melempar DatabaseError
        } catch (DatabaseError error) {
            System.out.println("Terjadi FATAL ERROR: " + error.getMessage());
            // Di aplikasi nyata, Error sebaiknya dibiarkan membuat program mati (terminate)
            // agar bisa segera diperbaiki oleh developer/DevOps.
        }

        /*
         * Contoh Error bawaan Java: StackOverflowError
         * Terjadi ketika method rekursif memanggil dirinya sendiri tanpa henti sehingga memori stack habis.
         *
         * uncoment baris di bawah jika ingin melihat StackOverflowError:
         * loop(100000);
         */
    }

    // Method simulasi untuk menghasilkan StackOverflowError bawaan Java
    static void loop(int value) {
        if (value == 0) {
            return;
        }
        loop(value - 1);
    }
}
