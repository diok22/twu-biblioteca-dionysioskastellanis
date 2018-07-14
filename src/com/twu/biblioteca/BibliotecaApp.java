package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class BibliotecaApp {

    ArrayList<Book> libraryBooks = new ArrayList();
    private final String[] menuList = {"1: List Books", "0: Quit"};


    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.welcomeMessage();
        biblioteca.addBook("Ready Player 1", "Ernest Cline", 2011);
        biblioteca.addBook("The Alchemist", "Paolo Coelho", 1993);
        biblioteca.showMenu();
        biblioteca.userOption();
        // biblioteca.listBooks();
    }

    public void welcomeMessage() {
        //StringBuilder returnString;
        //returnString = new StringBuilder();
        //returnString.append("Welcome to our Biblioteca");
        //System.out.println("test");
        //return returnString.toString();
        System.out.println("Welcome to our Biblioteca \n");
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
            System.out.println(menuList[i]);
        }
    }

    public void invalidOption() {
        System.out.println("Select a valid option!");
    }

    public void userOption() {
        System.out.println("Select an option");
        Scanner inputScanner = new Scanner(System.in);
        String userSelection = inputScanner.next();
        if (userSelection != "1") {
            invalidOption();
        }
    }


}
