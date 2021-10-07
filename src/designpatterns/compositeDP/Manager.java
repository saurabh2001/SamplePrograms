package designpatterns.compositeDP;

public class Manager implements Employee{
    private String name;
    private long empId;
    private String position;

    public Manager(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Manager : " + this.toString());
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", position='" + position + '\'' +
                '}';
    }
}
