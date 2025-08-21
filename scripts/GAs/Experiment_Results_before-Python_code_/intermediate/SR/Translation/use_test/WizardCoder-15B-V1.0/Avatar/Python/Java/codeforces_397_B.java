```java
import java.util.*;

public class CodeforcesTask397B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] >= k * m) {
                    count++;
                }
            }
            if (count >= n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```

Explanation:

We first read the number of test cases, then for each test case, we read the value of n, k, and m. We then read the array of n integers.

We then iterate through the array and check if the current element is greater than or equal to k * m. If it is, we increment the count.

Finally, we check if the count is greater than or equal to n. If it is, we print "Yes", otherwise we print "No".
