package umbcs680.hw15.coloradjustment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.Arrays;

public class ImageTest {
    
    private  umbcs680.hw15.coloradjustment.Image image;
    
 
    
    @Test
    public void instanceCheck(){
        image = new umbcs680.hw15.coloradjustment.Image(12,12);
        assertNotNull(image);
    }
    

    @Test
    public void colorTest(){
        image = new umbcs680.hw15.coloradjustment.Image(12,12);
        image.setColor(3,4,new umbcs680.hw15.coloradjustment.Color(240,20,200));
        int[] expected = {240,20,200};
        int[] actual= {image.getColor(3,4).getRedScale(),image.getColor(3,4).getGreenScale(),image.getColor(3,4).getBlueScale()};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void colorTestTransformToGrey(){
        image = new umbcs680.hw15.coloradjustment.Image(12,12);
        image.setColor(3,4,new umbcs680.hw15.coloradjustment.Color(240,20,200));
        umbcs680.hw15.coloradjustment.Image grey_img= umbcs680.hw15.coloradjustment.Images.transform(image,new GreyScaleAdjuster());
        int[] expected = {153,153,153};
        int[] actual= {grey_img.getColor(3,4).getRedScale(),grey_img.getColor(3,4).getGreenScale(),grey_img.getColor(3,4).getBlueScale()};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void colorTestTransformToGreyLE(){
        image = new umbcs680.hw15.coloradjustment.Image(12,12);
        image.setColor(3,4,new umbcs680.hw15.coloradjustment.Color(240,20,200));
        umbcs680.hw15.coloradjustment.Image grey_img= umbcs680.hw15.coloradjustment.Images.transform(image,(umbcs680.hw15.coloradjustment.Color color)->{
            int r,g,b;
            r=color.getRedScale();
            g=color.getGreenScale();
            b=color.getBlueScale();
            int avg = (int) (r+g+b)/3;
            return new umbcs680.hw15.coloradjustment.Color(avg,avg,avg);
        });
        int[] expected = {153,153,153};
        int[] actual= {grey_img.getColor(3,4).getRedScale(),grey_img.getColor(3,4).getGreenScale(),grey_img.getColor(3,4).getBlueScale()};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void colorTestTransformInvert(){
        image = new umbcs680.hw15.coloradjustment.Image(12,12);
        image.setColor(3,4,new umbcs680.hw15.coloradjustment.Color(240,20,200));
        umbcs680.hw15.coloradjustment.Image grey_img= umbcs680.hw15.coloradjustment.Images.transform(image,new InvertAdjuster());
        int[] expected = {15,235,55};
        int[] actual= {grey_img.getColor(3,4).getRedScale(),grey_img.getColor(3,4).getGreenScale(),grey_img.getColor(3,4).getBlueScale()};
        assertArrayEquals(expected,actual);
    }
    @Test
    public void colorTestTransformInvertLE(){
        image = new umbcs680.hw15.coloradjustment.Image(12,12);
        image.setColor(3,4,new umbcs680.hw15.coloradjustment.Color(240,20,200));
        umbcs680.hw15.coloradjustment.Image grey_img= umbcs680.hw15.coloradjustment.Images.transform(image,(umbcs680.hw15.coloradjustment.Color color)->{
            int r,g,b;
            r=255-color.getRedScale();
            g=255-color.getGreenScale();
            b=255-color.getBlueScale();
            return new umbcs680.hw15.coloradjustment.Color(r,g,b);
        });
        int[] expected = {15,235,55};
        int[] actual= {grey_img.getColor(3,4).getRedScale(),grey_img.getColor(3,4).getGreenScale(),grey_img.getColor(3,4).getBlueScale()};
        assertArrayEquals(expected,actual);
    }
}