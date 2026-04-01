public class TryException {
    public static void main(String[] args){
        int a = 5;
        int b = 0;

        System.out.println(divide(a,b));

    }

    public static int divide(int a , int b){
        try{
            return a/b;
        }
        catch (ArithmeticException e){
            System.out.println(e);
            return -1;
        }
    }
}
