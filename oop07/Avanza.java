package oop07;

// jika kita ingin yang mengadopsi interface maka kita menggunakan
// kata kunci implements.

// Class bisa mengimplementasikan lebih dari 1 interface
public class Avanza implements Car, JapaneseCar{
    String brand = "Avanza";

    @Override
    public void starterVoice(){
        System.out.println("Konnichiwa! wkwkwk");
    }

    @Override
    public void drive(){
        System.out.println("mbremmm");
    }

    @Override
    public int getTier(){
        return 4;
    }

    // overriding method toString() example
    @Override
    public String toString(){
        return "This is: " + brand + " Car";
    }
}
