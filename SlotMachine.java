import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100;
        int payout;
        int bet;
        String[] row;
        String playAgain;

        System.out.println("-----------------------");
        System.out.println("WELCOME TO SLOT MACHINE");
        System.out.println("SYMBOLS : 💕 ⚠️ 😠 ");
        System.out.println("-----------------------");

        while(balance > 0){
            System.out.println("CURRENT BALANCE : " + balance);
            System.out.print("Place Your Bet Amount :  ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet > balance){
                System.out.println("INSUFFICIENT BALANCE");
                continue;
            }
            else if(bet <= 0){
                System.out.println("THE BET AMOUNT IS TOO LOW");
                continue;
            }
            else{
                balance = balance - bet;
                System.out.println("BALANCE : " + balance);
            }
            System.out.println("SPINNING....");
            row = spinRow();
            printRow(row);
            payout = payout(row,bet);
            if(payout > 0){
                System.out.println("YOU WON " + payout);
                balance = balance + payout;
            }
            else{
                System.out.println("SORRY YOU LOST THIS ROUND");
            }
            System.out.println("Do you want to play Again (y/n) : ");
            playAgain = scanner.nextLine();
            if(playAgain.equals("n")){
                break;
            }
        }

        scanner.close();
    }

    static String[] spinRow(){
        Random random = new Random();
        String[] spin = {"💕" , "😠" , "⚠️"};
        String[] ans = new String[3];

        for(int i = 0 ; i<3 ; i++){
            ans[i] = spin[random.nextInt(0,3)];
        }

        return ans;
    }

    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join("|" , row));
        System.out.println("**************");
    }

    static int payout(String[] row , int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            bet = bet * 10;
            return bet;
        }
        else{
            return 0;
        }
    }
}
