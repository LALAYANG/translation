import java.util.*;
import java.io.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(0);
            return;
        }
        int[] primeFactors = primeFactorize(n);
        int[] counts = new int[10000000];
        for (int p : primeFactors) {
            counts[p]++;
        }
        int ans = 0;
        for (int i = 0; i < counts.length; i++) {
            int x = counts[i];
            for (int j = 1; j < 9999999; j++) {
                if (x >= j) {
                    x -= j;
                    ans++;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    private static int[] primeFactorize(int n) {
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
        if (n > 2) {
            factors.add(n);
        }
        int[] result = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            result[i] = factors.get(i);
        }
        return result;
    }
}