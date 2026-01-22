import java.util.Scanner;

public class TemperatureConverter{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        double temperature;

        System.out.print("Tell the Temperature : ");
        temperature = scanner.nextDouble();

        char choice;
        System.out.print("Tell your choice to C or to F : ");
        choice = scanner.next().charAt(0);

        double convertedTemp = (choice == 'F') ? (((9.0/5)*temperature) + 32) : (((5.0/9)*temperature) - 32);

        System.out.printf("The converted Temperature is : %.2f" , convertedTemp);



        scanner.close();
    }
}