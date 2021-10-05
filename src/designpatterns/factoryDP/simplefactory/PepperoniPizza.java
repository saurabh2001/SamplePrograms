package designpatterns.factoryDP.simplefactory;

public class PepperoniPizza implements Pizza{

    @Override
    public void makePizza() {
        System.out.println("Making Pepperoni pizza");
    }
}
