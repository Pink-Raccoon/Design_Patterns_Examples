package Java.Observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CopyOnWriteArrayList;

public class ResponseHandle1 {
    private CopyOnWriteArrayList<ActionListener> listeners = new CopyOnWriteArrayList<>();

    public void addListener(ActionListener listener){
        listeners.add(listener);
    }

    public  void removeListener(ActionListener listener){
        listeners.remove(listener);
    }

  /* public void doSomethingReasonable(){
        invokeListeners(new ActionEvent(this,0,"command"));
    }
    protected void invokeListeners(ActionEvent event){
        listeners.forEach((1)->1.actionPerformed(event));
    }*/

}
