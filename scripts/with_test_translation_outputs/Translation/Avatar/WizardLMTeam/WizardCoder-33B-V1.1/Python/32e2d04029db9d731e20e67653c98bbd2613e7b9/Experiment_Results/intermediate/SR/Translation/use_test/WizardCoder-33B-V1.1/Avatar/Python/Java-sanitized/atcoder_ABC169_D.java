import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        ArrayList<Long> fac = primeFactorize(n);
        HashMap<Long, Integer> map = new HashMap<>();
        for (long num : fac) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            int x = entry.getValue();
            for (int i = 1; i < 10000000; i++) {
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

    public static ArrayList<Long> primeFactorize(long n) {
        ArrayList<Long> a = new ArrayList<>();
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