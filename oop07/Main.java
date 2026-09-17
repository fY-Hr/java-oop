package oop07;

public class Main {
    static void main(String[] args){
        Car mobilBaru = new Avanza(); // bisa jadi bentuk polymorfisme juga

        System.out.println(mobilBaru.MAX_SPEED); // masih bisa
        // System.out.println(mobilBaru.info()); // error
        System.out.println(mobilBaru.getTier());
        System.out.println(mobilBaru.driftingAbility());

        // pada saat kita menggunakan println pada objek,
        // sebenarnya kita memanggil method toString()
        System.out.println(mobilBaru); // maka hasilnya adalah: This is: Avanza Car

    }
}
