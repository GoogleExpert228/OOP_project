package base_operations;

public class SaveAsFileCommand extends FileCommand {
    public SaveAsFileCommand(String fileName) {
        super(fileName);
    }

    @Override
    public void operation() {
        System.out.println("File saved as: " + getFileName());
    }
}
