package src;
import java.util.*;
public class ArrayListExercise {
    public static void main(String[] args){

//        ArrayList = A resizeable array that scores objects (autoboxing)
//        Arrays are fixed in size, but ArrayLists can change


        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        int items;

        System.out.print("How many food items do you want ! : ");
        items = scanner.nextInt();

        for(int i = 0 ; i < items ; i++){
            System.out.print("Tell the food : ");
            String food = scanner.next();
            foods.add(food);
        }

        System.out.println(foods);


        scanner.close();
    }
}
