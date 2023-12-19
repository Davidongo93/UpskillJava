package Main;

import presentation.MenuLayer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //console CLI

        MenuLayer.showMenu(scanner);
        scanner.close();
    }
};