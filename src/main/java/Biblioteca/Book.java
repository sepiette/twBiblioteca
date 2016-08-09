package Biblioteca;

import java.io.PrintStream;

public class Book {
    private String title;
    private String author;
    private String yearPublished;
    private PrintStream printStream;

    public Book(String title, String author, String yearPublished, PrintStream printStream) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.printStream = printStream;
    }

    public void print() {
        printStream.println(title+" | "+author+" | "+yearPublished);
    }
}
