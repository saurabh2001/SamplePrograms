package designpatterns.templateDP;

public class CarClient {
    public static void main(String[] args) {
        CarTemplate car = new SportsCar();
        car.manufactureCar();

        System.out.println("Below car delivered: ");
        System.out.println("======================================================================");
        System.out.println(car);
        System.out.println("======================================================================");
    }
}
