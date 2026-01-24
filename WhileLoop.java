import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        String name = "";
//        while(name.isEmpty()) {
//            System.out.print("Tell your name : ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);


        int age;
        System.out.print("Tell your age : ");
        age = scanner.nextInt();

//        while(age < 0){
//            System.out.println("Age can't be negative! ");
//            System.out.print("Tell your age Again : ");
//            age = scanner.nextInt();
//        }

        do{
            System.out.println("Age can't be negative! ");
            System.out.print("Tell your age Again : ");
            age = scanner.nextInt();
        }
        while(age < 0);

        System.out.printf("Your age is %d",age);
        scanner.close();
    }
}
