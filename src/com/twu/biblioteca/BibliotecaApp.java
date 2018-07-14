package com.twu.biblioteca;

import java.util.ArrayList;
// import java.util.Scanner;


public class BibliotecaApp {

    ArrayList<Book> libraryBooks = new ArrayList();
    private final String[] menuList = {"1: List Books"};


    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.welcomeMessage();
        biblioteca.addBook("Ready Player 1", "Ernest Cline", 2011);
        biblioteca.addBook("The Alchemist", "Paolo Coelho", 1993);
        biblioteca.showMenu();
        // biblioteca.listBooks();
    }

    public String welcomeMessage() {
        //StringBuilder returnString;
        //returnString = new StringBuilder();
        //returnString.append("Welcome to our Biblioteca");
        //System.out.println("test");
        //return returnString.toString();
        return ("Welcome to our Biblioteca");
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

    public void showMenu() {
        for (int i = 0; i<menuList.length; i++) {
            System.out.println(menuList[0]);
        }
    }

    public String invalidOption() {
        return ("Select a valid option!");
    }


}
