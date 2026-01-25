import java.util.Scanner;

public class InputInArray {
    public static void main(String[] args){

//        String[] foods =  new String[3];
//
//        foods[0] = "pizza";
//        foods[1] = "hamburger";
//        foods[2] = "FrenchFries";

//        System.out.println(foods.length);
//
//        for(String it:foods){
//            System.out.println(it);
//        }

        Scanner scanner = new Scanner(System.in);

        int size;
        System.out.print("Tell the size of the array : ");
        size = scanner.nextInt();

        String[] foods = new String[size];

        for(int i = 0 ;  i<size ; i++){
            System.out.printf("Enter the %d element of the array : ",i+1);
            foods[i] = scanner.next();
        }


        for(String food : foods){
            System.out.println(food);
        }



        scanner.close();
    }
}
