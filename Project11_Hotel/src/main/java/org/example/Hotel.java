package org.example;

import SomePackage.XmlGetterFromFile;
import base_operations.*;

import java.io.*;
import java.util.Scanner;


public class Hotel {
    public static void main(String[] args) {

        XmlGetterFromFile.getAllRooms("rooms.xml");

        Scanner scanner = new Scanner(System.in);
        String command = "";
        String fileName="";
        boolean isFileOpen = false;

        System.out.println("If you don't know commands name, enter help command then\n");
        while(true) {
            System.out.print("Enter command please: ");
            command = scanner.nextLine();

            if(command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            if(command.equalsIgnoreCase("help")) {
                System.out.println("The following commands are supported:\n open <file> - opens <file> \n close - closes currently opened file\n save - saves the currently open file\n saveas <file> - saves the currently open file in <file>\n help - prints this information\n exit - exists the program\n");
                continue;
            }

            String[] words = command.split("\\s+");

            if(words[0].equalsIgnoreCase("open")) {
                if (words.length > 1) {
                    fileName = command.substring(words[0].length()).trim();
                    Command.operation(new OpenFileCommand(fileName));
                    isFileOpen = true;
                } else {
                    System.out.println("No file specified to open.\n");
                    continue;
                }
            }

            if(isFileOpen) {
                if(words[0].equalsIgnoreCase("close")) {
                    Command.operation(new CloseFileCommand(fileName));
                    isFileOpen = false;
                }

                if(words[0].equalsIgnoreCase("save")) {
                    Command.operation(new SaveFileCommand(fileName));
                }

                if(words[0].equalsIgnoreCase("saveas")) {
                    Command.operation(new SaveAsFileCommand(fileName));
                }
            } else {
                System.out.println("First you need to open the file!\n");
            }
        }
    }
}

