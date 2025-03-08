package Threading.RunablePractice;

public class RunnableDemo implements Runnable {
    Thread thread;
    private String name;

    RunnableDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + name + " is running: " + i);

                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " interrupted.");
        }
        System.out.println("Thread " + name + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + name);
        if (thread == null) {
            thread = new Thread(this, name);
            thread.start();
        }
    }
}
