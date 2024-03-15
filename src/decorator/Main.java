package decorator;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        DataSource file = new FileDataSource();

        // normal
        file.writeData("data 1");
        file.readData();

        // compression
        CompressionDecorator compressDecorator = new CompressionDecorator(file);
        compressDecorator.writeData("data 2");
        compressDecorator.readData();

        // encrypt
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(file);
        encryptionDecorator.writeData("data 3");
        encryptionDecorator.readData();

    }
}
