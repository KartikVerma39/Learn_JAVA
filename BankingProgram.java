import java.util.Scanner;

public class BankingProgram {
    static int balance = 0;
    public static void main(String[] args){

        int choice;
        int dep;
        int with;
        Scanner scanner = new Scanner(System.in);
        System.out.println("TO SEE THE BALANCE PRESS 1");
        System.out.println("TO DEPOSIT PRESS 2");
        System.out.println("TO WITHDRAW PRESS 3");
        System.out.println("TO EXIT PRESS 4");
        System.out.print("YOUR CHOICE : ");
        choice = scanner.nextInt();



        while(choice != 4) {
            if (choice == 1) {
                displayBalance();
            } else if (choice == 2) {
                System.out.print("Enter the amount you want to Deposit : ");
                dep = scanner.nextInt();
                System.out.println();
                deposit(dep);
                System.out.println("Your amount has been deposited");
                displayBalance();
            } else if (choice == 3) {
                System.out.print("Enter the amount you want to withdraw : ");
                with = scanner.nextInt();
                System.out.println();
                if(with <= 0) {
                    System.out.println("The balance to withdraw is Invalid ⚠️");
                }
                else{
                    withdraw(with);
                    System.out.println("Your amount has been withdrawn");
                    displayBalance();
                }
            }
            else{
                System.out.println("That is an Invalid Choice");
            }
            System.out.println("--------NOW WHAT OPERATION YOU WANT----------");
            System.out.println("TO SEE THE BALANCE PRESS 1");
            System.out.println("TO DEPOSIT PRESS 2");
            System.out.println("TO WITHDRAW PRESS 3");
            System.out.println("TO EXIT PRESS 4");
            System.out.print("YOUR CHOICE : ");
            choice = scanner.nextInt();

        }

        System.out.println("You had been exited!😊");

        scanner.close();
    }

    static void displayBalance(){
        System.out.printf("Your Balance is %d",balance);
        System.out.println();
    }

    static void deposit(int dep){
        balance = balance + dep;
    }

    static void withdraw(int with){
        balance = balance - with;
    }
}
