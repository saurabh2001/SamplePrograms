package designpatterns.factoryDP.abstractfactory;

public class ThickPepperoniPizza implements Pizza{

    @Override
    public void makePizza() {
        System.out.println("Making thick pepperoni pizza");
    }
}
