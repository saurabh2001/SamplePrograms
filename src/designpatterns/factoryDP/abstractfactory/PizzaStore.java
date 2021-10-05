package designpatterns.factoryDP.abstractfactory;


public class PizzaStore {

    public static void main(String[] args) {
        AbstractFactory factory = PizzaProducer.getFactory("Thick");
        Pizza pizza = factory.getPizza("Cheese");
        pizza.makePizza();

        pizza = factory.getPizza("Pepperoni");
        pizza.makePizza();

        factory = PizzaProducer.getFactory("Thin");
        pizza = factory.getPizza("Cheese");
        pizza.makePizza();

        pizza = factory.getPizza("Pepperoni");
        pizza.makePizza();
    }
}
