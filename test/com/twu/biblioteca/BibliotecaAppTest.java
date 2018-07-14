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
        assertEquals("Welcome to our Biblioteca", biblioteca.welcomeMessage());
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
    public void testShowMenu() {
        biblioteca.showMenu();
        assertTrue(systemPrintOut.toString().contains("1: List Books"));
        //assertTrue(systemOut().contains("0 : List Books\n"));

    }

    @Test
    public void testInvalidOptionMessage() {
        assertEquals("Select a valid option!", biblioteca.invalidOption());
    }



}
