package Threading.OddAndEven;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("EvenThread: " + i);
            try {
                Thread.sleep(10); // Tạm dừng 10ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
