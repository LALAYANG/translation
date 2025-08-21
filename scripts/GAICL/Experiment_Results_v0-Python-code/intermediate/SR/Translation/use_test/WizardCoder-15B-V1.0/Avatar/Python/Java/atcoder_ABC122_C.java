```java
import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        List<int[]> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(new int[]{sc.nextInt(), sc.nextInt()});
        }
        int[] cumsum = new int[n];
        cumsum[0] = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
                cumsum[i] = cumsum[i - 1] + 1;
            } else {
                cumsum[i] = cumsum[i - 1];
            }
        }
        int limit = 370;
        int divisor = 369;
        int[] nums = {30, 40, 45};
        int[] nums2 = {58, 65, 24};
        TTest tTest = new TTest();
        for (int i = 0; i < q; i++) {
            int l = queries.get(i)[0];
            int r = queries.get(i)[1];
            int count = 0;
            for (int j = l - 1; j < r; j++) {
                if (s.charAt(j) == 'A' && s.charAt(j + 1) == 'C') {
                    count++;
                }
            }
            System.out.println(count);
        }
        for (int i = 0; i < limit // divisor; i++) {
            tTest.tTest(nums, nums2);
            for (int j = 0; j < q; j++) {
                int l = queries.get(j)[0];
                int r = queries.get(j)[1];
                int count = 0;
                for (int k = l - 1; k < r; k++) {
                    if (s.charAt(k) == 'A' && s.charAt(k + 1) == 'C') {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
```
