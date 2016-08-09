package Biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Book> bookList;
    private PrintStream printStream;

    public Biblioteca(PrintStream printStream, ArrayList<Book> bookList){

        this.printStream = printStream;
        this.bookList = bookList;
    }
    public void start(){
        printWelcome();
        printBookList();
    }
    public void printWelcome() {
        printStream.println("Welcome to the Biblioteca!");
    }

    public void printBookList() {
        if (this.bookList.isEmpty())
            printStream.println("");
        else {
            for (Book book : bookList) {
                book.print();
            }
        }
    }
}
