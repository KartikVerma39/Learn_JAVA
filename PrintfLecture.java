public class PrintfLecture {
    public static void main(String[] args){
        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        // double height = 60.5;
        // boolean isEmployed = true;

        // System.out.printf("Hello %s\n", name);
        // System.out.printf("Your name starts with %c\n", firstLetter);
        // System.out.printf("You are %d years old\n",age);
        // System.out.printf("You are %.1f inch",height);
        // System.out.printf("Employed %b\n",isEmployed);
        System.out.printf("%s is of age %d and his first word of name is %c",name,age,firstLetter);
    }
}
