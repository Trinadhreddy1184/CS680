package umbcs680.hw15.coloradjustment;

import java.util.ArrayList;
import java.util.Objects;

public class InvertAdjuster implements ColorAdjuster{

    @Override
    public umbcs680.hw15.coloradjustment.Color adjust(umbcs680.hw15.coloradjustment.Color color){
        int r,g,b;
        r=255-color.getRedScale();
        g=255-color.getGreenScale();
        b=255-color.getBlueScale();
        return new umbcs680.hw15.coloradjustment.Color(r,g,b);
    }
}