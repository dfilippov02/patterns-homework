package factory;

public class CoffeeFactory {

    public static Coffee getCoffee(CoffeeType type){
        return switch (type) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
            default -> throw new IllegalArgumentException("Данный вид кофе не распознан");
        };
    }

}
