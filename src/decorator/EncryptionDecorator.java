package decorator;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void readData() {
        System.out.println( "Data encryptada" );
    }

    @Override
    public void writeData(String data) {
        this.data = data;
        System.out.println( "Le encripta la cola");
    }
    
}
