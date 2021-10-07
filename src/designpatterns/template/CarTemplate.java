package designpatterns.template;

public abstract class CarTemplate {
    private String chassis;
    private String body;
    private String paint;
    private String interior;

    //methods to be implemented by subclasses so declare as abstract
    public abstract void fixChassis();
    public abstract void fixBody();
    public abstract void paint();
    public abstract void fixInterior();

    //template method, final so subclasses can't override
    public final void manufactureCar(){
        fixChassis();
        fixBody();
        paint();
        fixInterior();
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "CarTemplate{" +
                "chassis='" + chassis + '\'' +
                ", body='" + body + '\'' +
                ", paint='" + paint + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}
