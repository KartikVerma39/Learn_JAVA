import java.util.Scanner;

public class advancedSwitches {
    public static void main(String[] args){
//        Enhanced Switch = A replacement to many else if statements

        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.print("Tell the day Please! : ");
        day = scanner.nextLine();


//        switch (day){
//            case "Monday" -> System.out.println("It is a weekday 😊");
//            case "Tuesday" -> System.out.println("It is a weekday 😊");
//            case "Wednesday" -> System.out.println("It is a weekday 😊");
//            case "Thursday" -> System.out.println("It is a weekday 😊");
//            case "Friday" -> System.out.println("It is a weekday 😊");
//            case "Saturday" -> System.out.println("It is a weekend 😂" );
//            case "Sunday" -> System.out.println("It is a weekend 😂");
//            default -> System.out.println(day + " is not a day");
//        }


        switch(day){
            case "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday"  -> System.out.println("This is a WeekDay! 😒");
            case "Saturday" , "Sunday" -> System.out.println("This is a WeekEnd! 😂");
            default -> System.out.printf("%s is not a day",day);
        }

        scanner.close();
    }
}
