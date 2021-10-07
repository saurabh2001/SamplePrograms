package designpatterns.template;

public class SportsCar extends CarTemplate{
    @Override
    public void fixChassis() {
        System.out.println("Assembling chassis of the sports model");
        this.setChassis("Sporty Chassis");
    }

    @Override
    public void fixBody() {
        System.out.println("Assembling body of the sports model");
        this.setBody("Sporty Body");
    }

    @Override
    public void paint() {
        System.out.println("Painting body of the sports model");
        this.setPaint("Sporty Torch Red Paint");
    }

    @Override
    public void fixInterior() {
        System.out.println("Setting up interior of the sports model");
        this.setInterior("Sporty interior");
    }
}
