package dongho;

import java.time.LocalTime;
import java.util.Date;

public class GetSec extends Thread{
    @Override
    public void run() {

        try {
            Thread.sleep(900);
            for (int i = 0; i < 20;i++){
                Date date = new Date();
                System.out.println(date.getSeconds());
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
