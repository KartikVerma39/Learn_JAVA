import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String email;
        System.out.print("Tell your Email Please: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            
            String username = email.substring(0,email.indexOf("@"));

            String domain = email.substring(email.indexOf("@")+1);

            System.out.printf("Your username is %s\n" , username);
            System.out.printf("Your domain is %s" , domain);

        }
        else{
            System.out.println("Emnail must contain @.");
        }
        
        scanner.close();
    }
}
