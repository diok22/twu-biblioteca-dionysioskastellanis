package com.twu.biblioteca;

import org.junit.After;
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
    }


    /**
    @Test
    public void testInvalidUserOption() {
        menu.selectOptionInput();
        assertTrue(systemPrintOut.toString().contains("Invalid Option!"));
    }
    */



}
