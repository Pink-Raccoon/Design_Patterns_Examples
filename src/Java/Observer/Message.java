package Java.Observer;

/**
 * State class, immutable
 */
public class Message {

    private final String messageContent;
    public Message(String m){
        this.messageContent = m;
    }

    public String getMessageContent(){
        return messageContent;
    }

}
