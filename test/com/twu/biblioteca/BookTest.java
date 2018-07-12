package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {


    public Book book;

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

}