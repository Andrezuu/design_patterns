package decorator;

public class CompressionDecorator extends DataSourceDecorator{

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void readData() {
        System.out.println( data + "data comprimida" ); 
    }

    @Override
    public void writeData(String data) {
        this.data = data;
        System.out.println("data guardada comprimida");
    }
    
    
}
