import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double weight;
        double convertedWeight;
        int choice;
        
        System.out.println("Welcome to Our Weight Converter 😊 ");

        System.out.print("Enter the weight you want to convert : ");
        weight = scanner.nextDouble();

        System.out.print("If you want to convert from lbs to kgs then press 1 else press 2 : ");
        choice = scanner.nextInt();

        if(choice == 1){
            convertedWeight = weight*0.453592;
            System.out.printf("The weight from lbs to kgs is %.2f",convertedWeight);
        }
        else if(choice == 2){
            convertedWeight = weight*2.20462;
            System.out.printf("The weight from kgs to lbs is %.2f",convertedWeight);
        }
        else{
            System.out.println("Your choice is not valid");
        }


        scanner.close();
    }
}
