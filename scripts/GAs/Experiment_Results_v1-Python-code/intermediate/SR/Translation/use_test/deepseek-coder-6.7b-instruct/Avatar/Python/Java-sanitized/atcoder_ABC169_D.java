import java.util.*;
import java.math.*;

public class atcoder_ABC169_D {
    static int MOD = (int)1e9 + 7;
    static int INF = (int)1e9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
            System.exit(0);
        }
        List<Integer> factors = primeFactorize(n);
        Map<Integer, Integer> factorCounts = new HashMap<>();
        for (int factor : factors) {
            factorCounts.put(factor, factorCounts.getOrDefault(factor, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : factorCounts.entrySet()) {
            int x = entry.getValue();
            for (int i = 1; i < INF; i++) {
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

    public static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            factors.add(n);
        }
        return factors;
    }
}