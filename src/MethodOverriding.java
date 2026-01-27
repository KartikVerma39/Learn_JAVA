package src;

public class MethodOverriding {
    public static void main(String[] args) {

//    Method Overrriding = When a subclass provides its own implementation of a method that is already defined.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();


        dog.move();
        cat.move();
        fish.move();

    }
}
