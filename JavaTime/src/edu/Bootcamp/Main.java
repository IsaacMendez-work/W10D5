package edu.Bootcamp;

import java.time.*; // We'll be using Java's built-in Time class

public class Main {

    public static void main(String[] args) {

    }

//      Time and date in Java are divided into time-of-events (important for sequencing and timestamps), local human-friendly time (your date and time of day), and global human-friendly time (data and time of the day, but understanding and working with time zones).

    static void checkRelationship (Instant otherInstant) {
//      In Java, we use the Instant class to optimize time-stamping events, comparing relative time, and it can be converted into a more complex date/time type.

        Instant nowInstant = Instant.now();

        System.out.println(nowInstant);

        if (otherInstant.compareTo(nowInstant) > 0) {
//      .compareTo() will return a positive neutral or negative result by comparing otherInstant to nowInstant
//      If this returns true, it tells us that otherInstant comes after nowInstant
            System.out.println("Instant is in the future");

//      The opposite can also be checked, to see if otherInstant comes before nowInstant
        } else if (otherInstant.compareTo(nowInstant) < 0) {
            System.out.println("Instant is in the past");

//      If both instants match, they represent the same moment in time
        } else if (otherInstant.compareTo(nowInstant) == 0) {
            System.out.println("Instant is now");

//      Lastly, stuff breaks sometimes..
        } else System.out.println("There's been an error, frand.");
    }
}
