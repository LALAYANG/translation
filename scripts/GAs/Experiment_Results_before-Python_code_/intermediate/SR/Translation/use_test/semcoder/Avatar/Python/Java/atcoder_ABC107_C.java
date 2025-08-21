Thought process:
1. Read the input values for N and K.
2. Split the input into positive and negative lists.
3. Implement the check function to calculate the minimum cost.
4. Print the result of the check function with K as the argument.

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lst.add(sc.nextInt());
        }
        List<Integer> lst_p = new ArrayList<>();
        List<Integer> lst_m = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (lst.get(i) == 0) {
                K--;
            } else if (lst.get(i) > 0) {
                lst_p.add(lst.get(i));
            } else {
                lst_m.add(lst.get(i));
            }
        }
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int lasty = lst_m.size();

        int check(int k) {
            int ans = Integer.MAX_VALUE;
            for (int j = 0; j <= k; j++) {
                if (j > lastx || k - j > lasty) {
                    continue;
                }
                if (j == 0) {
                    p = 0;
                } else {
                    p = lst_p.get(j - 1);
                }
                if (k - j == 0) {
                    m = 0;
                } else {
                    m = lst_m.get(lasty - (k - j));
                }
                ans = Math.min(ans, 2 * p + Math.abs(m), p + 2 * Math.abs(m));
            }
            return ans;
        }

        System.out.println(check(K));
    }
}
```
