package HumanResources;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Which posittion's information do you want \n1-Boss, \n2-Manager, \n3-Programmer, \n4-Test Engineer, \n5-Salesperson, \n6-Database Admin:");
            System.out.println("Exit = -1");
            int userPosition = s.nextInt();

            if (userPosition==-1) {
                System.out.println("Program terminated.");
                break;
            }

            Employee employee = null;

            switch (userPosition) {
                case 1:
                    employee = new Boss();
                    break;
                case 2:
                    employee = new Manager();
                    break;
                case 3:
                    employee = new Programmer();
                    break;
                case 4:
                    employee = new TestEngineer();
                    break;
                case 5:
                    employee = new Salesperson();
                    break;
                case 6:
                    employee = new DatabaseAdmin();
                    break;
                default:
                    System.out.println("Invalid position. Please enter a valid position.");
                    continue;
            }

            while(true){
                System.out.println("What information do you want to know? \n1-Working Hours \n2-Salary");
                System.out.println("Return previus page -1");
                int userChoice = s.nextInt();
                if (userChoice==-1) {
                break;
            }
                switch (userChoice) {
                    case 1:
                        System.out.println("Working hours: " + employee.calculateWorkingHours() + " hours.");
                        break;
                    case 2:
                        System.out.println("Salary: " + employee.calculateSalary() + " liras.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            }
            
        }
        s.close();
    }
}
