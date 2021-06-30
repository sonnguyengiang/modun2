package dongho;

import java.time.LocalTime;

public class GetTime extends Thread{
    LocalTime localTime = LocalTime.now();
    int giay;
    int phut;
    @Override
    public void run() {
        try {
            phut = localTime.getMinute();
            for (giay = localTime.getSecond(); ; giay++){
                Thread.sleep(1000);
                System.out.println("phut: " + phut + " giây: " + giay);
                if (giay > 59){
                    giay = 0;
                    phut ++;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
