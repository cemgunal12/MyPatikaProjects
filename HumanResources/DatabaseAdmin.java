package HumanResources;

public class DatabaseAdmin extends Employee {
    DatabaseAdmin(){
        position="Database Admin";
        employeeCount++;
    }

    @Override
    int calculateSalary(){
        return 14*baseSalary+500;
    }

    @Override
    int calculateWorkingHours() {
        return baseWorkingHours+8;
    }
}
