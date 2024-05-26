package adapter;

public class MemoryCardImpl implements MemoryCard{

    private final String data;

    public MemoryCardImpl(String data) {
        this.data = data;
    }

    @Override
    public String readInfo() {
        return data;
    }
}
