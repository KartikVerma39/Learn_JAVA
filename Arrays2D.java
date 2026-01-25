public class Arrays2D {
    public static void main(String[] args){

        String[] vegetables = {"tomato" , "potato" , "cauliflower"};
        String[] fruits = {"banana" , "apple" , "watermelon"};
        String[] meats = {"fish" , "pork" , "chicken" , "shrimp"};

        String[][] groceries = {fruits , vegetables , meats};

        for(String[] it:groceries){
            for(String it2:it){
                System.out.print(it2 + " ");
            }
            System.out.println();
        }
    }
}
