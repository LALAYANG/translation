Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        long ll = -1000000000000000000L;
        long rr = 1000000000000000000L;
        while (ll + 1 < rr) {
            long x = (ll + rr) / 2;
            int tot = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] < 0) {
                    int l = -1;
                    int r = N;
                    while (l + 1 < r) {
                        int c = (l + r) / 2;
                        if (A[i] * A[c] < x) {
                            r = c;
                        } else {
                            l = c;
                        }
                    }
                    tot += N - r;
                } else {
                    int l = -1;
                    int r = N;
                    while (l + 1 < r) {
                        int c = (l + r) / 2;
                        if (A[i] * A[c] < x) {
                            l = c;
                        } else {
                            r = c;
                        }
                    }
                    tot += r;
                }
                if (A[i] * A[i] < x) {
                    tot -= 1;
                }
            }
            tot /= 2;
            if (tot < K) {
                ll = x;
            } else {
                rr = x;
            }
        }
        System.out.println(ll);
    }
}
```

This Java code does the same thing as your Python code. It reads in two integers N and K, and an array of N integers. It then sorts the array and uses binary search to find the maximum value that can be the answer. The binary search is done by checking if the total number of pairs of integers in the array that multiply to less than the current mid value is less than K. If it is, the mid value is too small, so the lower bound is set to the mid value. If it is not, the mid value is too large, so the upper bound is set to the mid value. The process continues until the lower bound is one less than the upper bound, at which point the lower bound is the answer.

