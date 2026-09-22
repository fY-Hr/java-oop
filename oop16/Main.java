package oop16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static void main(){
        // ini adlaah contoh membaca file tanpa try with resource
//        BufferedReader reader = null;
//
//        try {
//            reader = new BufferedReader(
//                    new FileReader("oop16/README.md")
//            );
//
//            while (true) {
//                String line = reader.readLine();
//
//                if (line == null) break;
//
//                System.out.println(line);
//            }
//
//        } catch (IOException e){
//            System.out.println("Error reading file");
//            e.printStackTrace();
//        } finally {
//            // karna .close() kemungkinan mengembalikan IOException, maka harus dibuat try-catch.
//            try {
//                reader.close();
//                System.out.println("File closed");
//            } catch (IOException e) {
//                System.out.println("Error closing file");
//                e.printStackTrace();
//            }
//        }

        // dan ini adalah versi try with resourcenya:
        try(BufferedReader reader = new BufferedReader( new FileReader("oop16/README.md"))){

            while (true) {
                String line = reader.readLine();

                if (line == null) break;

                System.out.println(line);
            }

        } catch (IOException e){
            System.out.println("Error reading file");
            e.printStackTrace();
        }

        // dengan memanfaatkan ini, kode menjadi lebih singkat :)
    }
}
