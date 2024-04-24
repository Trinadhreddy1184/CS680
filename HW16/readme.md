# Multicast Design Pattern Implementation (Replacing observers with Lambda Expressions)

## Overview

In this Multicast design pattern implementation, **BluetoothSpeaker** and **WifiRouter** serve as observables, notifying events when respective connections are established or disconnected. Devices, Lambda expressions as observers, listening for these events and responding accordingly. This design enables efficient and synchronized communication between multiple devices, ensuring a consistent view of the network status and allowing devices to react appropriately to network changes.

## Components

### Observables

- **BluetoothSpeakerObservable**
- **WifiRouterObservable**

### Observer Interfaces (Functional interfaces)

- **BluetoothSpeakerObserver**
- **WifiRouterObserver**

### Observers
 - Observers are replaced using lambda expressions

### Event Classes

- **BluetoothEvent**
- **WifiEvent**

### DoSomething class
 - The dummy class containg static void methods for any type of operation.
  
## Usage

1. **Bluetooth Speaker:**
   - The BluetoothSpeakerObservable notifies BluetoothEvent events when Bluetooth connections are established or disconnected.

2. **Wifi Router:**
   - The WifiRouterObservable notifies WifiEvent events when Wi-Fi connections are established or disconnected.

3. **Devices:**
   - Devices which are lambda expressions use  respective observer  functional interfaces (BluetoothSpeakerObserver, WifiRouterObserver).
   - They listen for events from BluetoothSpeakerObservable and WifiRouterObservable, responding to changes in the network.



