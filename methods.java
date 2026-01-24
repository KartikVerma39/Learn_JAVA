public class methods {
    public static void main(String[] args) {

//        method = a bock of code that is executed when called ()

        String name = "Kartik";
        int age = 25;

//        happyBirthday(name , age); // arguments;

//        happyBirthday(name , age);
//        happyBirthday(name , age);

        int number = 5;
        int squareOfNumber = square(number);
        System.out.println("The square of " + number + " is " + squareOfNumber);


    }

    static int square(int number){
        return number * number;
    }

    static void happyBirthday(String name , int age){ // Parameters
        System.out.printf("Happy Birthday to You %s.",name);
        System.out.println();
        System.out.printf("You are now %d years old.",age);
        System.out.println();
    }
}
