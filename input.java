import java.util.Scanner;

public class input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();
        // System.out.println("My name is " + name);

        // System.out.print("Enter your age : ");
        // int age = scanner.nextInt();
        // scanner.nextLine()
        // System.out.println("My name is " + name + " and age is " + age + ".");

        // System.out.print("What is your CGPA : ");
        // double cgpa = scanner.nextDouble();
        // System.out.println(name + " age is " + age + " and cgpa is " + cgpa);

        System.out.print("Are you a Student? : ");
        boolean student = scanner.nextBoolean();

        if(student){
            System.out.println("You are enrolled");
        }        
        else{
            System.out.println("Sorry for your inconvienience");
        }

        scanner.close();
    }
}
