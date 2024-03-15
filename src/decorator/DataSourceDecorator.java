package decorator;

public abstract class DataSourceDecorator implements DataSource {
    
    DataSource dataSource;
    String data;

    public DataSourceDecorator ( DataSource dataSource ) {
        this.dataSource = dataSource;
    }

    @Override
    public void readData() {
        this.readData();
    }

    @Override
    public void writeData(String data) {
        this.writeData(data);
    }

    
}
