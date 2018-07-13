package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class BibliotecaAppTest {

    BibliotecaApp biblioteca;

    @Before
    public void setUp() {
        biblioteca = new BibliotecaApp();
        biblioteca.addBook("Ready Player 1", "Ernest Cline", 2011);
        biblioteca.addBook("The Alchemist", "Paolo Coelho", 1993);
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



}
