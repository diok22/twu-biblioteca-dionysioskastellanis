package com.twu.biblioteca;

public class Menu {

    private String[] options = new String[]{"1. List Books","2. Checkout book", "0. Quit", };

    public void showWelcomeMessage() {
        System.out.print("Welcome to our Biblioteca \n");
    }


    public void listOptions() {
        StringBuilder stringBuilderOutput = new StringBuilder();
        for (int i = 0; i < options.length; i++) {
            String option = options[i];
            stringBuilderOutput.append(option + "\n");
        }
        System.out.println(stringBuilderOutput.toString());
    }

    public void invalidOption() {
        System.out.println("Select a valid option!");
    }

    public void selectInvalidUserOption(int input){

    }




}
