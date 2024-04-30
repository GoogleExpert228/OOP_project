package SomePackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class XmlGetterFromFile {

    public static void getAllRooms(String fileName) {
        try {
            File file = new File(fileName.toLowerCase());
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("<room>")) {
                    parseRoom(br);
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parseRoom(BufferedReader br) throws IOException {
        String number = "";
        String available = "";
        String note = "";

        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains("<number>")) {
                number = extractValue(line);
            } else if (line.contains("<available>")) {
                available = extractValue(line);
            } else if (line.contains("<note>")) {
                note = extractValue(line);
            } else if (line.contains("</room>")) {
                break;
            }
        }

        // Print room information
        System.out.println("Room Number: " + number);
        System.out.println("Available: " + available);
        System.out.println("Note: " + note);
        System.out.println("-----------------------");
    }

    private static String extractValue(String line) {
        int startIndex = line.indexOf(">") + 1;
        int endIndex = line.lastIndexOf("<");
        return line.substring(startIndex, endIndex);
    }
}
