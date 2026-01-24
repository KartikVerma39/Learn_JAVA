import java.util.Scanner;

public class ForLoopJava {
    public static void main(String[] args){

//        String food = "Pizza";
//
//        for(int i = 0 ; i < 10 ; i++){
//            System.out.println(food);
//        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("Tell the number for which you want the Loop : ");
        int max = scanner.nextInt();

        for(int i = 1 ; i <= max ; i++){
            System.out.println(i);
        }

        scanner.close();
    }
}
