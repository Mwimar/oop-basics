package oop;
public class AudioBook extends Book {
private int runTime;
AudioBook(String title, String author, Integer pageCount, Integer runTime){
    super(title,author,pageCount);
    this.runTime=runTime;
}
}