import java.io.*;
import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(0);
            return;
        }
        int[] primeFactors = primeFactorize(n);
        int[] count = new int[10000000];
        for (int p : primeFactors) {
            count[p]++;
        }
        int ans = 0;
        for (int i = 0; i < count.length; i++) {
            int x = count[i];
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
        List<Integer> primeFactors = new ArrayList<>();
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            primeFactors.add(n);
        }
        int[] result = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++) {
            result[i] = primeFactors.get(i);
        }
        return result;
    }
}