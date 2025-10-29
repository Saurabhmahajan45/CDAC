abstract class Bonus {
    String name;
    double salary;

    Bonus(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

class Manager extends Bonus {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.2;
    }
}

class Developer extends Bonus {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.1;
    }
}

class Bonus14 {
    public static void main(String args[]) {
        Bonus m1 = new Manager("Anita", 50000);
        Bonus d1 = new Developer("Rohit", 40000);

        System.out.println(m1.name + " Bonus = " + m1.calculateBonus());
        System.out.println(d1.name + " Bonus = " + d1.calculateBonus());
    }
}
