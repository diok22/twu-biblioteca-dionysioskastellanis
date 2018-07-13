package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaApp {

    ArrayList<Book> libraryBooks = new ArrayList();

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.welcomeMessage();

    }

    public String welcomeMessage() {
        return "Welcome to our Biblioteca";
    }

    public void addBook(String title, String author, int publicationDate) {
        Book addingBook = new Book(title, author, publicationDate);
        libraryBooks.add(addingBook);
    }

    public ArrayList listBooks() {
        return libraryBooks;
    }
}
