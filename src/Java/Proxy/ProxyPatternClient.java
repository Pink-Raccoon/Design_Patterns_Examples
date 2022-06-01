package Java.Proxy;

public class ProxyPatternClient {
    public static void main(String[] args)
    {
        OfficeIntrnetAccess access = new ProxyInternetAccess("Ashwani Rajput");
        access.grantInternetAccess();
    }
}
