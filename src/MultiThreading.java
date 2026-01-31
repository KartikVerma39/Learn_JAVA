package src;

public class MultiThreading {
    public static void main(String[] args){

//        MultiThreading = Enables a program to run multiple threads concurrently
//        (Thread = A set of instructions that run independently)
//         Useful for background tasks or time-consuming operations

        My my = new My();
        Thread thread = new Thread(my);
        thread.start();

    }
}
