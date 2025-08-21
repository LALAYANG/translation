import java.util.*;
import java.io.*;
import java.math.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        List<Long> fac = primeFactorize(n);
        Map<Long, Integer> cnt = new HashMap<>();
        for (long f : fac) {
            cnt.put(f, cnt.getOrDefault(f, 0) + 1);
        }
        for (long f : cnt.keySet()) {
            System.out.println(f + " " + cnt.get(f));
        }
    }

    public static List<Long> primeFactorize(long n) {
        List<Long> res = new ArrayList<>();
        while (n % 2 == 0) {
            res.add(2L);
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            res.add(n);
        }
        return res;
    }
}