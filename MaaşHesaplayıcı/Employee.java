package MaaşHesaplayıcı;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double taxAmount = 0;
        if (salary > 1000) {
            taxAmount = salary * 0.03;
        }
        return taxAmount;
    }

    public double bonus() {
        double bonusAmount = 0;
        if (workHours > 40) {
            bonusAmount = (workHours - 40) * 30;
        }
        return bonusAmount;
    }

    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        double raiseAmount = 0;
        if (yearsWorked < 10) {
            raiseAmount = salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            raiseAmount = salary * 0.1;
        } else if (yearsWorked >= 20) {
            raiseAmount = salary * 0.15;
        }
        return raiseAmount;
    }

    public double totalSalary() {
        return salary + raiseSalary() + bonus() - tax();
    }

    @Override
    public String toString() {
        return "Adı : " + name + "\nMaaşı : " + salary + "\nÇalışma Saati : " + workHours +
                "\nBaşlangıç Yılı : " + hireYear + "\nVergi : " + tax() + "\nBonus : " +
                bonus() + "\nMaaş Artışı : " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + totalSalary() +
                "\nToplam Maaş : " + (salary + raiseSalary() + bonus());
    }
}