package umbcs680.smarthome;

import java.util.LinkedList;

public class SmartHomes {

    private static LinkedList<Zone> homes;
    private static SmartHomes instance;
    private  SmartHomes(){}

    public static SmartHomes getSmartHomes(){
        if(instance == null){
            instance = new SmartHomes();
        }
        homes = new LinkedList<Zone>();
        return instance;
    }

    public static LinkedList<Zone> getHomes() {
        return homes;
    }

    public void appendHome(Zone home){
        homes.add(home);
    }

    public int getHomeCount(){
        return homes.size();
    }
}