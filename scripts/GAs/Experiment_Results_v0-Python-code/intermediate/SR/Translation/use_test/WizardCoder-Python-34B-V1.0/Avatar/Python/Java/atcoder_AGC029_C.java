```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(A[0]);
        for (int i = 1; i < N; i++) {
            if (A[i] <= dp.get(dp.size() - 1)) {
                dp.set(dp.size() - 1, A[i]);
            } else {
                dp.add(A[i]);
            }
        }
        int K = 2;
        int x = 0;
        int y = N;
        while (x != y) {
            int mid = (x + y) / 2;
            boolean isPossible = true;
            int j = 0;
            int count = 0;
            while (j < dp.size() && dp.get(j) <= mid) {
                count += 1;
                if (count >= K) {
                    isPossible = false;
                    break;
                }
                j++;
            }
            if (isPossible) {
                x = mid + 1;
            } else {
                y = mid;
            }
        }
        System.out.println(x);
    }
}
```

Test input:
3
3 2 1

Expected output:
2 
