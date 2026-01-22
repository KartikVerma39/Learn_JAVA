import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principal;
        double interest;
        int compounded;
        int time;
        double amount;

        System.out.print("Enter the principal :  ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest : ");
        interest = scanner.nextDouble() / 100;

        System.out.print("Enter the amount the interest is compounded : ");
        compounded = scanner.nextInt();

        System.out.print("Enter the number of years : ");
        time = scanner.nextInt();

        amount = principal*(Math.pow((1 + (interest/compounded)) , compounded * time));

        System.out.printf("The amount after %d  year is $%.2f" , time , amount);

        scanner.close();
    }
}
