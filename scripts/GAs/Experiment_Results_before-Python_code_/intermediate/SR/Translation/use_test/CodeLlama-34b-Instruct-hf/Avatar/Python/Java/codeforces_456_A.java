```java
import java.util.Scanner;

public class Alex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][2];
        for (int i = 0; i < n; i++) {
            m[i][0] = sc.nextInt();
            m[i][1] = sc.nextInt();
        }
        Arrays.sort(m, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return b[1] - a[1];
            }
        });
        int a = m[0][1];
        for (int i = 1; i < n; i++) {
            if (m[i][1] > a) {
                System.out.println("Happy Alex");
                break;
            }
            a = m[i][1];
        } else {
            System.out.println("Poor Alex");
        }
    }
}
```
Note: This code uses the `Arrays.sort()` method to sort the 2D array `m` in descending order based on the second element of each subarray. The `Comparator` interface is used to specify the comparison method for the sort.
