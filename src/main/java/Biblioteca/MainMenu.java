package Biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class MainMenu {
    private BufferedReader reader;
    private PrintStream printStream;
    private Biblioteca biblioteca;

    public MainMenu(PrintStream printStream, BufferedReader input, Biblioteca biblioteca) {
        this.printStream = printStream;
        this.biblioteca = biblioteca;
        this.reader = input;
    }

    public void listOptions() {
        printStream.println("Please choose one of the following options: ");
        printStream.println("1. List library books");
    }

    public void choose() throws IOException {
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            biblioteca.printBookList();
        }
    }

    public void start() {
        biblioteca.printWelcome();
        listOptions();
    }
}
