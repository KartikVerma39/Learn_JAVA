package src;

public class ToString {
    public static void main(String[] args){
//         .toString() = Method inherited from the Object class.
//         Used to return a string representation of an object.
//         By default it return a hash code as a unique identifier
//         It can be overridder to provide meaningful details

        Car1 car1 = new Car1("Ford" ,"Mustang" , 2025 , "Black");
        Car1 car2 = new Car1("Chevorelet" ,"Corvette" , 2024 , "Blue");


        System.out.println(car1);
        System.out.println(car2);
    }
}
