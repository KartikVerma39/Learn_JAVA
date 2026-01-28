package src;

public class GettersAndSetters {
    public static void main(String[] args) {
//    They help protected object data and add rules for accessing or modifying them
//        GETTERS = Methods that make a field READABLE
//        SETTERS = Methods that make a field WRITEABLE
//        Final = So that a variable is not Writeable


        Car3 car = new Car3("Charger" , "Yellow" , 10000);

        car.setColor("Black");
//        car.setModel("Range");
        car.setPrice(100000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
