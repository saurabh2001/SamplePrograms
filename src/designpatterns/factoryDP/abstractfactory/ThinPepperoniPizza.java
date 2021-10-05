package designpatterns.factoryDP.abstractfactory;

public class ThinPepperoniPizza implements Pizza{

    @Override
    public void makePizza() {
        System.out.println("Making thin pepperoni pizza");
    }
}
