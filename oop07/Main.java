package oop07;

public class Main {
    static void main(String[] args){
        Car mobilBaru = new Avanza(); // bisa jadi bentuk polymorfisme juga

        System.out.println(mobilBaru.MAX_SPEED); // masih bisa
        // System.out.println(mobilBaru.info()); // error
        System.out.println(mobilBaru.getTier());
        System.out.println(mobilBaru.driftingAbility());
    }
}
