package umbcs680.smarthome;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DeviceTest {

    private static umbcs680.smarthome.SmartHomes smartHome;

    @BeforeAll
    public static void setUp(){
        smartHome = ZoneFixtureInitializer.setUpHome();
    }
    private String[] deviceToStringArray(Device d){
        String[] deviceInfo = {String.valueOf(d.getDeviceId()),d.getName(),String.valueOf(d.getUnits()),String.valueOf(d.getCreationTime()),String.valueOf(d.getStatus())};
        return deviceInfo;
    }
    

    @Test
    public void isDeviceCheck(){
        Zone livingHome = smartHome.getHomes().get(0);
        Device wifi = livingHome.getDevices().get(0);
        assertFalse(wifi.isZone());

    }


    @Test
    public void wifiZoneEqualityCheck(){
        Zone livingHome = smartHome.getHomes().get(0);
        Device wifi = livingHome.getDevices().get(0);
        String[] expected = {"4","wifi","10","2022-04-24T14:33","OFF"};
        assertArrayEquals(expected,deviceToStringArray(wifi));
    }
//
    @Test
    public void tvEqualityCheckWithTurnOn(){
        Zone livingHome = smartHome.getHomes().get(0);
        Zone hall = livingHome.getSubZones().get(0);
        Device tv = hall.getDevices().get(0);
        tv.turnOn();
        String[] expected = {"5","tv","15","2022-04-24T14:33","ON"};
        assertArrayEquals(expected,deviceToStringArray(tv));
    }
    
    @Test
    public void speakerEqualityCheckWithTurnOff(){
        Zone livingHome = smartHome.getHomes().get(0);
        Zone bedroom = livingHome.getSubZones().get(1);
        Device  speaker = bedroom.getDevices().get(0);
        speaker.turnOn();
        speaker.turnOff();
        String[] expected = {"7","speaker","5","2022-04-24T14:33","OFF"};
        assertArrayEquals(expected,deviceToStringArray(speaker));
    }

}