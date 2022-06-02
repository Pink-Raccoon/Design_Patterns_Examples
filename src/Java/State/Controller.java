package Java.State;

public class Controller {
    public static Accounting accounting;
    public static Sales sales;
    public static Management management;

    public static Connection conn;

    Controller(){
        accounting = new Accounting();
        sales = new Sales();
        management = new Management();
    }

    public void setAccountingConnection(){
        conn = accounting;
    }

    public void setSalesConnection(){
        conn = sales;
    }

    public void setManagementConnection(){
        conn = management;
    }

    public void open(){
        conn.open();
    }

    public void close(){
        conn.close();
    }

    public void log(){
        conn.log();
    }

    public void update(){
        conn.update();
    }
}
