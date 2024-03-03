package umbcs680.multicast;

import java.util.Arrays;
import java.util.LinkedList;

public class Television implements BluetoothSpeakerObserver,WifiRouterObserver{

    private String bluetoothConnectionMessage,wifiConnectionMessage,deviceName;

    public Television(String name){
        this.deviceName = name;
    }

    @Override
    public void bluetoothUpdate(BluetoothEvent event){
        bluetoothConnectionMessage = event.getMessage();
    }

    @Override
    public void wifiUpdate(WifiEvent event){
        wifiConnectionMessage = event.getMessage();
    }

    public String getBluetoothConnectionMessage(){
        return bluetoothConnectionMessage.concat(deviceName);
    }

    public String getWifiConnectionMessage(){
        return  wifiConnectionMessage.concat(deviceName);
    }
}