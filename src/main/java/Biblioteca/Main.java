package Biblioteca;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.Buffer;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<Book> books = new ArrayList<Book>();
        PrintStream printStream = System.out;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        books.add(new Book("HP 1", "JK Row", "1997",printStream));
        books.add(new Book("HP 2", "JK Row", "1999",printStream));
        books.add(new Book("HP 3", "JK Row", "2003",printStream));
        Biblioteca biblioteca = new Biblioteca(System.out, books);

        MainMenu menu = new MainMenu(printStream, reader, biblioteca);
        menu.start();
    }

}
