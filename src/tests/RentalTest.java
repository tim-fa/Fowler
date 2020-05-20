package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.fowler.base.*;

public class RentalTest {

    private Rental rental;
    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Movie Title", new RegularPrice());
        rental = new Rental(movie, 10);
    }

    @Test
    public void getDaysRented() {
        assertEquals(10, rental.getRentDuration());
    }

    @Test
    public void getMovie() {
        assertEquals(movie, rental.getMovie());
    }

}