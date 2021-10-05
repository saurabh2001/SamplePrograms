package designpatterns.factoryDP.simplefactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String typeOfPizza){
        if(typeOfPizza.equals("Cheese")){
            return new CheesePizza();
        }
        if(typeOfPizza.equals("Pepperoni")){
            return new PepperoniPizza();
        }
        return null;
    }
}
