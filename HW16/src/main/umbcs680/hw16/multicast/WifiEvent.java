package umbcs680.hw16.multicast;

public class WifiEvent{

    private String message = "Wifi Connected Successfully to: ";

    void removeMessage(){ message = "";  }
    public String getMessage() {
        return message;
    }
}