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


    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        Menu menu = new Menu();

        menu.showWelcomeMessage();
        menu.listOptions();
        biblioteca.userOption();

    }

    public String listBooks() {
        StringBuilder stringBuilderOutput = new StringBuilder();
        for (int i = 0; i < libraryBooks.length; i++) {

            //stringBuilderOutput.append("bgbgb");
            Book book = libraryBooks[i];
            if (book.isBooked == false) {
                stringBuilderOutput.append(book.formatOutput());
            }
        }
        return stringBuilderOutput.toString();
    }


    public void userOption() {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        if (input.equals("1")) {
            System.out.print(listBooks());
        } else {
            invalidOption();
        }
    }


    public void invalidOption() {
        System.out.println("Select a valid option!");
    }

    public void reserveBook(Book book) {
        book.setBooked(book.isBooked());
    }

    /**
    public void userOption() {
        Scanner inputScanner = new Scanner(System.in);
        int userSelection = Integer.parseInt(inputScanner.next());
        if (userSelection == 0 ) {
            System.out.println("Bye and thanks for visiting!");
        }
        if (userSelection != 1) {
            invalidOption();
        }
        if (userSelection ==1) {
            listBooks();
            System.out.println("Which Book would you like to book?");
            int userBookSelection = Integer.parseInt(inputScanner.next());
            checkOutBook(userBookSelection);
            resetUserOptions();
        }
    }
     */

    /**
    public void checkOutBook(int bookNum) {
        libraryBooks.get(bookNum-1).isBooked = true;
        // Book checkingOutBook = libraryBooks.get(bookNum-1);
        //bookedLibraryBooks.add(checkingOutBook);
        //libraryBooks.remove(bookNum-1);
    }
     */

    /**
    private void resetUserOptions() {
        showMenu();
        userOption();
    }
     */


}
