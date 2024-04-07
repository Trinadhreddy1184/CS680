package umbcs680.smarthome;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Device extends SmartDevice{

    private umbcs680.smarthome.SmartDevice.Status status;

    public Device(int deviceId, String name,int units,int area,Zone zone,LocalDateTime creationTime){
        super(deviceId,name,units,0,zone,creationTime);
        this.status=Status.OFF;
    }

    @Override
    public void turnOff(){
        status=Status.OFF;
    }

    @Override
    public void turnOn(){
        status=Status.ON;
    }

    @Override
    public umbcs680.smarthome.SmartDevice.Status getStatus() {
        return this.status;
    }

    @Override
    public boolean isZone(){
        return false;
    }
    

}