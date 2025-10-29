abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

interface BonusEligible {
    double calculateBonus();
}

class PermanentEmployee extends Employee implements BonusEligible {
    double basicSalary;
    double hra;

    PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        return calculateSalary() * 0.10; 
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
public class EmployeeManagement29{
    public static void main(String[] args) {
        PermanentEmployee e1 = new PermanentEmployee("Amit", 101, 50000, 5000);
        PermanentEmployee e2 = new PermanentEmployee("Raj", 102, 40000, 4000);
        ContractEmployee c1 = new ContractEmployee("Neha", 201, 300, 100);
        ContractEmployee c2 = new ContractEmployee("Suresh", 202, 300, 120);

        System.out.println(e1.name + " Salary = " + e1.calculateSalary() + ", Bonus = " + e1.calculateBonus());
        System.out.println(e2.name + " Salary = " + e2.calculateSalary() + ", Bonus = " + e2.calculateBonus());
        System.out.println(c1.name + " Salary = " + c1.calculateSalary());
        System.out.println(c2.name + " Salary = " + c2.calculateSalary());
    }
}
