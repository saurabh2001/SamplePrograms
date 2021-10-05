package designpatterns.factoryDP.abstractfactory;

public class PizzaProducer {
    public static AbstractFactory getFactory(String pizzaBaseType){
        if(pizzaBaseType.equals("Thick")){
            return new ThickPizzaFactory();
        }
        if(pizzaBaseType.equals("Thin")){
            return new ThinPizzaFactory();
        }
        return null;
    }
}
