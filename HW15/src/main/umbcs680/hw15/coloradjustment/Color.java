package umbcs680.hw15.coloradjustment;
import java.util.ArrayList;
import java.util.Objects;

public class Color {

    private int redScale,greenScale,blueScale;

    public Color(int r,int g,int b){
        this.redScale=r;
        this.greenScale=g;
        this.blueScale=b;
    }

    public int getBlueScale() {
        return blueScale;
    }

    public int getGreenScale() {
        return greenScale;
    }

    public int getRedScale() {
        return redScale;
    }


}