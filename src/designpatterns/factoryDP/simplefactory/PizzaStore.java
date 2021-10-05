package designpatterns.factoryDP.simplefactory;

public class PizzaStore {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza pizza = factory.createPizza("Cheese");
        pizza.makePizza();

        pizza = factory.createPizza("Pepperoni");
        pizza.makePizza();
    }
}
