import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC169_D {
    static int check_one_thirty_five = 321;
    static int check_two_thirty_five = 274;
    static int check_one_thirty_one = 602;
    static int check_two_thirty_one = 13;
    static int INF = 99999999999999999999999;
    static int MOD = 10000000007;
    static int n;
    static int[] arr;
    static Queue<Integer> queue_prime_factorize0 = new LinkedList<>();
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if ((check_one_thirty_five & check_two_thirty_five) != 0 && (check_one_thirty_one & check_two_thirty_one) != 0) {
            if (n == 1) {
                System.out.println(0);
                return;
            }
            Thread thread_prime_factorize0 = new Thread(new PrimeFactorizeThread());
            thread_prime_factorize0.start();
            try {
                thread_prime_factorize0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int[] fac_ = queue_prime_factorize0.poll();
            int ans = 0;
            for (int i = 0; i < fac_.length; i++) {
                int p = fac_[i];
                int e = 0;
                for (int j = i + 1; j < fac_.length; j++) {
                    if (fac_[j] == p) {
                        e++;
                    }
                }
                for (int x = e; x >= 1; x--) {
                    if (x >= i) {
                        x -= i;
                        ans += 1;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }

    static class PrimeFactorizeThread implements Runnable {
        public void run() {
            int[] result = primeFactorize(n);
            lock.lock();
            try {
                queue_prime_factorize0.add(result);
            } finally {
                lock.unlock();
            }
        }
    }

    static int[] primeFactorize(int n) {
        int[] arr = new int[10000000];
        int i = 0;
        while (n % 2 == 0) {
            arr[i++] = 2;
            n /= 2;
        }
        for (int f = 3; f * f <= n; f += 2) {
            if (n % f == 0) {
                arr[i++] = f;
                n /= f;
            }
        }
        if (n != 1) {
            arr[i++] = n;
        }
        return arr;
    }
}