package base_operations;

import java.io.*;
import java.util.Scanner;

public class OpenFileCommand extends FileCommand {
    public OpenFileCommand(String fileName) {
        super(fileName);
    }

    @Override
    public void operation() {
        BufferedReader bf = null;
        try {
            File file = new File(getFileName());

            if(!file.exists()) {
                System.out.println("the file was not found\n" + "Creating file with that name in that directory!");
                file.createNewFile();
            } else {
                System.out.println("File open successfully!");

                bf = new BufferedReader(new FileReader(getFileName()));
                String line;
                String content = "";
                while((line = bf.readLine()) != null) {
                    content = getFileContent() + "\n" + line;
                    setFileContent(content);
                }

                System.out.println(getFileContent() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
