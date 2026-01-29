package src;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args){

//        Exception = An event that interrupts the normal flow of a program
//        (Dividing by zero, file not found, mismatch input type)
//        Surround any dangerous code with a try{} block
//        try{} , catch{} , finally{}


//        try {
//            System.out.println(1 / 0);
//        }
//        catch(ArithmeticException e){
//            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
//        }

        Scanner scanner = new Scanner(System.in);
        int number;

        try{
            System.out.print("Tell a number : ");
            number = scanner.nextInt();
        }
        catch(InputMismatchException i){
            System.out.println("YOU CAN ONLY GIVE A NUMBER AS INPUT");
        }
        catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        catch(Exception e){
            System.out.println("SOMETHING WENT WRONG");
        }
        finally {
            scanner.close();
            System.out.println("This always executes.");
        }


    }
}
