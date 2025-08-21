import java.util.*;
import java.io.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> primeFactors = primeFactorize(n);
        Map<Integer, Integer> factorCounts = new HashMap<>();
        for (int factor : primeFactors) {
            factorCounts.put(factor, factorCounts.getOrDefault(factor, 0) + 1);
        }

        int ans = 0;
        for (int count : factorCounts.values()) {
            int x = count;
            for (int i = 1; i < 99999999; i++) {
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

    private static List<Integer> primeFactorize(int n) {
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