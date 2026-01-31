package src;

import java.util.Scanner;
import java.util.TimerTask;
import java.util.Timer;

public class CountDownUsingTimer {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        int response;
        System.out.print("How much count you want : ");
        response = scanner.nextInt();

        TimerTask timerTask = new TimerTask() {
            int count = response;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count <= 0) {
                    System.out.println("HAPPY NEW YEAR");
                    timer.cancel();
                }

            }
        };

        timer.schedule(timerTask , 0 , 1000);

    }
}
