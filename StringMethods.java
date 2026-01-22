public class StringMethods {
    public static void main(String[] args){

        String name = "   Bro Code   ";
        // int length = name.length();
        // char letter = name.charAt(3);
        // int index = name.indexOf("o");
        // int lastIndex = name.lastIndexOf("o");
        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("o", "a")
        

        // if(name.contains(" ")){
        //     System.out.println("Your name contains spaces");
        // }
        // else{
        //     System.out.println("It not contains any space");
        // }

        // .equals()
        // .isEmpty()

        if(name.equalsIgnoreCase("name")){
            System.out.println("Your name cant be a password");
        }
        else{
            System.out.println("It can be a password");
        }

        System.out.print(name);
    }
}
