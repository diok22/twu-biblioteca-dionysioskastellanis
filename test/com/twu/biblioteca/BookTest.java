package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BookTest {


    private Book book;

    @Before
    public void setUp() {
        book = new Book("Ready Player One", "Ernest Cline", 2011);
    }

    @Test
    public void testGetTitle() {
        assertEquals("Ready Player One", book.getTitle());
    }

    @Test
    public void testGetAuthor() {
        assertEquals("Ernest Cline", book.getAuthor());
    }

    @Test
    public void testGetPublicationDate() {
        assertEquals(2011, book.getPublicationDate());
    }

    @Test
    public void testFormatOutput() {
        assertEquals("Ready Player One - Ernest Cline - 2011\n", book.formatOutput());
    }

    @Test
    public void testIsBookedIsFalseByDefault() {
        assertFalse(book.isBooked());
    }

    @Test
    public void testSetBooked() {
        book.setBooked(true);
        assertTrue(book.isBooked());
    }

}