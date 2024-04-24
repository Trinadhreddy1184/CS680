package umbcs680.hw16.multicast;

import java.util.LinkedList;

public class WifiRouterObservable {

    private LinkedList<WifiRouterObserver> devices = new LinkedList<WifiRouterObserver>();

    private static WifiRouterObservable instance;

    private WifiEvent event;

    private WifiRouterObservable(){}

    public static WifiRouterObservable getInstance(){
        if(instance== null){
            instance = new WifiRouterObservable();
        }
        return instance;
    }

    public void  addDevice(WifiRouterObserver device){
        devices.add(device);
    }

    public void removeDevice(WifiRouterObserver device){
        event = new WifiEvent();
        event.removeMessage();
        devices.remove(device);
    }

    public int countDevices(){
        return  devices.size();
    }

    public LinkedList<WifiRouterObserver> getDevices(){
        return devices;
    }

    public void clearDevices(){
        event = new WifiEvent();
        event.removeMessage();
        notifyDevices(event);
        devices.clear();
    }

    public void notifyDevices(WifiEvent event){
        devices.forEach((d)->{d.wifiUpdate(event);});
//        for (WifiRouterObserver d : devices) {
//            d.wifiUpdate(event);
//        }
    }

}