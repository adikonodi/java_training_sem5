package javaday3.Constructor;

public class Employee {
    double salary;

    public Employee(double salary) {
        this.salary = salary;

    }
    double calcBonus() {
        return salary*0.10;
    }
}

