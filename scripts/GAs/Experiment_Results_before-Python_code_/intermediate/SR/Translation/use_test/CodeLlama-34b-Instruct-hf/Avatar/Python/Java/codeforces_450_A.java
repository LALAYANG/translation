```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int[] l2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (l[i] % m == 0) {
                l2[i] = l[i] / m;
            } else {
                l2[i] = l[i] / m + 1;
            }
        }
        int mx = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] > mx) {
                mx = l2[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                System.out.println(i + 1);
            }
        }
    }
}
```
Test case:

Input:
50 5
3 9 10 8 3 3 4 6 8 2 9 9 3 1 2 10 6 8 7 2 7 4 2 7 5 10 2 2 2 5 10 5 6 6 8 7 10 4 3 2 10 8 6 6 8 6 4 4 1 3

Output:
46
