package base_operations;

public class SaveFileCommand extends FileCommand {
    public SaveFileCommand(String fileName) {
        super(fileName);
    }

    @Override
    public void operation() {
        System.out.println("File saved: " + getFileName());
    }
}
