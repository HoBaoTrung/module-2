package Threading.NumberGenerator;

public class NumberGenerator implements Runnable {
    String threadName;

    public NumberGenerator(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + ": " + i);

                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(this.threadName+ ": "+this.hashCode());
    }
}
