public class CountDownToNewYear {
    public static void main(String[] args) throws InterruptedException {

        int timer = 10;

        for(int i = timer ; i>0 ; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR 😍");
    }
}
