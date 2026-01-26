package oops;

public class ArrayOfObjects {
    public static void main(String[] args){
        Mobile mobile1 = new Mobile("Apple" , 100);
        Mobile mobile2 = new Mobile("Samsung" , 90);
        Mobile mobile3 = new Mobile("OnePlus" , 94);

        Mobile[] mobiles = {mobile1 , mobile2 , mobile3};

        for(Mobile mobile : mobiles){
            mobile.tell();
        }
    }
}
