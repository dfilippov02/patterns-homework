package proxy;

public class DBConnectorImpl implements DBConnector {

    private final String name;

    public DBConnectorImpl(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println("Подключаюсь к " + getName());
    }

    public String getName() {
        return name;
    }
}
