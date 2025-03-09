package Threading.Prime;


public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                System.out.println("OptimizedPrimeFactorization: " + num);
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
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) { // Kiểm tra đến √n, bỏ qua số chẵn
            if (n % i == 0) return false;
        }
        return true;
    }
}
