package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
// import org.junit.After;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
// import java.io.ByteArrayInputStream;



public class BibliotecaAppTest {

    BibliotecaApp biblioteca;

    private Book[] libraryBooks = new Book[] {
            new Book("Ready Player One", "Ernest Cline", 2011),
            new Book("Flash Boys", "Michael Lewis", 2015)
    };




    private ByteArrayOutputStream systemPrintOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        biblioteca = new BibliotecaApp();
        System.setOut(new PrintStream(systemPrintOut));
    }

    @Test
    public void testWelcomeMessage() {
        assertEquals("Welcome to our Biblioteca", biblioteca.welcomeMessage());
    }



    @Test
    public void testListBooks() {
        String testLibraryBooksStringOutput = "Ready Player One - Ernest Cline - 2011\n" +
                "Flash Boys - Michael Lewis - 2015\n";
        assertEquals(testLibraryBooksStringOutput, biblioteca.listBooks());
    }




    @Test
    public void testShowMenuListBooks() {
        assertEquals("1. List Books" + "\n", biblioteca.showMenu());
    }


    /**
    @Test
    public void testShowMenuQuit() {
        biblioteca.showMenu();
        assertTrue(systemPrintOut.toString().contains("0: Quit"));
    }
    */

    /**
    @Test
    public void testInvalidOptionMessage() {
        biblioteca.invalidOption();
        assertTrue(systemPrintOut.toString().contains("Select a valid option!"));
    }
    */

    /**
    @Test
    public void testCheckoutBook() {
        biblioteca.checkOutBook(1);
        assertFalse(String.valueOf(false), biblioteca.libraryBooks.isEmpty());
    }

    */



}
