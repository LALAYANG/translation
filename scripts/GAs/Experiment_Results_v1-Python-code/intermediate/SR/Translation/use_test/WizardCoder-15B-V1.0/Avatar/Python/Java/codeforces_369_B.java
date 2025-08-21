```java
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int[] nums = {50, 25, 1000, 1000, 50000, 25000};
        int n = nums.length;
        int k = nums[0];
        int l = nums[1];
        int r = nums[2];
        int s = nums[3];
        int t = nums[4];
        int u = nums[5];
        int[] ans = new int[n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{k, l, r, s, t, u});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int k = curr[0];
            int l = curr[1];
            int r = curr[2];
            int s = curr[3];
            int t = curr[4];
            int u = curr[5];
            if (k == 0) {
                ans[0] = r;
            } else {
                int[] left = {k - 1, l, r, s, t, u};
                int[] right = {k, l, r, s, t, u - k};
                queue.offer(left);
                queue.offer(right);
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
```
