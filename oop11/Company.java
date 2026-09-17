package oop11;

/*
    INNER CLASS
    di java, kita bisa membuat class di dalam class, atau disebut inner class
    Salah satu kasus kita membuat inner class biasanya karna kita butuh membuat beberapa class
    saling berhubungan. Dimana sebuah class tidak bisa dibuat tanpa class lainnya.

    Misalnya dibawah kita membuat class Employee, dan Employee ini membutuhkan informasi dari class Company
    maka kita bisa membuat class Employee di dalam class Company (menjadi inner class)
*/

import java.util.Arrays;

public class Company {
    private String name;

    public String getname(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    // Sebuah inner class
    public class Employee {
        private String name;

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        // keuntungan membuat inner class adalah kita bisa mengakses method dan field dari outer class
        // outer class adalah class yang memiliki inner class.

        public String getCompany(){
            return Company.this.name; // kita bisa mengakses ini bahkan meskipun name di company adalah private
        }
    }





}
