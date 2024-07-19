package oop;
import java.time.LocalDate;

 class Main {
    public static void main(String[] args) {


        User User = new User();
        Book book = new Book();
        User.name = "Yungeen Ace";
        User.birthDay=LocalDate.parse("1993-05-15");
//        System.out.printf("%s was born in %s, and is %d years old.",User.name,User.birthDay.toString(), User.age());
        book.title="Absolute Power";
        book.author="Robert Anguka";
        System.out.printf("%s was authored by %s", book.title,book.author);
    }
}