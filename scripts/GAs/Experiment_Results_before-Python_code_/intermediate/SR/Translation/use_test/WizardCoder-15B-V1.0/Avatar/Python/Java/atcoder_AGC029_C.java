```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++) A[i] = sc.nextInt();
        A = new int[]{A[0]} + Arrays.stream(A).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int N = A.length;
        int[][] dp = new int[N][2];
        dp[0][0] = A[0];
        dp[0][1] = 0;
        for(int i=1;i<N;i++) {
            if(A[i] <= dp[i-1][0]) {
                dp[i] = dp[i-1];
            } else {
                dp[i][0] = A[i];
                dp[i][1] = 0;
            }
        }
        for(int i=1;i<N;i++) {
            for(int j=i-1;j>=0;j--) {
                if(dp[j][0] < A[i]) {
                    dp[i] = dp[j];
                    break;
                }
            }
        }
        int ans = 0;
        for(int i=0;i<N;i++) {
            if(dp[i][1] < ans) {
                ans = dp[i][1];
            }
        }
        System.out.println(ans);
    }
}
```
