package umbcs680.car;


import java.util.Objects;

public class Car{
    // declaring instance variables 
    private String make,model;
    private int milage,year;
    private float price;

    private Car(String make,String model, int milage, int year, float price){ // creating private constructor
        this.make=make;
        this.model=model;
        this.milage=milage;
        this.year=year;
        this.price=price;
    }

    public static Car getCarInstance(String make,String model, int milage, int year, float price){ //static factory method returning Car Instance
        return new Car(make,model,milage,year,price);
    }
    
    
    // implementing getter methods for instance variables
    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getMilage(){
        return this.milage;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public  float getPrice(){
        return this.price;
    }


}