package base_operations;

import interfaces.BaseCommand;

public abstract class FileCommand implements BaseCommand {
    private String fileName;

    public FileCommand(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }
}
