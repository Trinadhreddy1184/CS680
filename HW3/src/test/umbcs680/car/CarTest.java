package umbcs680.car;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class CarTest{

    // private method returning details of Car in String Array
    private String[] carToStringArray(Car car){
        String[] s = {car.getMake(),car.getModel(),String.valueOf(car.getYear())};
        return s;
    }

    // Testcase1: checking Car Instance
    @Test
    public void createCarInstance(){
        Car car =  Car.getCarInstance("Toyota","Camry",24,2010,9500.00f);
        assertNotNull(this.carToStringArray(car));
    }

    // Testcase2: verifying Car Equality
    @Test
    public void  verifyCarEqualityWithMakeModelYear(){
        Car car =  Car.getCarInstance("Toyota","Camry",24,2010,9500.00f);
        car =  Car.getCarInstance("Lamborgini","Urus",10,2023,415000f);
        String[] expectedArray = {"Lamborgini","Urus","2023"};
        assertArrayEquals(expectedArray,this.carToStringArray(car));
        
    }
    
}