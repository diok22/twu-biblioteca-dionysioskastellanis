package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



public class BibliotecaAppTest {

    BibliotecaApp biblioteca;
    private ByteArrayOutputStream systemPrintOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        biblioteca = new BibliotecaApp();
        biblioteca.addBook("Ready Player 1", "Ernest Cline", 2011);
        biblioteca.addBook("The Alchemist", "Paolo Coelho", 1993);
        System.setOut(new PrintStream(systemPrintOut));
    }

    @Test
    public void testWelcomeMessage() {
        biblioteca.welcomeMessage();
        assertTrue(systemPrintOut.toString().contains("Welcome to our Biblioteca"));
    }


    @Test
    public void testAddBook() {
        assertFalse(String.valueOf(false), biblioteca.libraryBooks.isEmpty());
    }

    /**
    @Test
    public void testListBooks() {
        assertThat("Head First Java", biblioteca.listBooks());
    }
    */

    @Test
    public void testShowMenuListBooks() {
        biblioteca.showMenu();
        assertTrue(systemPrintOut.toString().contains("1: List Books"));
    }

    @Test
    public void testShowMenuQuit() {
        biblioteca.showMenu();
        assertTrue(systemPrintOut.toString().contains("0: Quit"));
    }

    /**
    @Test
    public void testInvalidOptionMessage() {
        biblioteca.invalidOption();
        assertTrue(systemPrintOut.toString().contains("Select a valid option!"));
    }
    */

    @Test
    public void testCheckoutBook() {
        biblioteca.checkOutBook(1);
        assertFalse(String.valueOf(false), biblioteca.libraryBooks.isEmpty());
    }


}
