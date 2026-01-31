package src;

public class AnonymousClass {
    public static void main(String[] args){

//        AnonymousClass = A class that doesn't have a name. Cannot be reused.
//                Add custom behavior without having to create a new class.
//                Often used for ont time uses (TimerTask , Runnable , callbacks)

        Dog4 dog1 = new Dog4();
        Dog4 dog2 = new Dog4(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says Ruh Roh");
            }
        };
        dog1.speak();
        dog2.speak();

    }
}
