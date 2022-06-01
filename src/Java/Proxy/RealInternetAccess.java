package Java.Proxy;

public class RealInternetAccess implements  OfficeIntrnetAccess{
    private String employeeName;

    public RealInternetAccess(String empName) {
        this.employeeName = empName;
    }
    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: "+ employeeName);

    }
}
