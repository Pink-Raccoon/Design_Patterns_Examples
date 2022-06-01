package Java.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Leaf
 *      Represents leaf objects in composition. A leaf has no children.
 *      Defines behavior for primitive objects in the composition
 */

/**
 * In this class, there are many methods which are not applicable to cashier because it is a leaf node.
 */
public class Cashier implements Employee{
    private int id;
    private String name;
    private double salary;
    List<Employee> employeeList = new ArrayList<Employee>();

    public Cashier(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("==========================");
        System.out.println("Id ="+getId());
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("==========================");
    }

    @Override
    public void add(Employee employee) {
        //Not applicable because leaf
    }

    @Override
    public void remove(Employee employee) {
        //Not applicable because leaf
    }

    @Override
    public Employee getChild(int i) {
        //Not applicable because leaf
        return null;
    }
}
