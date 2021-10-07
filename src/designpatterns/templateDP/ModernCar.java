package designpatterns.templateDP;

public class ModernCar extends CarTemplate{
    @Override
    public void fixChassis() {
        System.out.println("Assembling chassis of the modern model");
        this.setChassis("Modern Chassis");
    }

    @Override
    public void fixBody() {
        System.out.println("Assembling body of the modern model");
        this.setBody("Modern Body");
    }

    @Override
    public void paint() {
        System.out.println("Painting body of the modern model");
        this.setPaint("Modern Black Paint");
    }

    @Override
    public void fixInterior() {
        System.out.println("Setting up interior of the modern model");
        this.setInterior("Modern interior");
    }
}
