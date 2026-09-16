package oop06;

public class Main {
    static void main(String[] args){
        Category category = new Category();

        category.setId("1");
        category.setExpensive(true);

        category.setId(null); // throws IllegalArgumentException
    }
}
