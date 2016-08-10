package Biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    private String title;
    private String author;
    private String yearPublished;
    private Book book;
    private PrintStream printStream;

    @Before
    public void setup() {
        title = "Book Name";
        author = "Author";
        yearPublished = "2016";

        book = new Book(title, author, yearPublished, printStream);

        printStream = mock(PrintStream.class);
    }

    @Test
    public void shouldPrintBookDetails(){
        book.print();

        verify(printStream).println(title + " | " + author + " | " + yearPublished);
    }
}