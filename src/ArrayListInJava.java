package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListInJava {
    public static void main(String[] args){
//        ArrayList = A resizeable array that stores objects (autoboxing)
//        Arrays are fixed in size, but ArrayLists can change.

//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(3);
//        list.add(1);
//        list.add(2);
//
//        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");

//        fruits.remove(0);
        fruits.set(0 , "Pineapple");

        System.out.println(fruits.get(0));
        System.out.println(fruits.size());

        Collections.sort(fruits);
        System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
