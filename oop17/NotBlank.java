package oop17;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// annotation disini digunakan seperti penanda. Lihat CreateUserRequest.java
// disitu kita menandai fieldnya dengan @NotBlank
// dan kita melakukan validasi untuk field yang memiliki @NotBlank
// di ValidationUtil.java pada method validationReflection

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {}
