import java.util.Scanner;

public class UsernameValidater {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        username must be between 4-12 characters
//        username must not contain spaces or underscores

        String username;

        System.out.print("Tell the username : ");
        username = scanner.nextLine();

        if(username.length() >= 4 && username.length()<=12 && !username.contains(" ") && !username.contains("_")){
            System.out.println("It is a valid Username");
        }
        else{
            System.out.println("It is not a Valid Username");
        }

        scanner.close();
    }
}
