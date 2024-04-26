package umbcs680.hw15.coloradjustment;

import java.util.ArrayList;
import java.util.Objects;

public class Images {

    public static umbcs680.hw15.coloradjustment.Image transform(Image image,ColorAdjuster adjuster){
        umbcs680.hw15.coloradjustment.Image adjusted = new umbcs680.hw15.coloradjustment.Image(image.getWidth(),image.getHeight());
        for(int i=0;i<adjusted.getWidth();i++){
            for(int j=0;j<adjusted.getHeight();j++){
                adjusted.setColor(i,j,adjuster.adjust(image.getColor(i,j)));
            }
        }
        return adjusted;
    }
}