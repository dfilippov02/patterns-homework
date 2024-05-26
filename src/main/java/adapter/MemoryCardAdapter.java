package adapter;

public class MemoryCardAdapter implements Usb{

    MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connect() {
        System.out.println("Адаптер для карты памяти подключен");
    }

    @Override
    public String readInfo() {
        return memoryCard.readInfo();
    }
}
