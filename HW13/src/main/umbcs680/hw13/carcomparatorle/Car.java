package umbcs680.hw13.carcomparatorle;


import java.util.ArrayList;
import java.util.Objects;

public class Car{
    // declaring instance variables 
    private String make,model;
    private int mileage,year;
    private float price;
    private int dominationCount;

    private Car(String make,String model, int mileage, int year, float price){ // creating private constructor
        this.make=make;
        this.model=model;
        this.mileage=mileage;
        this.year=year;
        this.price=price;
        this.dominationCount=0;
    }

    public static Car getCarInstance(String make,String model, int mileage, int year, float price){ //static factory method returning Car Instance
        return new Car(make,model,mileage,year,price);
    }
    
    
    // implementing getter methods for instance variables
    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getMileage(){
        return this.mileage;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public  float getPrice(){
        return this.price;
    }

    public int getDominationCount() {
        return dominationCount;
    }

    public void setDominationCount(ArrayList<Car> cars) {
        for (Car car:cars) {
            if (this.mileage <= car.getMileage() && (this.price <= car.getPrice()) && (this.year >= car.getYear())){
                if ((this.mileage != car.getMileage()) || (this.price != car.getPrice()) || (this.year != car.getYear()) ) 
                    this.dominationCount++;
            }
        }
    }
}