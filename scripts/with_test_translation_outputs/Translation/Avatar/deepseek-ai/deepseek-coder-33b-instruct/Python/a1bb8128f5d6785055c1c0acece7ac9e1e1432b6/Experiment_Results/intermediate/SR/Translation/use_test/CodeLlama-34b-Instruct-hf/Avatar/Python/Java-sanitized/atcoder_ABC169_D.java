import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }

        List<Integer> primeFactors = primeFactorize(n);
        int[] count = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++) {
            count[i] = 1;
        }

        for (int i = 0; i < primeFactors.size(); i++) {
            for (int j = i + 1; j < primeFactors.size(); j++) {
                if (primeFactors.get(i) == primeFactors.get(j)) {
                    count[i]++;
                    count[j] = 0;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < primeFactors.size(); i++) {
            if (count[i] > 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }

    public static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}