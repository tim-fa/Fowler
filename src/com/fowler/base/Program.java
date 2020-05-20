package com.fowler.base;

import java.lang.*;
import java.util.*;

/**
 * Note that Java console applications need to be run through the java runtime
 * by running "java -jar JarFile.jar" in the command line.
 * Java console applications can not be previewed in the Compilr IDE, only applets can.
 */
public class Program {

    public void initialize() {
        System.out.println("Welcome to the Movie Store");
        Movie m1 = new Movie("movie1", new NewReleasePrice());
        Movie m2 = new Movie("movie2", new ChildrenPrice());
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);
        c1.addRental(r2);
        System.out.println("Let's get the Statement");
        String statement = c1.statement();
        System.out.println(statement);
    }
}


