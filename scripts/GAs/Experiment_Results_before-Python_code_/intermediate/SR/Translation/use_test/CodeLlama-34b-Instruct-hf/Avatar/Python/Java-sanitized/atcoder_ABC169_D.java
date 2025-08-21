import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }

        List<Integer> primeFactors = primeFactorize(n);
        Map<Integer, Integer> factorCount = new HashMap<>();
        for (int factor : primeFactors) {
            if (!factorCount.containsKey(factor)) {
                factorCount.put(factor, 1);
            } else {
                factorCount.put(factor, factorCount.get(factor) + 1);
            }
        }

        int ans = 0;
        for (int factor : factorCount.keySet()) {
            int count = factorCount.get(factor);
            for (int i = 1; i <= count; i++) {
                ans += i;
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