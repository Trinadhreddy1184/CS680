package umbcs680.smarthome;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ZoneTest {
    
    private static umbcs680.smarthome.SmartHomes smartHome;
    
    @BeforeAll
    public static void setUp(){
        smartHome = ZoneFixtureInitializer.setUpHome();
    }
    private String[] zoneToStringArray(Zone z){
        String[] zoneInfo = {String.valueOf(z.getDeviceId()),z.getName(),String.valueOf(z.getTotalUnits()),
        String.valueOf(z.getArea()),String.valueOf(z.getCreationTime()),String.valueOf(z.getStatus())};
        return zoneInfo;
    }
    
    

    @Test
    public void isZoneCheck(){
        Zone livingHome = smartHome.getHomes().get(0);
        assertTrue(livingHome.isZone());

    }


    @Test
    public void livingHomeZoneEqualityCheck(){
        Zone livingHome = smartHome.getHomes().get(0);
        String[] expected = {"1","livingHome","35","2400","2022-04-24T14:33","OFF"};
        assertArrayEquals(expected,zoneToStringArray(livingHome));
    }

    @Test
    public void hallZoneEqualityCheckWithTurnOn(){
        Zone livingHome = smartHome.getHomes().get(0);
        Zone hall = livingHome.getSubZones().get(0);
        hall.turnOn();
        String[] expected = {"2","hall","20","800","2022-04-24T14:33","ON"};
        assertArrayEquals(expected,zoneToStringArray(hall));
    }

    @Test
    public void bedroomZoneEqualityCheck(){
        Zone livingHome = smartHome.getHomes().get(0);
        Zone bedrooom = livingHome.getSubZones().get(1);

        String[] expected = {"3","bedroom","5","1200","2022-04-24T14:33","OFF"};
        assertArrayEquals(expected,zoneToStringArray(bedrooom));
    }
    
    
    @Test
    public void hallZoneEqualityCheckWithTurnOff(){
        Zone livingHome = smartHome.getHomes().get(0);
        Zone hall = livingHome.getSubZones().get(0);
        hall.turnOff();
        String[] expected = {"2","hall","20","800","2022-04-24T14:33","OFF"};
        assertArrayEquals(expected,zoneToStringArray(hall));
    }
    
}