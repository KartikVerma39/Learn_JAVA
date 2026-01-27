package src;

public class Inheritance {
    public static void main(String[] args){


//        Inheritance = One class inherits the attributes and methods from another class

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plants plant = new Plants();

//        System.out.println(dog.isAlive);
//        dog.eat();
//        System.out.println(cat.isAlive);
//        cat.eat();

//        System.out.println(dog.lives);
//        System.out.println(cat.lives);
//        dog.speak();
//        cat.speak();


        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        plant.photosynthesis();
    }
}
