import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class atcoder_ABC169_D {
    private static final int MOD = 1000000007;
    private static final int MAX_PRIME = 1000000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }

        List<Integer> primeFactors = new ArrayList<>();
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }

        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                primeFactors.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }

        if (n != 1) {
            primeFactors.add(n);
        }

        int ans = 0;
        for (int p : primeFactors) {
            int x = 1;
            for (int i = 1; i <= 99999999; i++) {
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