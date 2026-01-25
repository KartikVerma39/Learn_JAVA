import java.util.Arrays;

public class Array {
        public static void main(String[] args){
//            array = It stores multiple values

            String[] fruits = {"apple" , "orange" , "banana" , "coconut"};

//            fruits[2] = "pineapple";
//            int numOfFruits = fruits.length;

//            System.out.println(fruits[2]);
//            System.out.println(numOfFruits);

//            for(int i = 0 ; i < fruits.length ; i++){
//                System.out.print(fruits[i] + " ");
//            }

//            Arrays.sort(fruits);
            Arrays.fill(fruits,"pineapple");

            for(String it:fruits){
                System.out.println(it);
            }
        }
}
