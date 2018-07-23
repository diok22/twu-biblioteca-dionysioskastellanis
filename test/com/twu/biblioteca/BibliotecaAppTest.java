package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;



public class BibliotecaAppTest {

    BibliotecaApp biblioteca;

    private Book[] libraryBooks = new Book[] {
            new Book("Ready Player One", "Ernest Cline", 2011),
            new Book("Flash Boys", "Michael Lewis", 2015),
            new Book("Foundation", "Isaac Asimov", 1951),
            new Book("The Hobbit", "J.R.R. Tolkien", 1937)
    };

    String testLibraryBooksStringOutput;
    String testLibraryMoviesStringOutput;


    private ByteArrayOutputStream systemPrintOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        biblioteca = new BibliotecaApp();
        System.setOut(new PrintStream(systemPrintOut));
        testLibraryBooksStringOutput = "Ready Player One - Ernest Cline - 2011\n" +
                "Flash Boys - Michael Lewis - 2015\n" +
                "Foundation - Isaac Asimov - 1951\n" +
                "The Hobbit - J.R.R. Tolkien - 1937\n\n";
        testLibraryMoviesStringOutput = "Batman Begins - 2005 - Christopher Nolan - 8\n" +
                "The Dark Knight - 2008 - Christopher Nolan - 9\n" +
                "The Dark Knight Rises - 2012 - Christopher Nolan - 8\n\n";
    }


    @Test
    public void testListBooks() {
        assertEquals(testLibraryBooksStringOutput, biblioteca.listBooks());
    }

    @Test
    public void testListMovies() {
        assertEquals(testLibraryMoviesStringOutput, biblioteca.listMovies());
    }


    @Test
    public void testUserInputListingBooks() {
        // ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("1".getBytes());
        // System.setIn(systemPrintIn);
        biblioteca.userOption("1");
        assertTrue(systemPrintOut.toString().contains("Ready Player One"));
    }

    @Test
    public void testUserInputListingMovies() {
        biblioteca.userOption("2");
        assertTrue(systemPrintOut.toString().contains("The Dark Knight"));
    }



    @Test
    public void testInvalidOptionMessage() {
        //ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("S".getBytes());
        //System.setIn(systemPrintIn);
        biblioteca.userOption("S");
        assertEquals("Select a valid option!\n", systemPrintOut.toString());
    }



    @Test
    public void testCheckoutBookInput() {
        ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("Foundation".getBytes());
        System.setIn(systemPrintIn);
        biblioteca.userOption("3");
        assertTrue(systemPrintOut.toString().contains("Thank you! Enjoy the book"));
    }

    @Test
    public void testCheckoutMovieInput() {
        ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("The Dark Knight".getBytes());
        System.setIn(systemPrintIn);
        biblioteca.userOption("5");
        assertTrue(systemPrintOut.toString().contains("Thank you! Enjoy the movie"));
    }


    @Test
    public void testCheckoutBookNotInListInput() {
        ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("Foundation".getBytes());
        System.setIn(systemPrintIn);
        biblioteca.userOption("3");
        assertFalse(systemPrintOut.toString().contains("Foundation"));
    }

    @Test
    public void testCheckoutUnavailableBookInput() {
        ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("The Last Question".getBytes());
        System.setIn(systemPrintIn);
        biblioteca.userOption("3");
        assertTrue(systemPrintOut.toString().contains("The Book is not available"));

    }


    @Test
    public void testReturnBookInput() {
        ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("Foundation".getBytes());
        System.setIn(systemPrintIn);
        biblioteca.userOption("3");
        ByteArrayInputStream systemPrintIn2 = new ByteArrayInputStream("Foundation".getBytes());
        System.setIn(systemPrintIn2);
        biblioteca.userOption("4");
        assertTrue(systemPrintOut.toString().contains("Thank you for returning the book"));
    }

    @Test
    public void testReturnBookInListInput() {
        ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("Foundation".getBytes());
        System.setIn(systemPrintIn);
        biblioteca.userOption("3");
        ByteArrayInputStream systemPrintIn2 = new ByteArrayInputStream("Foundation".getBytes());
        System.setIn(systemPrintIn2);
        biblioteca.userOption("4");
        assertTrue(systemPrintOut.toString().contains("Foundation"));
    }

    @Test
    public void testReturnUnavailableBookInListInput() {
        ByteArrayInputStream systemPrintIn = new ByteArrayInputStream("Foundation".getBytes());
        System.setIn(systemPrintIn);
        biblioteca.userOption("3");
        ByteArrayInputStream systemPrintIn2 = new ByteArrayInputStream("Foundationss".getBytes());
        System.setIn(systemPrintIn2);
        biblioteca.userOption("4");
        assertTrue(systemPrintOut.toString().contains("That is not a valid book return"));
    }


}
