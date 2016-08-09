package Biblioteca;


import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import java.io.PrintStream;
import java.util.ArrayList;

public class BibliotecaTests {
    private PrintStream printstream;
    private Book book1;
    private Book book2;


    @Before
    public void setup() {
        printstream = mock(PrintStream.class);
        book1 = mock(Book.class);
        book2 = mock(Book.class);
    }

    @Test
    public void shouldPrintWelcomeWhenApplicationStarts() {

        Biblioteca biblioteca = new Biblioteca(printstream, new ArrayList<Book>());
        biblioteca.printWelcome();
        verify(printstream).println("Welcome to the Biblioteca!");

    }

    @Test
    public void shouldPrintEmptyStringWhenLibraryEmpty() {

        Biblioteca biblioteca = new Biblioteca(printstream, new ArrayList<Book>());
        biblioteca.printBookList();
        verify(printstream).println("");

    }

    @Test
    public void shouldPrintOneBookWhenLibraryHasOneBook() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        Biblioteca biblioteca = new Biblioteca(printstream, books);
        biblioteca.printBookList();
        verify(book1).print();
    }

    @Test
    public void shouldPrintTwoBooksWhenLibraryHasTwoBooks() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);

        Biblioteca biblioteca = new Biblioteca(printstream, books);
        biblioteca.printBookList();
        verify(book1).print();
        verify(book2).print();

    }
}
