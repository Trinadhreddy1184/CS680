package umbcs680.bluetoothspeaker;


import java.util.Objects;

public class BluetoothSpeaker {

    private State state ;

    private boolean isplaying,isconnected = false;

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
        this.isplaying=true;
    }

    public void stopMusic(){
        this.isplaying=false;
    }

    public void enableBluetooth(){
        this.isconnected=true;
    }

    public void disableBluetooth(){
        this.isconnected=false;
    }

    public State getCurrentState(){
       return this.state;
    }


    public boolean getPlayingStatus(){
        return this.isplaying;
    }

    public boolean getConnectionStatus(){
        return this.isconnected;
    }

    public void resetState() {
        this.state = Stopped.getInstance();
        this.isplaying = false;
        this.isconnected = false;
    }
}