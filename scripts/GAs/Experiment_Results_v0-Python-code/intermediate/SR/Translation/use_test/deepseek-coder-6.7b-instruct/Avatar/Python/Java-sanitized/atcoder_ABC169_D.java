import java.util.*;
import java.math.*;

public class atcoder_ABC169_D {
    static Scanner in = new Scanner(System.in);
    static int MOD = (int)1e9 + 7;
    static int INF = (int)1e9;

    public static void main(String[] args) {
        int num = in.nextInt();
        if (num == 1) {
            System.out.println(0);
            System.exit(0);
        }

        List<Integer> fac = prime_factorize(num);
        Map<Integer, Integer> freq = new HashMap<>();
        for (int p : fac) {
            freq.put(p, freq.getOrDefault(p, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int p = entry.getKey();
            int e = entry.getValue();
            int x = e;
            for (int i = 1; i < INF; i++) {
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

    static List<Integer> prime_factorize(int num) {
        List<Integer> a = new ArrayList<>();
        while (num % 2 == 0) {
            a.add(2);
            num = num / 2;
        }
        int f = 3;
        while (f * f <= num) {
            if (num % f == 0) {
                a.add(f);
                num = num / f;
            } else {
                f += 2;
            }
        }
        if (num != 1) {
            a.add(num);
        }
        return a;
    }
}