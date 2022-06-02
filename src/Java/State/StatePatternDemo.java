package Java.State;

public class StatePatternDemo {
    Controller controller;
    StatePatternDemo(String conn){
        controller = new Controller();
        if(conn.equalsIgnoreCase("management"))
            controller.setManagementConnection();
        if(conn.equalsIgnoreCase("sales"))
            controller.setSalesConnection();
        if(conn.equalsIgnoreCase("accounting"))
            controller.setAccountingConnection();
        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }
    public static void main(String args[]) {

        new StatePatternDemo("management");

    }

}
