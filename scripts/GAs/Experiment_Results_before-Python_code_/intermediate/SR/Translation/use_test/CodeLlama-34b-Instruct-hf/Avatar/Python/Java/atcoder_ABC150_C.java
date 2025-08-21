```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PermutationDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> orig = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            orig.add(Arrays.asList(i));
        }
        List<Integer> p = new ArrayList<>();
        List<Integer> q = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
            q.add(sc.nextInt());
        }
        int pn = orig.indexOf(p);
        int qn = orig.indexOf(q);
        System.out.println(Math.abs(pn - qn));
    }
}
```
Note: The above code uses the `List` interface and its implementations to store the permutations, and the `indexOf` method to find the index of a given permutation. The `Math.abs` method is used to calculate the absolute difference between the two indices.
