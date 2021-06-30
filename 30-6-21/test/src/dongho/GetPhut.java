package dongho;

import java.util.Date;

public class GetPhut extends Thread{
    @Override
    public void run() {

        try {

            for (int i = 0; i < 20;i++){
                Date date = new Date();
                System.out.println("Time :"+date.getMinutes());
                Thread.sleep(60000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
