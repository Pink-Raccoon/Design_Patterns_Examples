package Java.Facade;

public class Samsung implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Samsung galaxy tab3");
    }

    @Override
    public void price() {
        System.out.println("45000.00");
    }
}
