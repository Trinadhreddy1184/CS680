package umbcs680.hw15.coloradjustment;

import java.util.ArrayList;
import java.util.Objects;

public class GreyScaleAdjuster implements ColorAdjuster{

    @Override
    public umbcs680.hw15.coloradjustment.Color adjust(umbcs680.hw15.coloradjustment.Color color){
        int r,g,b;
        r=color.getRedScale();
        g=color.getGreenScale();
        b=color.getBlueScale();
        int avg = (int) (r+g+b)/3;
        return new umbcs680.hw15.coloradjustment.Color(avg,avg,avg);
    }
}