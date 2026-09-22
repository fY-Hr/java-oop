package oop17;

import oop15.BlankException;

import java.lang.reflect.Field;

public class ValidationUtil {
    // validasi menggunakan refleksi
    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields){ // ini adalah bentuk for each di java
            field.setAccessible(true); // memaksa mengakses field yang private
            if(field.getAnnotation(NotBlank.class) != null){
                // validated
                try{
                    String valid = (String) field.get(object);
                    if(valid == null || valid.isBlank()){
                        throw new BlankException("Field " + field.getName() + " tidak boleh kosong");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Tidak bisa mengakses field: " + field.getName());
                }
            }
        }

    }
}
