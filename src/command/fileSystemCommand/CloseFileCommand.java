package command.fileSystemCommand;

public class CloseFileCommand implements Commmand {

    FileSystem fileSystem;

    public CloseFileCommand( FileSystem fileSystem ) {
        this.fileSystem = fileSystem;
    }
    @Override
    public void execute() {
        fileSystem.closeFile();
    }

}