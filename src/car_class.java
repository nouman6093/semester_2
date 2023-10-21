//this class is made to be called in car_main program:
//class contains properties,functions,constructors
public class car_class {
    int model;
    String make;
    String company;
    String color;
    car_class(int model,String make,String company, String color){//constructor
        this.model = model;
        this.make = make;
        this.company = company;
        this.color = color;
    }
    void show(){//function
        System.out.println("Model: "+model);
        System.out.println("Make: "+make);
        System.out.println("Company: "+company);
        System.out.println("Color: "+color);
    }
}
