package Biblioteca;

import java.io.PrintStream;

public class Biblioteca {

    private PrintStream printStream;

    public Biblioteca(PrintStream printStream){

        this.printStream = printStream;
    }

    public void printWelcome() {
        printStream.println("Welcome to the Biblioteca!");
    }
}
