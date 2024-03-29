package HumanResources;

public class Salesperson extends Employee {
    Salesperson(){
        position="Sales Person";
        employeeCount++;
    }

    @Override
    int calculateSalary(){
        return 13*baseSalary+500;
    }

    @Override
    int calculateWorkingHours(){
        return baseWorkingHours+8;
    }
}
