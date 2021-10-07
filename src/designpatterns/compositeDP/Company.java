package designpatterns.compositeDP;

public class Company {
    public static void main(String[] args) {

        Developer dev1 = new Developer("A",100, "Engineer");
        Developer dev2 = new Developer("B",101, "Sr Engineer");
        Developer dev3 = new Developer("C",102, "SrEngineer");
        // create developer directory
        CompanyDirectory engineerDirectory = new CompanyDirectory();
        engineerDirectory.addEmployee(dev1);
        engineerDirectory.addEmployee(dev2);
        engineerDirectory.addEmployee(dev3);

        Manager man1 = new Manager("X",501, "Sr Manager");
        Manager man2 = new Manager("Y", 502, "Asst Manager");
        // create manager directory
        CompanyDirectory managerDirectory = new CompanyDirectory();
        managerDirectory.addEmployee(man1);
        managerDirectory.addEmployee(man2);

        CompanyDirectory finalDirectory = new CompanyDirectory();
        finalDirectory.addEmployee(engineerDirectory);
        finalDirectory.addEmployee(managerDirectory);

        finalDirectory.showEmployeeDetails();


    }
}
