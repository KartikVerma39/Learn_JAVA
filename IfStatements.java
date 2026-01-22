public class IfStatements {
    public static void main(String[] args){
        int age = 0;
        String name = "";
        

        if(name.isEmpty()){
            System.out.println("Name is not there");
        }


        if(age >= 65){
            System.out.println("You are a Senior!");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet!");
        }
        else if(age >= 18){
            System.out.println("You are a Adult!");
        }
        else if(age == 0){
            System.out.println("You are just Born!");
        }
        else{
            System.out.println("You are a child!");
        }
    }
}
