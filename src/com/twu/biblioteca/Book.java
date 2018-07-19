package com.twu.biblioteca;

public class Book {
    int bookId;
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

    public String formatOutput() {
        String titleString = this.getTitle();
        String authorString = this.getAuthor();
        int publicationDateString = this.getPublicationDate();
        return String.format("%s - %s - %d\n",
                title, author, publicationDate);
    }

    public boolean isBooked() {
        return this.isBooked;
    }




}
