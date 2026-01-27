package src;

public class StaticKeyWord {
    public static void main(String[] args){

//      static = Makes a variable or method belong to the class rather than to any specific object.

        Friend friend1 = new Friend("Kartik");
        Friend friend2 = new Friend("Paras");
        Friend friend3 = new Friend("Shalok");
        Friend friend4 = new Friend("Agrim");

//        System.out.println(friend1.numberOfFriends);
//        System.out.println(friend2.numberOfFriends);

        Friend.showFriends();
    }
}
