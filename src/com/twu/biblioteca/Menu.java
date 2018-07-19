package com.twu.biblioteca;

public class Menu {

    private String[] options = new String[]{"1. List Books"};

    public String showWelcomeMessage() {
        return("Welcome to our Biblioteca");
    }

    public String listOptions() {
        StringBuilder stringBuilderOutput = new StringBuilder();
        for (int i = 0; i < options.length; i++) {
            String option = options[i];
            stringBuilderOutput.append(option + "\n");
        }
        return stringBuilderOutput.toString();
    }

}
