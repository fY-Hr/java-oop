package oop10;

public class SocialMedia {
    String name;
}

// FINAL CLASS
// final keyword juga bisa digunakan untuk menghindari inheritance pada class
final class Facebook extends SocialMedia {

}
/*
    Jika kita melakukan inheritance, maka akan error

    class FakeFacebook extends Facebook {} // error
*/

// FINAL METHOD

class Instagram extends SocialMedia {
    // dengan final keyword, kita bisa menghindari overriding pada method
    final void whatToScroll(){
        System.out.println("IG Reels");
    }
}

class InstagramLite extends Instagram {
    /*
    @Override
    void whatToScroll(){ // tidak bisa di override
        System.out.println("IG Lite Reels");
    }
    */
}

