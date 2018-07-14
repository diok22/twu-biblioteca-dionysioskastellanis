package com.twu.biblioteca;

public class Book {
    String title;
    String author;
    int publicationDate;
    boolean isBooked = false;

    public Book(String title, String author, int publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return  this.author;
    }

    public int getPublicationDate() {
        return this.publicationDate;
    }

    public boolean isBooked() {
        return this.isBooked;
    }

}
