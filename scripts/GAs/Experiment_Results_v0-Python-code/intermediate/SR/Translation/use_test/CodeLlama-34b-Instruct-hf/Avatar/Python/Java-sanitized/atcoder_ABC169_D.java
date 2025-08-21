import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num == 1) {
            System.out.println(0);
            return;
        }

        List<Integer> primeFactors = primeFactorize(num);
        Counter<Integer> fac = new Counter<Integer>(primeFactors);
        int ans = 0;
        for (int p : fac.keySet()) {
            int x = fac.get(p);
            for (int i = 1; i < 99999999; i++) {
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

    public static List<Integer> primeFactorize(int num) {
        List<Integer> factors = new ArrayList<Integer>();
        while (num % 2 == 0) {
            factors.add(2);
            num /= 2;
        }
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        if (num > 2) {
            factors.add(num);
        }
        return factors;
    }
}

class Counter<T> {
    private T key;
    private int value;

    public Counter(T key, int value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}