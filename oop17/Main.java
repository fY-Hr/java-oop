package oop17;


public class Main {
    static void main(){
        CreateUserRequest request = new CreateUserRequest();

        // jika kita tidak mengisi username dan password maka akan error
        // request.setUsername("user");
        // request.setPassword("password");

        ValidationUtil.validationReflection(request);

        // dengan metode validasi melalui reflection ini, akan sangat efektif
        // dan efisien karna hanye perlu menambahkan anotasi pada field yang ingin di validasi
    }
}
