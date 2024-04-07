package umbcs680.smarthome;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Zone extends SmartDevice {

    private int area;
    private LinkedList<SmartDevice> children;
    private LinkedList<Zone> subZones;
    private  LinkedList<Device> devices;
    private umbcs680.smarthome.SmartDevice.Status status;


    public Zone(int deviceId, String name,int units,int area,Zone zone,LocalDateTime creationTime){
        super(deviceId,name,0,area,zone,creationTime);
        children = new LinkedList<SmartDevice>();
        subZones = new LinkedList<umbcs680.smarthome.Zone>();
        devices = new LinkedList<Device>();


    }

    public int getTotalUnits(){
        int total=0;
        for(Zone s: subZones){
            total +=s.getTotalUnits();
        }
        for(Device d: devices){
         total += d.getUnits();
        }
        return total;
    }

    @Override
    public void turnOn(){ 
        for (SmartDevice s: children) {
            s.turnOn();
        }
        status=Status.ON;
    }

    @Override
    public void turnOff(){
        for (SmartDevice s:
                children) {
            s.turnOff();
        }
        status=Status.OFF;
    }

    @Override
    public umbcs680.smarthome.SmartDevice.Status getStatus() {
        for (SmartDevice s:
                children) {
            if (s.getStatus() == Status.ON) return Status.ON;
        }
        return Status.OFF;
    }
    
    @Override
    public boolean isZone(){
        return true;
    }

    public LinkedList<Device> getDevices() {
        return devices;
    }

    public LinkedList<umbcs680.smarthome.Zone> getSubZones() {
        return subZones;
    }

    public LinkedList<SmartDevice> getChildren() {
        return children;
    }

    public void addChild(SmartDevice smartDevice){
        
        if (smartDevice.isZone()){
            subZones.add((Zone) smartDevice);
        }else {
            devices.add((Device) smartDevice);
        }
        
        children.add(smartDevice);
    }

}