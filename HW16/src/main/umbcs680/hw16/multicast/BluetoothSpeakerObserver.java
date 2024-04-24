package umbcs680.hw16.multicast;

@FunctionalInterface
public interface BluetoothSpeakerObserver {

    public  void bluetoothUpdate(BluetoothEvent event);

}