package com.twu.biblioteca;

public class Movie {

    String name;
    int year;
    String director;
    int rating;
    boolean isBooked = false;

    public Movie(String name, int year, String director, int rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public String getDirector() {
        return this.director;
    }

    public int getRating() {
        return this.rating;
    }

    public boolean isBooked() {
        return this.isBooked;
    }

    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }



}
