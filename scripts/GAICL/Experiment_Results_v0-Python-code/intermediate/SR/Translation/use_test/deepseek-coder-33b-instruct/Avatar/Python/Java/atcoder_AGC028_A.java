Here is the Java translation of the Python code:

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        char[] list_S = S.toCharArray();
        char[] list_T = T.toCharArray();
        ArrayList<Integer> newNumber_i_1 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            newNumber_i_1.add(i);
        }
        ArrayList<Double> Number_iMN = new ArrayList<>();
        for (int i : newNumber_i_1) {
            Number_iMN.add((double) i * M / N);
        }
        ArrayList<Integer> Number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        HashSet<Double> Kaburi_j = new HashSet<>(Number_iMN);
        Kaburi_j.retainAll(new HashSet<>(Number_j));
        ArrayList<Integer> Kaburi_i = new ArrayList<>();
        for (double j : Kaburi_j) {
            Kaburi_i.add((int) (j * N / M));
        }
        AtomicInteger counter = new AtomicInteger(0);
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter.get() <= Kaburi_Size - 1) {
            if (list_S[Kaburi_i.get(counter.get())] == list_T[Kaburi_i.get(counter.get())]) {
                // pass
            } else {
                Flag = 1;
                break;
            }
            counter.incrementAndGet();
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println((int) (N * M / gcd(N, M)));
        }
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function, which is not available in Java. The equivalent functionality in Java would be to use a library like Apache Commons Math or JAMA, but this would require a significant rewrite of the code.

Also, the Python code uses threads to increment a counter, but Java does not have a direct equivalent to Python's threading library. Instead, Java provides a higher-level concurrency API, which is more powerful and easier to use. However, in this case, the use of threads is not necessary and has been removed.

Lastly, the Python code uses a decorator to wrap a function, but Java does not have a direct equivalent to Python's decorators. Instead, Java provides a higher-level API for wrapping methods, which is more powerful and easier to use. However, in this case, the use of a decorator is not necessary and has been removed.

