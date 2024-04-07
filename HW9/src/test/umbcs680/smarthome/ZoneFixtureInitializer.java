package umbcs680.smarthome;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ZoneFixtureInitializer {
    
    public static umbcs680.smarthome.SmartHomes setUpHome(){
        umbcs680.smarthome.SmartHomes smartHomes = umbcs680.smarthome.SmartHomes.getSmartHomes();
        Zone livingHome = new Zone(1,"livingHome",0,2400,null,LocalDateTime.of(2022,04, 24, 14, 33));
        smartHomes.appendHome(livingHome);
        Zone hall = new Zone(2,"hall",0,800,livingHome,LocalDateTime.of(2022,04, 24, 14, 33));
        Zone bedroom = new Zone(3,"bedroom",0,1200,livingHome,LocalDateTime.of(2022,04, 24, 14, 33));
        Device wifi = new Device(4,"wifi",10,0,livingHome,LocalDateTime.of(2022,04, 24, 14, 33));
        livingHome.addChild(hall);
        livingHome.addChild(bedroom);
        livingHome.addChild(wifi);
        Device tv = new Device(5,"tv",15,0,hall,LocalDateTime.of(2022,04, 24, 14, 33));
        Device  temparatureControl= new Device(6,"temparatureControl",5,0,hall,LocalDateTime.of(2022,04, 24, 14, 33));
        Device speaker = new Device(7,"speaker",5,0,bedroom,LocalDateTime.of(2022,04, 24, 14, 33));
        bedroom.addChild(speaker);
        hall.addChild(tv);
        hall.addChild(temparatureControl);
        return smartHomes;
    }
}