package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int publicationDate;
    public boolean isBooked = false;
    private String checkedOutUser = null;

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
        return(titleString + " - " + authorString + " - " + publicationDateString + "\n");
    }

    public boolean isBooked() {
        return this.isBooked;
    }


    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }

    public String getCheckedOutUser() {
        return this.checkedOutUser;
    }
}
