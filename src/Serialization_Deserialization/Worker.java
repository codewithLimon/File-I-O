package Serialization_Deserialization;

import java.io.Serializable;

public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public Worker(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
        return null;
    }
}
