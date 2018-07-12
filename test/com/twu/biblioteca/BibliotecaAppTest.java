package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BibliotecaAppTest {

    public BibliotecaApp biblioteca;


    @Before
    public void setUp() {
        biblioteca = new BibliotecaApp();
    }

    @Test
    public void testWelcomeMessage() {
        assertEquals("Welcome to our Biblioteca", biblioteca.welcomeMessage());
    }

    @Test
    public void testListBooks() {
        String books[] = {"Ready Player one", "The Alchemist"};
        assertEquals(books, biblioteca.books());
    }
}
