package umbcs680.multicast;

import java.util.Arrays;
import java.util.LinkedList;

public class BluetoothSpeakerObservable {
    BluetoothEvent event;
    private LinkedList<BluetoothSpeakerObserver> devices = new LinkedList<BluetoothSpeakerObserver>();
    
    private static BluetoothSpeakerObservable instance;
    
    private BluetoothSpeakerObservable(){}
    
    public static BluetoothSpeakerObservable getInstance(){
        if(instance== null){
            instance = new BluetoothSpeakerObservable();
        }
        return instance;
    }
    
    public void  addDevice(BluetoothSpeakerObserver device){
        devices.add(device);
    }

    public void removeDevice(BluetoothSpeakerObserver device){
        event = new BluetoothEvent();
        event.removeMessage();
        device.bluetoothUpdate(event);
    }

    public int countDevices(){
        return  devices.size();
    }

    public LinkedList<BluetoothSpeakerObserver> getDevices(){
        return devices;
    }

    public void clearDevices(){
        event = new BluetoothEvent();
        event.removeMessage();
        notifyDevices(event);
        devices.clear();
    }

    public void notifyDevices(BluetoothEvent event){
        
        for ( BluetoothSpeakerObserver d:devices) {
            d.bluetoothUpdate(event);
        }
    }
    
}