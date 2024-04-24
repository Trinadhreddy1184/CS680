package umbcs680.hw16.multicast;

@FunctionalInterface 
public interface WifiRouterObserver {

    public  void wifiUpdate( WifiEvent event);

}