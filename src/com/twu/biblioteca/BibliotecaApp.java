package com.twu.biblioteca;


public class BibliotecaApp {

    String books[] = {"Ready Player one", "The Alchemist"};

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.welcomeMessage();

    }

    public String welcomeMessage() {
        return "Welcome to our Biblioteca";
    }

    public String[] listBooks() {
        return books;
    }
}
