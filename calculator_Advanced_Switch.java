import java.util.Scanner;

public class calculator_Advanced_Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double firstNum;
        char operation;
        double secondNum;
        double ans = 0;

        System.out.print("Tell the first Number : ");
        firstNum = scanner.nextDouble();

        System.out.print("Tell the operation you want to Perform : ");
        operation = scanner.next().charAt(0);

        System.out.print("Tell the second Number : ");
        secondNum = scanner.nextDouble();

        switch (operation){
            case '+' ->  ans = firstNum + secondNum;
            case '-' ->  ans = firstNum - secondNum;
            case '*' ->  ans = firstNum * secondNum;
            case '/' ->  {
                if(secondNum == 0){
                    System.out.println("Cannot Divide by zero!");
                    return;
                }
                else {
                    ans = firstNum / secondNum;
                }
            }
            case '^' ->  ans = Math.pow(firstNum , secondNum);
            default -> {
                System.out.printf("%c is not a valid operation" , operation);
                return;
            }
        }

        System.out.println("The ans is : " + ans);


        scanner.close();
    }
}
