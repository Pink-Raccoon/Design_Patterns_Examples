package Java.Proxy;

public class ProxyInternetAccess implements OfficeIntrnetAccess{
    private String employeeName;
    private RealInternetAccess  realaccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if(getRole(employeeName)>4){
            realaccess = new RealInternetAccess(employeeName);
            realaccess.grantInternetAccess();
        }else{
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }

    public int getRole(String employeeName){
        return 9;
    }
}
