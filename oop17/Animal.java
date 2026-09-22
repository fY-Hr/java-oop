package oop17;

// disini kita bisa menambahkan annotation Fancy pada class Animal
@Fancy(name = "Animal", tags = {"animal", "fish"})
public class Animal {

    @Fancy(name = "bergerak", tags = {"bergerak"}) // dan bisa digunakan untuk method seperti ini
    void bergerak(){
        System.out.println("bergerak");
    };
}
