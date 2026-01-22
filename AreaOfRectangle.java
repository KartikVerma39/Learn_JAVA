import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        int length = 0;
        int breadth = 0;
        int area = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tell the length of the rectangle : ");
        length = scanner.nextInt();
        System.out.print("Tell the breadth of the rectangle : ");
        breadth = scanner.nextInt();
        area  = length * breadth;
        System.out.println("The area of the Rectangle is :  " + area + "  cm²");
        scanner.close();
    }
}
