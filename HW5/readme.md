Multicast design pattern implementation using BluetoothSpeaker and WifiRouter as Observables and  Iphone,Macbook,Television as Observers.

In this **Multicast Observer** design pattern implementation, **BluetoothSpeaker** and **WifiRouter** are modeled as **observables**, emitting events when the respective connections are established or disconnected. **Devices** such as iPhones, Macs, and TVs are represented as **observers** that listen for these events and respond accordingly (e.g., displaying notifications, initiating connections, or adjusting settings). This allows for efficient and synchronized communication between multiple devices, ensuring that they have a consistent view of the network status and can react appropriately to network changes.

