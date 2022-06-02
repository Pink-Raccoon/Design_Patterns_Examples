package Java.Singleton;

public class A {
    private static A instance = new A(); //Early instance, will be created at load time
    private A(){} //Private constructor, prevents direct instanciation

    public static A getA(){
        return instance;
    }

    public void doSomething(){
        System.out.println("Hello World");
    }
}
