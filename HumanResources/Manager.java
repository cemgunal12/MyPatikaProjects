package HumanResources;

public class Manager extends Employee {
    Manager(){
        position="Manager";
        employeeCount++;
    }
    
    @Override
    int calculateSalary(){
        return 15*baseSalary;
    }

    @Override
    int calculateWorkingHours(){
        return baseWorkingHours+10;
    }
}
