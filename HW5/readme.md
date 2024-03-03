# Multicast Design Pattern Implementation

## Overview

In this Multicast design pattern implementation, **BluetoothSpeaker** and **WifiRouter** serve as observables, notifying events when respective connections are established or disconnected. Devices, including iPhone, Macbook, and Televisions, are modeled as observers, listening for these events and responding accordingly. This design enables efficient and synchronized communication between multiple devices, ensuring a consistent view of the network status and allowing devices to react appropriately to network changes.

## Components

### Observables

- **BluetoothSpeakerObservable**
- **WifiRouterObservable**

### Observer Interfaces

- **BluetoothSpeakerObserver**
- **WifiRouterObserver**

### Observers

- **Iphone**
- **Macbook**
- **Television**

### Event Classes

- **BluetoothEvent**
- **WifiEvent**

## Usage

1. **Bluetooth Speaker:**
   - The BluetoothSpeakerObservable notifies BluetoothEvent events when Bluetooth connections are established or disconnected.

2. **Wifi Router:**
   - The WifiRouterObservable notifies WifiEvent events when Wi-Fi connections are established or disconnected.

3. **Devices:**
   - Devices such as Iphone, Macbook, and Television implement the respective observer interfaces (BluetoothSpeakerObserver, WifiRouterObserver).
   - They listen for events from BluetoothSpeakerObservable and WifiRouterObservable, responding to changes in the network.


