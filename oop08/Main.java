package oop08;

public class Main {
    static void main(String[] args){

        // perbedaan == dan equals method di java
        String first = "Kaneki";
        first = first + " Ken";

        String second = "Kaneki Ken";

        System.out.println(first == second); // akan menghasilkan false

        // Kenapa? Karena first dan second memiliki referensi yang berbeda pada memory pool, meskipun memiliki nilai yang sama.

        System.out.println(first.equals(second));

        // Ketika menggunakan equals method, kita membandingkan nilai dari kedua string, bukan referensi.

        String third = "Kaneki Ken";

        System.out.println(second == third); // true

        // Kenapa?
        // karena string literal "Kaneki Ken" sudah ada di memory pool, maka ketika kita membuat string third dengan nilai "Kaneki Ken", JVM akan mengembalikan referensi ke string literal tersebut, sehingga third dan second memiliki referensi yang sama.

        System.out.println(second.equals(third));

        // memory pool disini mirip seperti konsep memory address di go/c


        // penggunaan equals overriding
        Product laptop = new Product("Mac book pro", 30000000);
        Product laptop2 = new Product("Mac book pro", 30000000);

        // equals disini adalah equals yang benar2 sama (tergantung dari implementasi equals method yang di override)
        System.out.println(laptop.equals(new Product("Mac book pro", 3000000))); // false
        System.out.println(laptop.equals(laptop2)); // true


        // representasi hashCode:
        System.out.println(laptop.hashCode());
        System.out.println(laptop2.hashCode());
        // karena merupakann objek yang identik, maka hashCode akan sama
    }
}

