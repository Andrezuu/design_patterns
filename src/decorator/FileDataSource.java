package decorator;

public class FileDataSource implements DataSource {

    String myData;

    @Override
    public void writeData(String data) {
        myData = data;
        System.out.println( "Data guardada" );
    }

    @Override
    public void readData() {
        System.out.println( "La data es" + myData );
    }
    
}
