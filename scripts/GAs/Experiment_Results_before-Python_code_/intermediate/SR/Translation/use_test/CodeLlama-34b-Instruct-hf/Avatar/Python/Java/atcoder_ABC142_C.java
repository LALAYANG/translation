```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] A_ = new int[N];
        for (int i = 0; i < N; i++) {
            A_[i] = A[i];
        }

        Arrays.sort(A_);

        for (int i = 0; i < N - 1; i++) {
            System.out.print(A_[i] + " ");
        }
        System.out.print(A_[N - 1]);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it can be optimized further by using Java's built-in sorting algorithms and data structures.
