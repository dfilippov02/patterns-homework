package proxy;

public class DBConnectorProxy implements DBConnector {

    private final DBConnectorImpl dbConnector;

    public DBConnectorProxy(DBConnectorImpl dbConnector, String address) {
        this.dbConnector = new DBConnectorImpl( address + "/" + dbConnector.getName());
    }

    @Override
    public void connect() {
        dbConnector.connect();
    }
}
