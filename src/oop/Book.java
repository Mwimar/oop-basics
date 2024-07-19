package oop;

public class Book {
    private String title;
    private String author;

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    String getTitle(){
        return this.title;
            }
            String getAuthor(){
        return this.author;
            }

    public String toString(){
        return String.format("%s by %s", this.title,this.author);
    }


}
