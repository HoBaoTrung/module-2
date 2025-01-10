package StopWatch;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis(); // Gán thời gian hiện tại
    }

    public void stop() {
        this.endTime = System.currentTimeMillis(); // Gán thời gian hiện tại
    }

    public long getElapsedTime() {
        return endTime - startTime; // Tính khoảng thời gian trôi qua
    }

}