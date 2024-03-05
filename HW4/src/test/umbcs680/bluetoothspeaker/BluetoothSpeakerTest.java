package umbcs680.bluetoothspeaker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class BluetoothSpeakerTest {
    private BluetoothSpeaker gen;
    
    @Test
    public void onBeforeStartConnectionCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        assertFalse(gen.getConnectionStatus());
    }

    @Test
    public void onBeforeStartCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        assertEquals(Stopped.getInstance(), gen.getCurrentState());
    }

    @Test
    public void onStartCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        assertEquals(StandBy.getInstance(), gen.getCurrentState());
    }

    @Test
    public void onStartConnectionCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        assertTrue(gen.getConnectionStatus());
    }

    @Test
    public void playCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        gen.playPauseButtonPushed();
        assertTrue(gen.getPlayingStatus());
    }

    @Test
    public void playingModeCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        gen.playPauseButtonPushed();
        assertEquals(Playing.getInstance(), gen.getCurrentState());
    }

    @Test
    public void pauseCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        gen.playPauseButtonPushed();
        gen.playPauseButtonPushed();
        assertFalse(gen.getPlayingStatus());
    }

    @Test
    public void pauseModeCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        gen.playPauseButtonPushed();
        gen.playPauseButtonPushed();
        assertEquals(StandBy.getInstance(), gen.getCurrentState());
    }

    @Test
    public void playNextCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        gen.nextButtonPushed();
        assertTrue(gen.getPlayingStatus());
    }

    @Test
    public void playNextModeCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        gen.nextButtonPushed();
        assertEquals(Playing.getInstance(), gen.getCurrentState());
    }

    @Test
    public void playPrevModeCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        gen.prevButtonPushed();
        assertEquals(Playing.getInstance(), gen.getCurrentState());
    }

    @Test
    public void powerOffCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        gen.prevButtonPushed();
        gen.powerButtonPushed();
        assertEquals(Stopped.getInstance(), gen.getCurrentState());
    }

    @Test
    public void powerOffConnectionCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        gen.prevButtonPushed();
        gen.powerButtonPushed();
        assertFalse(gen.getConnectionStatus());
    }

    @Test
    public void powerOffPlayingCheck() {
        gen = BluetoothSpeaker.getInstance();
        gen.resetState();
        gen.powerButtonPushed();
        gen.prevButtonPushed();
        gen.powerButtonPushed();
        assertFalse(gen.getPlayingStatus());
    }
}