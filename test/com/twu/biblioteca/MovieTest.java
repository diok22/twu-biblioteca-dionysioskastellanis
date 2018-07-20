package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MovieTest {

    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("The Dark Knight", 2008, "Christopher Nolan", 9);
    }

    @Test
    public void testGetName() {
        assertEquals("The Dark Knight", movie.getName());
    }

    @Test
    public void testGetYear() {
        assertEquals(2008, movie.getYear());
    }

    @Test
    public void testGetDirector() {
        assertEquals("Christopher Nolan", movie.getDirector());
    }

    @Test
    public void testGetRating() {
        assertEquals(9, movie.getRating());
    }

    @Test
    public void testIsBookedIsFalseByDefault() {
        assertFalse(movie.isBooked());
    }

    @Test
    public void testSetBooked() {
        movie.setBooked(true);
        assertTrue(movie.isBooked());
    }



}
