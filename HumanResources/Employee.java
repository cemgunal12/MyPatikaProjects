package HumanResources;

public abstract class Employee {
    int baseSalary=3000;
    int baseWorkingHours=30;
    int employeeCount;
    String position;
    void work(){
        System.out.println("Position is  "+position+"." );
    }
    abstract int calculateSalary();
    abstract int calculateWorkingHours();
}
