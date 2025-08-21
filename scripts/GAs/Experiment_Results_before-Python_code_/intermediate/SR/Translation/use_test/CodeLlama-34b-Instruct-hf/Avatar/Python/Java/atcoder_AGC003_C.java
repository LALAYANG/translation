```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt() * N + i;
        }
        Arrays.sort(A);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int d = (A[i] % N) % 2;
            if (d % 2 != i % 2) {
                cnt++;
            }
        }
        System.out.println(cnt / 2);
    }
}
```
Note: The above code uses the `Arrays.sort()` method to sort the array `A` in ascending order. If you want to sort the array in descending order, you can use the `Arrays.sort()` method with the `Collections.reverseOrder()` comparator.
