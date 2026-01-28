package src;

public class Interface {
    public static void main(String[] args){

//        Interface = A blueprint for a class that specifies a set of abstract methods
//                that implementing classes MUST define.
//                Supports multiple inheritance-like behavior

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish1 fish = new Fish1();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}
