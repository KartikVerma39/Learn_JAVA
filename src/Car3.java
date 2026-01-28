package src;

public class Car3 {

    private final String model;
    private String color;
    private int price;

    Car3(String model , String color , int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    int getPrice(){
        return this.price;
    }
//
//    void setModel(String model){
//        this.model = model;
//    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        this.price = price;
    }

}
