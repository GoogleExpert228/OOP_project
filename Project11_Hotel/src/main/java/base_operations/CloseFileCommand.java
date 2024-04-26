package base_operations;

public class CloseFileCommand extends FileCommand {
    public CloseFileCommand(String fileName) {
        super(fileName);
    }

    @Override
    public void operation() {
        System.out.println("Successfully closed: " + getFileName());
    }
}
