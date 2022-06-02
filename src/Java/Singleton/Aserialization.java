package Java.Singleton;

import java.io.Serializable;

public class Aserialization implements Serializable {
    private static Aserialization obj = new Aserialization(); //Early instance, will be created at load time
    private Aserialization(){} //Private constructor, prevents direct instanciation

    public static Aserialization getAserialization(){
        return obj;
    }
    protected Object readResolve(){
       return getAserialization();
    }
}
