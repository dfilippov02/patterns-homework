package factory;

public class Facility {

    CoffeeMachine coffeeMachine;

    public Facility(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void start(CoffeeType coffeeType) {
        coffeeMachine.makeCoffee(CoffeeFactory.getCoffee(coffeeType));
    }
}
