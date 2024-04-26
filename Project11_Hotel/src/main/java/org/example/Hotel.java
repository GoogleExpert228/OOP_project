package org.example;

import base_operations.CloseFileCommand;
import base_operations.Command;
import base_operations.OpenFileCommand;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        String fileName="";
        boolean isFileOpen = false;


        while(true) {
            System.out.print("Enter command please: ");
            command = scanner.nextLine();

            if(command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            String[] words = command.split("\\s+");

            if(words[0].equalsIgnoreCase("open")) {
                if (words.length > 1) {
                    fileName = command.substring(words[0].length()).trim();
                    Command.operation(new OpenFileCommand(fileName));
                    isFileOpen = true;
                } else {
                    System.out.println("No file specified to open.");
                }
            }

            if(isFileOpen) {
                if(words[0].equalsIgnoreCase("close")) {
                    Command.operation(new CloseFileCommand(fileName));
                    isFileOpen = false;
                }
            } else {
                System.out.println("First you need to open the file!");
            }
        }
    }
}