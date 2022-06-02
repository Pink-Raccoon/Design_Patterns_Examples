package Java.Singleton;

public class Alazy {
    private static Alazy obj;
    private Alazy(){}

    public static Alazy getAlazy(){
        if(obj==null) {
            synchronized (obj.getClass()){
                if(obj==null){
                    obj = new Alazy();
                }

            }
        }return obj;
    }

    public void doSomething(){
        System.out.println("Hello World lazy");
    }
}
