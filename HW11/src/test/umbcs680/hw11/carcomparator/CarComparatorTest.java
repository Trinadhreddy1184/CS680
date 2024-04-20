package umbcs680.hw11.carcomparator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class CarComparatorTest {
    
    private static ArrayList<Car> cars;

   @BeforeAll
    public static void setUp(){
        cars = new ArrayList<Car>();
        cars.add(Car.getCarInstance("Lamborgini","Urus",1000,2023,415000f));
        cars.add(Car.getCarInstance("Toyota","Camry",24000,2010,9500.00f));
        cars.add(Car.getCarInstance("Nissan","GTR",900,2017,190500.00f));
        cars.add(Car.getCarInstance("BMW","X3",16000,2012,10500.00f));
    }
    
    @Test
    public void sortByPrice(){

       ArrayList<String> expected = new ArrayList<>();
       expected.add("Toyota");
       expected.add("BMW");
       expected.add("Nissan");
       expected.add("Lamborgini");
       Collections.sort(cars,new PriceComparator());
       ArrayList<String> actual = new ArrayList<String>();
        for (Car car:
             cars) {
            actual.add(car.getMake());
        }
        assertIterableEquals(actual,expected);
    }

    @Test
    public void sortByMileage(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Nissan");
        expected.add("Lamborgini");
        expected.add("BMW");
        expected.add("Toyota");
        Collections.sort(cars,new MileageComparator());
        ArrayList<String> actual = new ArrayList<String>();
        for (Car car:
                cars) {
            actual.add(car.getMake());
        }
        assertIterableEquals(actual,expected);
    }

    @Test
    public void sortByYear(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Lamborgini");
        expected.add("Nissan");
        expected.add("BMW");
        expected.add("Toyota");
        Collections.sort(cars,new YearComparator());
        ArrayList<String> actual = new ArrayList<String>();
        for (Car car:
                cars) {
            actual.add(car.getMake());
        }
        assertIterableEquals(actual,expected);
    }

    @Test
    public void sortByPareto(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Lamborgini");
        expected.add("Nissan");
        expected.add("BMW");
        expected.add("Toyota");
        for (Car car: cars) {
            car.setDominationCount(cars);
        }
        Collections.sort(cars,new ParetoComparator());
        ArrayList<String> actual = new ArrayList<String>();
        for (Car car:
                cars) {
            actual.add(car.getMake());
        }
        assertIterableEquals(actual,expected);
    }
    
    

}