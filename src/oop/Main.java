package oop;
import java.time.LocalDate;

 class Main {
    public static void main(String[] args) {
User youngerUser = new User();
youngerUser.name="Kodak Black";
youngerUser.birthDay= LocalDate.parse("1998-04-14");
        System.out.printf("%s was born in %s, and is %d years old.",youngerUser.name,youngerUser.birthDay.toString(), youngerUser.age());
    }
}