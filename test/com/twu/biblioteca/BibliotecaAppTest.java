package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void testWelcomeMessage() {
        assertEquals("Welcome to our Biblioteca", biblioteca.welcomeMessage());
    }
}
