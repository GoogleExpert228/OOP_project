package base_operations;

public class OpenFileCommand extends FileCommand {
    public OpenFileCommand(String fileName) {
        super(fileName);
    }

    @Override
    public void operation() {
        System.out.println("Open file: " + getFileName());
    }
}
