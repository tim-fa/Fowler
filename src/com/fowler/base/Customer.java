package com.fowler.base;

import java.lang.*;
import java.util.*;

class Customer {
    private final String name;
    private final Vector<Rental> rentals = new Vector<Rental>();

    public Customer(String customerName) {
        name = customerName;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + this.getName() + "\n");
        result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

        while (enum_rentals.hasMoreElements()) {
            Rental rental = (Rental) enum_rentals.nextElement();
            //show figures for this rental
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append("\t").append(rental.getRentDuration()).append("\t").append(String.valueOf(rental.getMovie().getCharge(rental.getRentDuration()))).append("\n");
        }
        //add footer lines
        result.append("Amount owed is ").append(String.valueOf(getTotalCharge())).append("\n");
        result.append("You earned ").append(String.valueOf(getTotalFrequentRenterPoints())).append(" frequent renter points");
        return result.toString();
    }

    private double getTotalCharge() {
        double charge = 0;
        Enumeration enum_rentals = rentals.elements();
        while (enum_rentals.hasMoreElements()) {
            Rental rental = (Rental) enum_rentals.nextElement();
            charge += getCharge(rental);
        }
        return charge;
    }

    private int getTotalFrequentRenterPoints() {
        int points = 0;
        Enumeration enum_rentals = rentals.elements();
        while (enum_rentals.hasMoreElements()) {
            Rental rental = (Rental) enum_rentals.nextElement();
            points += rental.getFrequentRenterPoints();
        }
        return points;
    }

    private double getCharge(Rental rental) {
        return rental.getMovie().getCharge(rental.getRentDuration());
    }

}
    