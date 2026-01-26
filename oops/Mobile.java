package oops;

public class Mobile {
    String brand;
    int battery;

    Mobile(String brand , int battery){
        this.brand = brand;
        this.battery = battery;
    }

    void tell(){
        System.out.println("Your " + this.brand + " has " + battery + " health.");
    }
}
