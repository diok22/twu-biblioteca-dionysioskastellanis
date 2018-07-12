package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void testWelcomeMessage() {
        BibliotecaApp biblioteca = new BibliotecaApp();
        assertEquals("Welcome to our Biblioteca", biblioteca.welcomeMessage());
    }
}
