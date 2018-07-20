package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class BibliotecaApp {

    private Book[] libraryBooks = new Book[] {
            new Book("Ready Player One", "Ernest Cline", 2011),
            new Book("Flash Boys", "Michael Lewis", 2015),
            new Book("Foundation", "Isaac Asimov", 1951),
            new Book("The Hobbit", "J.R.R. Tolkien", 1937)
    };

    private Menu menu = new Menu();

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();

        biblioteca.userOption(getUserOption());

    }

    public String listBooks() {
        StringBuilder stringBuilderOutput = new StringBuilder();
        for (int i = 0; i < libraryBooks.length; i++) {

            Book book = libraryBooks[i];
            if (book.isBooked == false) {
                stringBuilderOutput.append(book.formatOutput());
            }
        }
        return stringBuilderOutput.toString();
    }

    public static String getUserOption(){
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        return input;
    }


    public void userOption( String input) {

        while (!input.equals("0")) {
            if (input.equals("1")) {
                System.out.print(listBooks());
            } else if (input.equals("2")) {
                System.out.println("Which book title would you like to check out?");
                checkoutBook();
            } else {
                invalidOption();
            }
            //input = getUserOption();
        }
    }

    public void userSelectionScreen() {
        menu.showWelcomeMessage();
        String selection = "-1";
         while (!selection.equals("0")) {
             menu.listOptions();
             selection = getUserOption();

        }

    }


    public void invalidOption() {
        System.out.println("Select a valid option!");
    }

    public void reserveBook(Book book) {
        book.setBooked(book.isBooked());
    }

    public void checkoutBook() {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        for (Book book : libraryBooks) {
            if (book.getTitle().equals(input) && !book.isBooked()) {
                book.setBooked(true);
                System.out.println("Thank you! Enjoy the book");
            }

        }
        System.out.println("The Books is not available");
        System.out.print(listBooks());
    }

}
