package command.fileSystemCommand;

public class OpenFileCommand implements Commmand {

    FileSystem fileSystem;

    public OpenFileCommand( FileSystem fileSystem ) {
        this.fileSystem = fileSystem;
    }


    @Override
    public void execute() {
        fileSystem.openFile();
    }

}