package src;

public class Enums {
    public static void main(String[] args){

//        Enums = (Enumerations) A special kind of class that
//        represents a fixed set of constants.
//        They improve code readability and are easy to maintain.
//        More efficient with switches when comparing Strings.

        Day day = Day.SUNDAY;

        System.out.println(day);
        System.out.println(day.getDayNumber());


        switch (day){
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("It is a weekday");
            case SATURDAY,SUNDAY -> System.out.println("This is the weekend");
        }

    }
}
