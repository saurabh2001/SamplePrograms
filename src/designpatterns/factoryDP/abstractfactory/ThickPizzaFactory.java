package designpatterns.factoryDP.abstractfactory;

public class ThickPizzaFactory extends AbstractFactory{

    @Override
    Pizza getPizza(String pizzaType) {
        if (pizzaType.equals("Cheese")){
            return new ThickCheesePizza();
        }
        if(pizzaType.equals("Pepperoni")){
            return new ThickPepperoniPizza();
        }
        return null;
    }
}
