import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userChoice = 0;
        int userPoints = 0;
        int systemChoice;
        int systemPoints = 0;
        String[] arr = {"Rock" , "Paper" , "Scissor"};

        System.out.println("+++++++++++++++");
        System.out.println("WELCOME TO GAME");
        System.out.println("+++++++++++++++");
        System.out.println();


        while (userChoice >= 0 && userChoice <= 3) {
            System.out.println("Press 0 for Rock");
            System.out.println("Press 1 for Paper");
            System.out.println("Press 2 for Scissor");
            System.out.println("Press 3 to EXIT");
            System.out.print("What is Your Choice : ");
            userChoice = scanner.nextInt();
            systemChoice = random.nextInt(0, 3);
            if (userChoice == systemChoice) {
                System.out.println("------Its a Draw------");
            } else if (userChoice == 0 && systemChoice == 1) {
                System.out.println("------System Won--------");
                systemPoints++;
            } else if (userChoice == 0 && systemChoice == 2) {
                System.out.println("------User Won--------");
                userPoints++;
            } else if (userChoice == 1 && systemChoice == 2) {
                System.out.println("------System Won-------");
                systemPoints++;
            } else if (userChoice == 1 && systemChoice == 0) {
                System.out.println("------User Won--------");
                userPoints++;
            } else if (userChoice == 2 && systemChoice == 0) {
                System.out.println("------System Won-------");
                systemPoints++;
            } else if (userChoice == 2 && systemChoice == 1) {
                System.out.println("-------User Won--------");
                userPoints++;
            } else {
                if (userPoints > systemPoints) {
                    System.out.println("USER POINTS ARE " + userPoints + " AND SYSTEM POINTS ARE " + systemPoints);
                    System.out.println("SO USER WON BY " + (userPoints - systemPoints) + " POINTS");
                } else if (systemPoints > userPoints) {
                    System.out.println("USER POINTS ARE " + userPoints + " AND SYSTEM POINTS ARE " + systemPoints);
                    System.out.println("SO SYSTEM WON BY " + (systemPoints - userPoints) + " POINTS");
                }
                else{
                    System.out.println("ITS A DRAW");
                }
                break;
            }
        }

        System.out.println("-------THANKS FOR PLAYING------");
        scanner.close();
    }
}

