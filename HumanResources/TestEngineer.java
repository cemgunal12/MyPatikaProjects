package HumanResources;

public class TestEngineer extends Employee {
    TestEngineer(){
        position="Test Engineer";
        employeeCount++;
    }
    

    @Override
    int calculateSalary(){
        return 14*baseSalary-1000;
    }

     @Override
     int calculateWorkingHours(){
        return baseWorkingHours+8;
     }
}
