package umbcs680.bluetoothspeaker;



public class Playing implements State{
   
    private  static  Playing playingInstance =null;
    private Playing(){
        
    }

    public static Playing getInstance(){
        if (playingInstance==null){
            playingInstance= new Playing();
        }
        return  playingInstance;
    }

 @Override   
public void powerButtonPushed(){
     BluetoothSpeaker.getInstance().stopMusic();
     BluetoothSpeaker.getInstance().disableBluetooth();
     BluetoothSpeaker.getInstance().changeState(Stopped.getInstance());
}

@Override
public void playPauseButtonPushed() {
    BluetoothSpeaker.getInstance().stopMusic();
    BluetoothSpeaker.getInstance().changeState(StandBy.getInstance());
}

@Override
public void nextButtonPushed() {
    
}

@Override
public void prevButtonPushed() {
    
}

}
