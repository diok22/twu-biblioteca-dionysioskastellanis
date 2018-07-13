package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaApp {

    ArrayList<Book> libraryBooks = new ArrayList();

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        //biblioteca.welcomeMessage();
        //biblioteca.addBook("Ready Player 1", "Ernest Cline", 2011);
        //biblioteca.addBook("The Alchemist", "Paolo Coelho", 1993);
        //biblioteca.showMenu();
        //biblioteca.listBooks();

    }

    public String welcomeMessage() {
        return "Welcome to our Biblioteca";
    }


    public void addBook(String title, String author, int publicationDate) {
        Book addingBook = new Book(title, author, publicationDate);
        libraryBooks.add(addingBook);
    }

    public void listBooks() {
        System.out.println("Title of Book" + "\t\t" + "Author" + "\t\t" + "Publication Date");
        for (Book book : libraryBooks) {
            System.out.println(book.title + "\t\t" + book.author + "\t\t" + book.publicationDate);
        }
    }

    public String showMenu() {
        return ("1: List Books");
    }


}
