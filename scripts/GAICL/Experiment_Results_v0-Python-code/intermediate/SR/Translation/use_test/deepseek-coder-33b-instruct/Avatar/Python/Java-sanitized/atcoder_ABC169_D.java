import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num == 1) {
            System.out.println(0);
            System.exit(0);
        }
        List<Integer> factors = primeFactorize(num);
        Map<Integer, Integer> factorCount = new HashMap<>();
        for (int factor : factors) {
            factorCount.put(factor, factorCount.getOrDefault(factor, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : factorCount.entrySet()) {
            int x = entry.getValue();
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

    public static List<Integer> primeFactorize(int num) {
        List<Integer> factors = new ArrayList<>();
        while (num % 2 == 0) {
            factors.add(2);
            num /= 2;
        }
        int factor = 3;
        while (factor * factor <= num) {
            if (num % factor == 0) {
                factors.add(factor);
                num /= factor;
            } else {
                factor += 2;
            }
        }
        if (num != 1) {
            factors.add(num);
        }
        return factors;
    }
}