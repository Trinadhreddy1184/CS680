package umbcs680.bluetoothspeaker;



public class Stopped implements State{


    private  static  Stopped stoppedInstance =null;
    private Stopped(){

    }

    public static Stopped getInstance(){
        if (stoppedInstance==null){
            stoppedInstance= new Stopped();
        }
        return  stoppedInstance;
    }
    
    @Override
    public void powerButtonPushed(){
        BluetoothSpeaker.getInstance().enableBluetooth();
        BluetoothSpeaker.getInstance().changeState(StandBy.getInstance());
    }

    @Override
    public void playPauseButtonPushed() {

    }

    @Override
    public void nextButtonPushed() {

    }

    @Override
    public void prevButtonPushed() {

    }

}