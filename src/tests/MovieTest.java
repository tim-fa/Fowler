package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.fowler.base.*;

public class MovieTest {

    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Movie Title", new RegularPrice());
    }

    @Test
    public void getPriceCode() {
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    public void getTitle() {
        assertEquals("Movie Title", movie.getTitle());
    }

}