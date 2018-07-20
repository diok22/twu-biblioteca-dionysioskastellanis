package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
// import org.junit.After;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;



public class BibliotecaAppTest {

    BibliotecaApp biblioteca;

    private Book[] libraryBooks = new Book[] {
            new Book("Ready Player One", "Ernest Cline", 2011),
            new Book("Flash Boys", "Michael Lewis", 2015),
            new Book("Foundation", "Isaac Asimov", 1951),
            new Book("The Hobbit", "J.R.R. Tolkien", 1937)
    };

    String testLibraryBooksStringOutput;


    private ByteArrayOutputStream systemPrintOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        biblioteca = new BibliotecaApp();
        System.setOut(new PrintStream(systemPrintOut));
        testLibraryBooksStringOutput = "Ready Player One - Ernest Cline - 2011\n" +
                "Flash Boys - Michael Lewis - 2015\n" +
                "Foundation - Isaac Asimov - 1951\n" +
                "The Hobbit - J.R.R. Tolkien - 1937\n";
    }


    @Test
    public void testListBooks() {
        assertEquals(testLibraryBooksStringOutput, biblioteca.listBooks());
    }



    @Test
    public void testUserInputListingBooks() {
        // ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("1".getBytes());
        // System.setIn(systemPrintIn);
        biblioteca.userOption("1");
        assertTrue(systemPrintOut.toString().contains("Ready Player One"));
    }



    @Test
    public void testInvalidOptionMessage() {
        //ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("S".getBytes());
        //System.setIn(systemPrintIn);
        biblioteca.userOption("S");
        assertEquals(systemPrintOut.toString(), "Select a valid option!\n");
    }



    @Test
    public void testCheckoutBook() {
        ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("Foundation".getBytes());
        System.setIn(systemPrintIn);
        biblioteca.userOption("2");
        assertTrue(systemPrintOut.toString().contains("Thank you! Enjoy the book"));
    }

    @Test
    public void testCheckoutBookNotInList() {
        ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("Foundation".getBytes());
        System.setIn(systemPrintIn);
        biblioteca.userOption("2");
        assertFalse(systemPrintOut.toString().contains("Foundation"));
    }





}
