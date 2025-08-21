```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        Integer[][] A_ = new Integer[N][2];
        for (int i = 0; i < N; i++) {
            A_[i][0] = i + 1;
            A_[i][1] = scanner.nextInt();
        }
        Arrays.sort(A_, Comparator.comparingInt(o -> o[1]));
        for (int i = 0; i < N - 1; i++) {
            System.out.print(A_[i][0] + " ");
        }
        System.out.println(A_[N - 1][0]);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `N` and an array `A` of `N` integers. It creates a 2D array `A_` where each element is a pair of an index and a value from `A`. It sorts `A_` by the value part of each pair. It then prints the index part of each pair in `A_` (except the last one) separated by spaces, and the index part of the last pair.

