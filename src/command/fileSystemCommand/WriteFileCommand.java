package command.fileSystemCommand;

public class WriteFileCommand implements Commmand {

    FileSystem fileSystem;

    public WriteFileCommand( FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }


    @Override
    public void execute() {
        fileSystem.writeFile();
    }

}