package designpatterns.factoryDP.simplefactory;

public class CheesePizza implements Pizza{

    @Override
    public void makePizza() {
        System.out.println("Making cheese pizza");
    }
}
