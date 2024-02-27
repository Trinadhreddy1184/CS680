# BluetoothSpeaker

BluetoothSpeaker implementation using State-based Design. The `BluetoothSpeaker` class is the main class and uses the `State` interface and three states (`Playing`, `StandBy`, `Stopped`) which implement the interface and override its abstract methods. Dynamic Class Change and Singleton implementation are used. The implementation follows State-based Design. The `BluetoothSpeakerTest` is used to unit test the `BluetoothSpeaker` functionality, and testing is automated using the Ant script `build.xml`.

## Class BluetoothSpeaker
- `- state`: State // variable to store the current state
- `- instance`: BluetoothSpeaker // private instance for singleton implementation
- `+ BluetoothSpeaker()`: private constructor
+ `+ static getInstance()`: static factory method to get `BluetoothSpeaker` instance
+ `+ changeState(State newState)`: method for dynamic change of state

//Functionalities
+ `+ powerButtonPushed()`: state.powerButtonPushed()
+ `+ playPauseButtonPushed()`: state.playPauseButtonPushed()
+ `+ nextButtonPushed()`: state.nextButtonPushed()
+ `+ prevButtonPushed()`: state.prevButtonPushed()

//Functions
+ `+ playMusic()`
+ `+ stopMusic()`
+ `+ enableBluetooth()`
+ `+ disableBluetooth()`

//Getter methods
+ `+ getCurrentState()`
+ `+ getPlayingStatus()`
+ `+ getConnectionStatus()`

## Interface State
Abstract functionality methods for overriding
+ `+ powerButtonPushed()`
+ `+ playPauseButtonPushed()`
+ `+ nextButtonPushed()`
+ `+ prevButtonPushed()`

## Class Playing implements State
- `- instance`: Playing // instance for singleton implementation
+ `+ static getInstance()`: static factory method to get instance

//Overriding functionalities
+ `+ powerButtonPushed()`: `bluetoothSpeaker.disableBluetooth(); bluetoothSpeaker.changeState(Stopped.getInstance());`
+ `+ playPauseButtonPushed()`: `bluetoothSpeaker.stopMusic(); bluetoothSpeaker.changeState(StandBy.getInstance());`
+ `+ nextButtonPushed()`
+ `+ prevButtonPushed()`

## Class StandBy implements State
- `- instance`: StandBy // instance for singleton implementation
+ `+ static getInstance()`: static factory method to get instance

// Overriding functionalities
+ `+ powerButtonPushed()`: `bluetoothSpeaker.disableBluetooth(); bluetoothSpeaker.changeState(Stopped.getInstance());`
+ `+ playPauseButtonPushed()`: `bluetoothSpeaker.playMusic(); bluetoothSpeaker.changeState(Playing.getInstance());`
+ `+ nextButtonPushed()`: `bluetoothSpeaker.playMusic(); bluetoothSpeaker.changeState(Playing.getInstance());`
+ `+ prevButtonPushed()`: `bluetoothSpeaker.playMusic(); bluetoothSpeaker.changeState(Playing.getInstance());`

## Class Stopped implements State
- `- instance`: Stopped // instance for singleton implementation
+ `+ static getInstance()`: static factory method to get instance

// Overriding functionalities
+ `+ powerButtonPushed()`: `bluetoothSpeaker.enableBluetooth(); bluetoothSpeaker.changeState(StandBy.getInstance());`
+ `+ playPauseButtonPushed()`
+ `+ nextButtonPushed()`
+ `+ prevButtonPushed()`
