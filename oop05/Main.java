package oop05;

public class Main {
    static void main(String[] args){
        // Location location = new Location(); // error jika abstract class
        City kota = new City();
        kota.name = "Jakarta";

        System.out.println(kota.name);

        Kucing kucing = new Kucing();
        kucing.makan();
    }
}
