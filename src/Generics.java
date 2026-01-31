package src;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args){

//        Gnerics = A concept where you can write a class, interface, or method
//        that is compatiable with different data types.
//        <T> type parameter (placeholder that gets replaced with a real type)
//        <String> type argument (specifies the type)

//        ArrayList<String> fruits = new ArrayList<String>();
//
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Banana");


//        Box<String> box = new Box<>();
//        Box<Integer> box = new Box<>();
//
//
//        box.setItem(34);
//        box.setItem("Banana");
//        System.out.println(box.getItem());


        Product<String,Double> product = new Product<>("apple" , 0.50);
        Product<String,Integer> product2 = new Product<>("tickets" , 50);


        System.out.println(product.getItem());



    }
}
