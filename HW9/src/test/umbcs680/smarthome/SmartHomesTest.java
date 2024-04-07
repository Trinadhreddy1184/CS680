package umbcs680.smarthome;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class SmartHomesTest {

    private static umbcs680.smarthome.SmartHomes smartHome;


    @BeforeAll
    public static void setUp(){
        smartHome = ZoneFixtureInitializer.setUpHome();
    }

    @Test
    public void instanceCheck(){
        assertNotNull(smartHome);
    }
    
    @Test
    public void homeCountCheck(){
        assertEquals(1,smartHome.getHomeCount());
    }
    
}