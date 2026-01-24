public class OverLoadedMethods {
    public static void main(String[] args){
//        overloaded methods = methods that share the same name but different parameters

        System.out.println(add(1,2,3));
    }

    static int add(int a , int b){
        return a + b;
    }

    static int add(int a , int b , int c){
        return a + b + c;
    }
}
