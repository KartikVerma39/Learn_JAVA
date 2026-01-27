package src;

public class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
