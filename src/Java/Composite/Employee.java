package Java.Composite;

/**
 * Component
 *     Declares interface for objects in composition.
 *     Implements default behavior for the interface common to all classes as appropriate.
 *     Declares an interface for accessing and managing its child components.
 */
public interface Employee {
    public int getId();
    public String getName();
    public double getSalary();
    public void print();
    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
}
