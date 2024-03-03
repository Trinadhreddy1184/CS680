package umbcs680.multicast;

public class BluetoothEvent{

    private String message = "Bluetooth Connected Successfully to: ";
    
    void removeMessage(){ message = "";  }

    public String getMessage() {
        return message;
    }
    
    
}