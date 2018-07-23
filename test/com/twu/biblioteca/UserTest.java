package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class UserTest {

    private User user1;

    @Before
    public void setUp() {
        user1 = new User("111-3456", 12345678);
    }

    @Test
    public void getLibraryNumberTest() {
        assertEquals("111-3456", user1.getLibraryNumber());
    }

    @Test
    public void getPassword() {
        assertEquals(12345678, user1.getPassword());
    }




}
