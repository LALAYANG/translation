import java.util.*;
import java.math.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = 0;
        if (n == 1) {
            System.out.println(0);
            return;
        }
        List<Long> fac = primeFactorize(n);
        Map<Long, Integer> factorCounts = new HashMap<>();
        for (long p : fac) {
            factorCounts.put(p, factorCounts.getOrDefault(p, 0) + 1);
        }
        for (int e : factorCounts.values()) {
            int x = e;
            for (int i = 1; i < 100000000; i++) {
                if (x >= i) {
                    x -= i;
                    ans++;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    private static List<Long> primeFactorize(long n) {
        List<Long> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2L);
            n /= 2;
        }
        long f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }
}