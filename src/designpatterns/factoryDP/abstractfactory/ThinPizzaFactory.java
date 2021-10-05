package designpatterns.factoryDP.abstractfactory;

public class ThinPizzaFactory extends AbstractFactory{

    @Override
    Pizza getPizza(String pizzaType) {
        if (pizzaType.equals("Cheese")){
            return new ThinCheesePizza();
        }
        if(pizzaType.equals("Pepperoni")){
            return new ThinPepperoniPizza();
        }
        return null;
    }
}
