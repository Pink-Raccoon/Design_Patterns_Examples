package Java.Observer;

public class MessagesubscriberOne implements Observer{

    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());

    }
}
