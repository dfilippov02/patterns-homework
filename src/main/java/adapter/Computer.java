package adapter;

public class Computer {

    public void readFromUsb(Usb usb) {
        usb.connect();
        System.out.println(usb.readInfo());
    }
}
