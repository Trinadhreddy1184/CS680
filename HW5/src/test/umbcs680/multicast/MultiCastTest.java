package umbcs680.multicast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.*;

@TestMethodOrder(OrderAnnotation.class)
public class MultiCastTest {
    // Instance variables 
    Iphone firstIphone ;
    Macbook macbook;
    Television tv;

    BluetoothSpeakerObservable bluetoothSpeakerObservable;
    WifiRouterObservable wifiRouterObservable ;
    
    // constructor of initializing instance variables
    public MultiCastTest(){
        firstIphone = new Iphone("first");
        macbook = new Macbook("Mac Pro");
        tv = new Television("Samsung");
        bluetoothSpeakerObservable = BluetoothSpeakerObservable.getInstance();
        wifiRouterObservable = WifiRouterObservable.getInstance();
        
    }
    
    // testcase 1 checking instance is not null
    @Test
    @Order(1)
    public void bluetoothobservableTest(){
       
        assertNotNull(bluetoothSpeakerObservable);
    }

    // testcase 2 chcking count of devices 
    @Test
    @Order(2)
    public void bluetoothobservableCountTest(){

        bluetoothSpeakerObservable.addDevice(firstIphone);
        assertEquals(1,bluetoothSpeakerObservable.countDevices());
    }

    // testcase 3 checking device update after notify
    @Test
    @Order(3)
    public void bluetoothobservableNotifyTest(){
        bluetoothSpeakerObservable.addDevice(firstIphone);
        bluetoothSpeakerObservable.notifyDevices(new BluetoothEvent());
        assertEquals("Bluetooth Connected Successfully to: first",firstIphone.getBluetoothConnectionMessage());

    }

    // testcase 4 checking  count after clearing devices
    @Test
    @Order(4)
    public void bluetoothobservableClearCountTest(){
        bluetoothSpeakerObservable.addDevice(firstIphone);
        bluetoothSpeakerObservable.clearDevices();
        assertEquals(0,bluetoothSpeakerObservable.countDevices());
    }

    // testcase 5 checking notify after clearing devices
    @Test
    @Order(5)
    public void bluetoothobservableClearNotifyTest(){
        bluetoothSpeakerObservable.addDevice(firstIphone);
        bluetoothSpeakerObservable.clearDevices();
        assertEquals("first",firstIphone.getBluetoothConnectionMessage());
    }

    // testcase 6 checking mutliple notifications to multiple deices
    @Test
    @Order(6)
    public void bluetoothobservableMultipleNotifyTest(){
        bluetoothSpeakerObservable.addDevice(firstIphone);
        bluetoothSpeakerObservable.addDevice(macbook);
        bluetoothSpeakerObservable.notifyDevices(new BluetoothEvent());
        assertEquals("Bluetooth Connected Successfully to: Mac Pro",macbook.getBluetoothConnectionMessage());
    }

    
    //testcase 7 checking other observable
    
    @Test
    @Order(7)
    public void wifiobservableTest(){
        WifiRouterObservable wifiRouterObservable = WifiRouterObservable.getInstance();
        wifiRouterObservable.addDevice(firstIphone);
        wifiRouterObservable.notifyDevices(new WifiEvent());
        assertEquals("Wifi Connected Successfully to: first",firstIphone.getWifiConnectionMessage());

    }

    // testcase 8 checking remove device 
    @Test
    @Order(8)
    public void wifiobservableRemoveTest(){
        
        wifiRouterObservable.addDevice(firstIphone);
        wifiRouterObservable.addDevice(tv);
        wifiRouterObservable.removeDevice(firstIphone);
        wifiRouterObservable.addDevice(new Iphone("second"));
        wifiRouterObservable.addDevice(macbook);
        wifiRouterObservable.notifyDevices(new WifiEvent());
        assertEquals("Wifi Connected Successfully to: Samsung",tv.getWifiConnectionMessage());
    }

    // test case 9 checking count devices upon multiple observables
    @Test
    @Order(9)
    public void observerCountTest(){
        wifiRouterObservable.clearDevices();
        bluetoothSpeakerObservable.clearDevices();
        wifiRouterObservable.addDevice(firstIphone);
        wifiRouterObservable.addDevice(tv);
        bluetoothSpeakerObservable.addDevice(firstIphone);
        bluetoothSpeakerObservable.addDevice(macbook);
        assertEquals(bluetoothSpeakerObservable.countDevices(),wifiRouterObservable.countDevices());
    }


    // testcase 10 checking multiple devices upon multiple observables
    @Test
    @Order(10)
    public void observerEqualTest(){
        wifiRouterObservable.clearDevices();
        bluetoothSpeakerObservable.clearDevices();
        wifiRouterObservable.addDevice(firstIphone);
        wifiRouterObservable.addDevice(tv);
        bluetoothSpeakerObservable.addDevice(firstIphone);
        bluetoothSpeakerObservable.addDevice(tv);
        assertIterableEquals(bluetoothSpeakerObservable.getDevices(),wifiRouterObservable.getDevices());
    }
    
    
    
}