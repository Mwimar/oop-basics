package oop;
import java.time.LocalDate;

 class Main {
    public static void main(String[] args) {


        User user = new User("Yungeen Ace","1993-05-15");//Abstraction is hiding complexities of a class
        Book book = new Book("Absolute Power","Robert Anguka");
//        user.name = "Yungeen Ace";
//        user.birthDay=LocalDate.parse("1993-05-15");
        user.borrow(book);
        System.out.printf("%s was born in %s, and is %d years old.\n",user.getName(), user.age(), user.age());
        book.title="Absolute Power";
        book.author="Robert Anguka";
        System.out.printf("%s was authored by %s\n", book.getTitle(),book.getAuthor());
        System.out.printf("%s has borrowed %s\n",user.getName(), user.borrowedBooks());
    }
}