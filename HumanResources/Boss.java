package HumanResources;

public final class Boss extends Employee {
    Boss(){
        position = "Boss";
        employeeCount++;
    }
    @Override
    void work() {
        System.out.println("Working as the boss.");
    }
    @Override
    int calculateWorkingHours() {
        return baseWorkingHours;
    }
    @Override
    int calculateSalary() {
        return 20 * baseSalary;
    }
}
