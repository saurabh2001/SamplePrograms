package designpatterns.factoryDP.abstractfactory;

public class ThickCheesePizza implements Pizza{

    @Override
    public void makePizza() {
        System.out.println("Making thick cheese pizza");
    }
}
