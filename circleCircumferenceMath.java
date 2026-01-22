import java.util.Scanner;
public class circleCircumferenceMath {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double radius;
        System.out.print("Tell the radius of the Circle : ");
        radius = scanner.nextDouble();
        scanner.nextLine();

        double circumference1 = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius , 2);
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius , 3);

        String ch;
        System.out.print("What do you want for circumference press C for area press A for volume press V : ");
        ch = scanner.nextLine();

        if(ch.equals("C")){
            System.out.printf("The circumference is : %.2fcm" , circumference1);
        }
        else if(ch.equals("A")){
            System.out.printf("The Area is : %.1fcm" , area);
        }
        else{
            System.out.printf("The volume is : %.1fcm" , volume);
        }

        scanner.close();
    }
}
