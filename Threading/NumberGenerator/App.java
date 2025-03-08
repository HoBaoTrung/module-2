package Threading.NumberGenerator;

public class App {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator("Thread 1");
        NumberGenerator num2 = new NumberGenerator("Thread 2");
        Thread t1 = new Thread(num1);
        Thread t2 = new Thread(num2);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
