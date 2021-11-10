package ui;

import java.util.Scanner;

public class Menu {
    private Scanner inputFromUser;

    public Menu(){
        this.inputFromUser = new Scanner(System.in);
    }

    public void welcomeUser(){
        System.out.println("Welcome to the haiku application");
    }
}
