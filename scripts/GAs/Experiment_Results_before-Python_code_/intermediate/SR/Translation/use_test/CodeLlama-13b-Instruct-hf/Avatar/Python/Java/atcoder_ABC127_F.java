
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        int sum_b = 0;
        int sum_p1 = 0;
        int sum_p2 = 0;

        for (int i = 0; i < q; i++) {
            int[] ql = new int[3];
            ql[0] = sc.nextInt();
            ql[1] = sc.nextInt();
            ql[2] = sc.nextInt();

            if (ql[0] == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.get(0) + " " + (sum_p1 - p1.size() * -p2.get(0) + p2.size() * -p2.get(0) - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.get(0) + " " + (sum_p1 - p1.size() * p1.get(0) + p2.size() * p1.get(0) - sum_p2 + sum_b));
                }
            } else {
                sum_b += ql[2];
                if (p1.size() == 0) {
                    p1.add(ql[1]);
                    sum_p1 += ql[1];
                } else if (p1.get(0) <= ql[1]) {
                    p1.add(ql[1]);
                    sum_p1 += ql[1];
                } else {
                    p2.add(-ql[1]);
                    sum_p2 += ql[1];
                }

                if (p1.size() < p2.size()) {
                    int k = p2.remove(0);
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }

                if (p1.size() - 1 > p2.size()) {
                    int k = p1.remove(0);
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}
```
Note that the Java code uses the `ArrayList` class to store the values of `p1` and `p2`, and the `Collections.sort()` method to sort the arrays. The `Scanner` class is used to read input from the user.
