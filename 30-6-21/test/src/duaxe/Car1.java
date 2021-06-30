package duaxe;


public class Car1 extends Thread {

    private int speed;

    public Car1(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        try {
            for (int quangDuong = 0; quangDuong < 1000 ;quangDuong+=speed) {
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("xe 1 di het " + (endTime-startTime) + " ms");

    }
}
