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

        biblioteca.userSelectionScreen();

    }

    public String listBooks() {
        StringBuilder stringBuilderOutput = new StringBuilder();
        for (Book book : libraryBooks) {
            if (!book.isBooked) {
                stringBuilderOutput.append(book.formatOutput());
            }
        }
        return stringBuilderOutput.append("\n").toString();
    }

    public static String getUserOption(){
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        return input;
    }


    public void userOption( String input) {
         if (input.equals("1")) {
                System.out.print(listBooks());
         } else if (input.equals("2")) {
             System.out.println("Which book title would you like to check out?");
             checkoutBook();
         } else if (input.equals("3")) {
             System.out.println("Which book title would you like to check out?");
             returnBook();
         }
         else {
             menu.invalidOption(); }
    }

    public void userSelectionScreen() {
        menu.showWelcomeMessage();
        String selection = "-1";
         while (!selection.equals("0")) {
             menu.listOptions();
             selection = getUserOption();
             userOption(selection);
        }
    }


    public void checkoutBook() {
        boolean bookFound = false;
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        for (Book book : libraryBooks) {
            if (book.getTitle().equals(input) && !book.isBooked()) {
                book.setBooked(true);
                bookFound = true;
                System.out.println("Thank you! Enjoy the book \n");
            }
        }
        if (!bookFound) {
            System.out.println("The Book is not available \n");
        }
        System.out.print(listBooks());
    }

    public void returnBook() {
        boolean bookFound = false;
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        for (Book book : libraryBooks) {
            if (book.getTitle().equals(input) && book.isBooked()) {
                book.setBooked(false);
                bookFound = true;
                System.out.println("Thank you for returning the book \n");
            }
        }
        if (!bookFound) {
            System.out.println("That is not a valid book return \n");
        }
        System.out.print(listBooks());
    }


}
