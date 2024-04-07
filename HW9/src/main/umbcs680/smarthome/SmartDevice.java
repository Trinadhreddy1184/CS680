package umbcs680.smarthome;

import java.time.LocalDateTime;
import java.util.LinkedList;

public abstract class SmartDevice{

    protected int deviceId; //ethier zone id or deviceid
    protected String name;
    protected enum Status{ ON,OFF};
    protected Status status; 
    protected int area;
    protected Zone parent; // likw room
    protected LocalDateTime creationTime;
    protected int units; // like power
    public SmartDevice (int deviceId, String name,int units,int area,Zone parent,LocalDateTime creationTime){
        this.deviceId=deviceId;
        this.name=name;
        this.creationTime=creationTime;
        this.units=units;
        this.parent=parent;
        this.area = area;
        
    }

    public int getUnits() {
        return units;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public int getArea() {
        return area;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public abstract umbcs680.smarthome.SmartDevice.Status getStatus();

    public String getName() {
        return name;
    }

    public Zone getParent() {
        return parent;
    }
    
    public abstract void turnOn();
    public abstract void turnOff();
    
    public abstract boolean isZone();
}