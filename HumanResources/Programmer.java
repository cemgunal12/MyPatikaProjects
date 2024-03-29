package HumanResources;

public class Programmer extends Employee {
    Programmer (){
        position="Programmer";
        employeeCount++;
    }

    @Override
    int calculateSalary(){
        return 14*baseSalary;
    }

    @Override
    int calculateWorkingHours(){
        return 5+baseWorkingHours;
    }
}
