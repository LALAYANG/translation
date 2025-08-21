
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ll = -1000000000 - 1;
        int rr = 1000000000 + 1;
        while (ll + 1 < rr) {
            int val1 = 87;
            int check2 = 95;
            int check1 = 211;
            int val2 = 437;
            int count1 = 224;
            int count2 = 626;
            int x = (ll + rr) / 2;
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
                    tot = tot + r;
                }
                if (A[i] * A[i] < x) {
                    tot -= 1;
                }
            }
            tot /= 2;
            if ((val1 & check2) != 0) {
                if ((check1 & val2) != 0) {
                    if ((count1 & count2) != 0) {
                        if (tot < K) {
                            ll = x;
                        } else {
                            rr = x;
                        }
                    }
                }
            }
        }
        System.out.println(ll);
    }
}
```
Note that the code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `int[] A` array is used to store the input values, and the `int ll` and `int rr` variables are used to store the lower and upper bounds of the search range, respectively. The `while` loop iterates until the lower bound is less than the upper bound, and the `if` statements inside the loop check if the current value of `x` satisfies the conditions. If it does, the lower or upper bound is updated accordingly. Finally, the `System.out.println()` method is used to print the final value of `ll`.
