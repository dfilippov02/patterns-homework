package adapter;

public class UsbImpl implements Usb {

    private final String data;

    public UsbImpl(String data) {
        this.data = data;
    }

    @Override
    public void connect() {
        System.out.println("usb накопитель подключен");
    }

    @Override
    public String readInfo() {
        return data;
    }
}
