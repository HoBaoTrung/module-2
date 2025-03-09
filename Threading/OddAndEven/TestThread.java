package Threading.OddAndEven;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start(); // Chạy luồng in số lẻ trước

        try {
            oddThread.join(); // Đợi OddThread hoàn thành trước khi chạy EvenThread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        evenThread.start();
    }
}
