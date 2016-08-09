package Biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    @Test
    public void shouldPrintBookDetails(){
        PrintStream printStream = mock(PrintStream.class);
        Book book = new Book("Book Name", "Author", "2016", printStream);
        book.print();

        verify(printStream).println("Book Name | Author | 2016");
    }
}