package umbcs680.hw15.coloradjustment;
import java.util.ArrayList;
import java.util.Objects;

public class Image {

    private int width,height;
    private ArrayList<ArrayList<umbcs680.hw15.coloradjustment.Color>> pixels;
    private final umbcs680.hw15.coloradjustment.Color defaultcolor;
    public Image(int width,int height){
        this.width=width;
        this.height=height;
        this.defaultcolor = new umbcs680.hw15.coloradjustment.Color(255,255,255);
        this.pixels = new ArrayList<>(width-1);
        for (int x = 0; x < width; x++) {
            this.pixels.add(new ArrayList<>(height));
            for (int y = 0; y < height; y++) {
                this.pixels.get(x).add(defaultcolor);
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public umbcs680.hw15.coloradjustment.Color getColor(int x,int y){
        return pixels.get(x).get(y);
    }
    public void setColor(int x,int y,umbcs680.hw15.coloradjustment.Color color){
        pixels.get(x).set(y,color);
    }
}

