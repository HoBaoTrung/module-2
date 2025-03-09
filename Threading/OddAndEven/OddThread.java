package Threading.OddAndEven;

public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("OddThread: " + i);
            try {
                Thread.sleep(15); // Tạm dừng 10ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
