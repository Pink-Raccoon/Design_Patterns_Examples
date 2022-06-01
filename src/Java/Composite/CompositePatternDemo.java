package Java.Composite;


/** Client
 *      Manipulates objects in the composition through the component interface.
 */
public class CompositePatternDemo {
    public static void main(String args[]){
    Employee emp1 = new Cashier(101,"Sohan Kumar",20000.0);
    Employee emp2 = new Cashier(102,"Mohan Kumar",25000.0);
    Employee emp3 = new Accountant(103,"Seema Mahiwal",30000.0);
    Employee manager1 = new BankManger(100,"Ashwani Rajput",1000000.0);

    manager1.add(emp1);
    manager1.add(emp2);
    manager1.add(emp3);
    manager1.print();
    }
}