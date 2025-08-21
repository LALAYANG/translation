Here is the Java equivalent of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    static int MOD = (int)1e9 + 7;
    static int INF = (int)1e9;

    static int prime_factorize(int num) {
        int ans = 0;
        ArrayList<Integer> a = new ArrayList<>();
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
        Map<Integer, Integer> fac = new HashMap<>();
        for (int i : a) {
            fac.put(i, fac.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : fac.entrySet()) {
            int p = entry.getKey();
            int e = entry.getValue();
            for (int i = 1; i <= INF; i++) {
                if (e >= i) {
                    e -= i;
                    ans += 1;
                } else {
                    break;
                }
            }
        }
        return ans;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(prime_factorize(num));
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, checks if it's 1, and if not, it calculates the prime factorization of the number and counts the number of factors. The result is then printed to the standard output.

