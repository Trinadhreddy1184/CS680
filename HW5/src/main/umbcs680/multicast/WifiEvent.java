package umbcs680.multicast;

public class WifiEvent{

    private String message = "Wifi Connected Successfully to: ";

    void removeMessage(){ message = "";  }
    public String getMessage() {
        return message;
    }
}