package umbcs680.bluetoothspeaker;


import java.util.Objects;

public class BluetoothSpeaker {

    private State state ;
    

    private static  BluetoothSpeaker instance=null;

   private BluetoothSpeaker(){
        this.state =  Stopped.getInstance();
   }

   public static BluetoothSpeaker getInstance(){
       if (instance==null)
       instance= new BluetoothSpeaker();
       return instance;
   }

    public  void  changeState( State newState){

       this.state = newState;
    }

    public void powerButtonPushed(){
        this.state.powerButtonPushed();
    }

    public void playPauseButtonPushed(){
        this.state.playPauseButtonPushed();
    }

    public void nextButtonPushed(){
        this.state.nextButtonPushed();
    }

    public void prevButtonPushed(){
        this.state.prevButtonPushed();
    }

    public void playMusic(){

    }

    public void stopMusic(){

    }

    public void enableBluetooth(){

    }

    public void disableBluetooth(){
    }

    public State getCurrentState(){
       return this.state;
    }
    

    public void resetState() {
        this.state = Stopped.getInstance();
    }
}