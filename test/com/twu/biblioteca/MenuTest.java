package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;


public class MenuTest {

    private ByteArrayOutputStream systemPrintOut = new ByteArrayOutputStream();
    private Menu menu = new Menu();

    @Before
    public void setUp(){
        System.setOut(new PrintStream(systemPrintOut));
    }

    @Test
    public void testWelcomeMessage() {
        menu.showWelcomeMessage();
        assertEquals("Welcome to our Biblioteca \n", systemPrintOut.toString());
    }

    @Test
    public void testListOptions() {
        menu.listOptions();
        assertTrue(systemPrintOut.toString().contains("1. List Books"));
        assertTrue(systemPrintOut.toString().contains("2. Checkout book"));
        assertTrue(systemPrintOut.toString().contains("3. Return book"));
        assertTrue(systemPrintOut.toString().contains("0. Quit"));

    }




}
