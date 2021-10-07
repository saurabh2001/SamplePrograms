package designpatterns.template;

public class ClassicCar extends CarTemplate{

    @Override
    public void fixChassis() {
        System.out.println("Assembling chassis of the classical model");
        this.setChassis("Classic chassis");
    }

    @Override
    public void fixBody() {
        System.out.println("Assembling body of the classical model");
        this.setBody("Classic body");
    }

    @Override
    public void paint() {
        System.out.println("Painting body of the classical model");
        this.setPaint("Classic White Paint");
    }

    @Override
    public void fixInterior() {
        System.out.println("Setting up interior of the classical model");
        this.setInterior("Classic interior");
    }
}
