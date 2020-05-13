package com.fowler.base;

class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int rentDuration) {
        this.movie = movie;
        this.daysRented = rentDuration;
    }

    public int getRentDuration() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getFrequentRenterPoints() {
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getRentDuration() > 1) {
            return 2;
        }
        return 1;
    }
}