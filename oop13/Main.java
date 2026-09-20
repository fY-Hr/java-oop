package oop13;

public class Main {

    static void main(){
        // cara membuat instance object dari record class juga masih sama:
        LoginRequest request = new LoginRequest("anonymousUsr", "rahasia");

        // dan perbedaannya terlihat disini:
        System.out.println(request.username()); // ini adalah getter untuk username
        System.out.println(request.password()); // dan ini adalah getter untuk password

        // getternya secara default sudah dibuat oleh java, memang lebih nyaman menggunakan
        // getUsername() atau getPassword(), tapi ini sudah disediakan oleh java.

        // dan juga toString() nya juga sudah diubah formatnya, jadi lebih mudah dibaca.
        System.out.println(request);


        // contoh penggunaan dari constructor overloading
        LoginRequest request2 = new LoginRequest("anonymousUsr");
        LoginRequest request3 = new LoginRequest();

        // dan penggunaan methodnya
        request2.sayHello();
        request3.sayHello();
    }

}
