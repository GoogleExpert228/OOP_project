package org.example;

import base_operations.Command;
import base_operations.OpenFileCommand;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";

        while(true) {
            command = scanner.nextLine();

            if(command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            String[] words = command.split("\\s+");

            if(words[0].equalsIgnoreCase("open")) {
                if (words.length > 1) {
                    String filePath = command.substring(words[0].length()).trim();
                    Command.operation(new OpenFileCommand(filePath));

                    //все остальное меню здесь!!!

                    //
                } else {
                    System.out.println("No file specified to open.");
                }
            }
        }
    }
}