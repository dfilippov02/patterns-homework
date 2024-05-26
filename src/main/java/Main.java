import adapter.*;
import factory.CoffeeMachine;
import factory.CoffeeType;
import factory.Facility;
import proxy.DBConnector;
import proxy.DBConnectorImpl;
import proxy.DBConnectorProxy;
import singleton.SingletonLogger;

public class Main {

    public static void main(String[] args) {

        // singleton logger
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.classLog(logger, "test message!");

        // coffee factory
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Facility facility = new Facility(coffeeMachine);
        facility.start(CoffeeType.ESPRESSO);
        facility.start(CoffeeType.AMERICANO);

        //memory card adapter
        Computer computer = new Computer();

        UsbImpl usb = new UsbImpl("Данные из usb-накопителя");
        computer.readFromUsb(usb);

        MemoryCard card = new MemoryCardImpl("Данные с карты памяти");
        MemoryCardAdapter cardAdapter = new MemoryCardAdapter(card);
        computer.readFromUsb(cardAdapter);

        //DBConnector proxy
        DBConnectorImpl dbConnector = new DBConnectorImpl("testDB");
        DBConnector dbConnectorProxy = new DBConnectorProxy(dbConnector, "localhost:8080");

        dbConnector.connect();
        dbConnectorProxy.connect();
    }
}
