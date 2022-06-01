package Java.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Composite
 *     Defines behavior for components having children.
 *     Stores child component.
 *     Implements child related operations in the component interface
 */
public class BankManger implements Employee{
    private int id;
    private String name;
    private double salary;
    List<Employee> employeeList = new ArrayList<Employee>();

    public BankManger(int id, String name, double salary){
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

        Iterator<Employee> it = employeeList.iterator();
        while(it.hasNext()){
            Employee employee = it.next();
            employee.print();
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);

    }

    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);

    }

    @Override
    public Employee getChild(int i) {
        return employeeList.get(i);
    }
}
