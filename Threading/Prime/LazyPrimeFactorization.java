package Threading.Prime;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                System.out.println("LazyPrimeFactorization: " + num);
            }
            num++;
            try {
                Thread.sleep(100); // Giảm tải CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) { // Kiểm tra từ 2 đến n-1 (kém tối ưu)
            if (n % i == 0) return false;
        }
        return true;
    }
}
