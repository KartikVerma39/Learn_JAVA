import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) throws InterruptedException{

        Scanner scanner = new Scanner(System.in);

        int guess;
        int totalCorrect = 0;

        System.out.println("-------------------------");
        System.out.println("WELCOME TO JAVA QUIZ GAME");
        System.out.println("-------------------------");

        String[] questions = {"Who is the father of Computer ?","Who is the CEO of Microsoft ?","Who has the first step on Moon ?"};

        String[][] options = {{"1.Charles Babbage","2.Kartik Verma","3.Shalok Dhiman"},{"1.Elon Musk","2.Bill Gates","3.Surjeet Kaur"},{"1.Rajesh Khanna","2.Neil ArmStrong","3.Kalpana Chawla"}};

        int[] answers = {1,2,2};

        for(int i = 0 ; i < answers.length ; i++){
            System.out.println("The " + (i+1) + " Question is : ");
            System.out.println(questions[i]);
            System.out.println("The options are as follows : ");
            for(String it:options[i]){
                System.out.println(it);
            }
            System.out.print("What is your answer : ");
            guess = scanner.nextInt();
            if(guess == answers[i]){
                System.out.println("*******");
                System.out.println("CORRECT");
                System.out.println("*******");
                totalCorrect += 1;
                Thread.sleep(2000);
            }
            else if(guess < 0 || guess > options[0].length){
                System.out.println("INVALID CHOICE");
                Thread.sleep(1500);
                continue;
            }
            else{
                System.out.println("*********");
                System.out.println("INCORRECT");
                System.out.println("*********");
                Thread.sleep(2000);
            }
        }

        System.out.print("Your total correct are : " + totalCorrect + "/" + answers.length + " 😊");

        scanner.close();
    }
}
