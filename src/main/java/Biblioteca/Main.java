package Biblioteca;


import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<Book> books = new ArrayList<Book>();
        PrintStream printStream = System.out;
        books.add(new Book("HP 1", "JK Row", "1997",printStream));
        books.add(new Book("HP 2", "JK Row", "1999",printStream));
        books.add(new Book("HP 3", "JK Row", "2003",printStream));
        Biblioteca biblioteca = new Biblioteca(System.out, books);
        biblioteca.start();
    }

}
