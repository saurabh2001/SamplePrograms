package designpatterns.factoryDP.abstractfactory;

public class ThinCheesePizza implements Pizza{

    @Override
    public void makePizza() {
        System.out.println("Making thin cheese pizza");
    }
}
