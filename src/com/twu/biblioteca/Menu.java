package com.twu.biblioteca;

public class Menu {

    private String[] options = new String[]{"1. List Books","2. List Movies", "3. Checkout book", "4. Return book","5. Checkout movie" ,"0. Quit", };

    public void showWelcomeMessage() {
        System.out.print("Welcome to our Biblioteca \n");
    }


    public void listOptions() {
        StringBuilder stringBuilderOutput = new StringBuilder();
        for (String option : options) {
            stringBuilderOutput.append(option + "\n");
        }
        System.out.println(stringBuilderOutput.toString());
    }

    public void invalidOption() {
        System.out.println("Select a valid option!");
    }


}
