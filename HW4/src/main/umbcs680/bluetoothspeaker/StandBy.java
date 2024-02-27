package umbcs680.bluetoothspeaker;



public class StandBy implements State{


    private  static  StandBy standByInstance =null;
    private StandBy(){

    }

    public static StandBy getInstance(){
        if (standByInstance==null){
            standByInstance= new  StandBy();
        }
        return  standByInstance;
    }
    
    @Override
    public void powerButtonPushed(){

        BluetoothSpeaker.getInstance().disableBluetooth();
        BluetoothSpeaker.getInstance().changeState(Stopped.getInstance());
    }

    @Override
    public void playPauseButtonPushed() {
        BluetoothSpeaker.getInstance().playMusic();
        BluetoothSpeaker.getInstance().changeState(Playing.getInstance());
    }

    @Override
    public void nextButtonPushed() {
        BluetoothSpeaker.getInstance().playMusic();
        BluetoothSpeaker.getInstance().changeState(Playing.getInstance());
    }

    @Override
    public void prevButtonPushed() {
        BluetoothSpeaker.getInstance().playMusic();
        BluetoothSpeaker.getInstance().changeState(Playing.getInstance());
    }

}