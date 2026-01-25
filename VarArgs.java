public class VarArgs {
    public static void main(String[] args){
//        varargs = allow a method to accept a varying # of arguments makes methods more flexible, no need for overloaded methods java will pack the arguments into an array

        int sum = add(2, 3, 4, 5, 6);
        System.out.println(sum);
    }

    static int add(int... numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
