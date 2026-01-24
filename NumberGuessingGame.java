import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber;
        int guess;
        int attempt = 0;

        randomNumber = random.nextInt(1,11);

        do{
            System.out.print("Tell the number between 1 - 10 : ");
            guess = scanner.nextInt();
            attempt++;

            if(guess < randomNumber){
                System.out.println("TOO LOW");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH");
            }
            else{
                System.out.println("CORRECT");
            }
        }
        while(guess!=randomNumber);

        System.out.printf("You guessed the number %d in %d attempt." , randomNumber , attempt);

        scanner.close();
    }
}
