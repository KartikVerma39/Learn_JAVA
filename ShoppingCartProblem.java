import java.util.Scanner;
public class ShoppingCartProblem {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        Double price;
        int quantity;
        double total;

        System.out.print("Tell the item you want to Buy : ");
        item  = scanner.nextLine();

        System.out.print("Tell the price of Each Item : ");
        price = scanner.nextDouble();

        System.out.print("Tell the total quantity you want to Buy : ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("The total for " + quantity + " " + item + " is $" + total + ".");


        scanner.close();
    }
}
