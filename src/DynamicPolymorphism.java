package src;
import java.util.Scanner;
public class DynamicPolymorphism {
    public static void main(String[] args){
//        Runtime polymorphism = When the method that gets executed is decided
//                                at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        int choice;
        Animal1 animal;

        System.out.println("Tell which Animal Do you Want : ");
        System.out.println("Press 1 for DOG");
        System.out.println("Press 2 for CAT");
        choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog2();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat2();
            animal.speak();
        }

        scanner.close();
    }
}
