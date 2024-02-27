package umbcs680.bluetoothspeaker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.*;

@TestMethodOrder(OrderAnnotation.class)
public class BluetoothSpeakerTest {
    
    private BluetoothSpeaker gen;
    
    public BluetoothSpeakerTest(){
       
    }

    @Test
    @Order(1)
    public void onBeforeStartConnectionCheck() {
        gen=BluetoothSpeaker.getInstance();
        assertFalse(gen.getConnectionStatus());
    }
    
    @Test
    @Order(2)
    public void onBeforeStartCheck() {
        gen=BluetoothSpeaker.getInstance();

        assertEquals("Stopped state", gen.getCurrentState());
    }

    @Test
    @Order(3)
    public void onStartCheck() {
        gen=BluetoothSpeaker.getInstance();
        gen.powerButtonPushed();
        assertEquals("Standby state", gen.getCurrentState());
    }

    @Test
    @Order(4)
    public void onStartConnectionCheck() {
        gen=BluetoothSpeaker.getInstance();

        assertTrue(gen.getConnectionStatus());
    }
    
    @Test
    @Order(5)
    public void playCheck() {
        gen=BluetoothSpeaker.getInstance();
        gen.playPauseButtonPushed();
        
        assertTrue(gen.getPlayingStatus());
    }

    @Test
    @Order(6)
    public void playingModeCheck() {
        gen=BluetoothSpeaker.getInstance();
        assertEquals("Playing state", gen.getCurrentState());
    }

    @Test
    @Order(7)
    public void pauseCheck() {
        gen=BluetoothSpeaker.getInstance();
        gen.playPauseButtonPushed();

        assertFalse(gen.getPlayingStatus());
    }

    @Test
    @Order(8)
    public void pauseModeCheck() {
        gen=BluetoothSpeaker.getInstance();
        assertEquals("Standby state", gen.getCurrentState());
    }


    @Test
    @Order(9)
    public void playNextCheck() {
        gen=BluetoothSpeaker.getInstance();
        gen.nextButtonPushed();
        assertTrue(gen.getPlayingStatus());
    }

    @Test
    @Order(10)
    public void playNextModeCheck() {
        gen=BluetoothSpeaker.getInstance();
        gen.nextButtonPushed();
        assertEquals("Playing state", gen.getCurrentState());
    }


    @Test
    @Order(11)
    public void playPrevModeCheck() {
        gen=BluetoothSpeaker.getInstance();
        gen.prevButtonPushed();
        assertEquals("Playing state", gen.getCurrentState());
    }


    @Test
    @Order(12)
    public void powerOffCheck() {
        gen=BluetoothSpeaker.getInstance();
        gen.powerButtonPushed();
        assertEquals("Stopped state", gen.getCurrentState());
    }

    @Test
    @Order(13)
    public void powerOffConnectionCheck() {
        gen=BluetoothSpeaker.getInstance();
        assertFalse(gen.getConnectionStatus());
    }

    @Test
    @Order(14)
    public void powerOffPlayingCheck() {
        gen=BluetoothSpeaker.getInstance();
        assertFalse(gen.getPlayingStatus());
    }
    

}