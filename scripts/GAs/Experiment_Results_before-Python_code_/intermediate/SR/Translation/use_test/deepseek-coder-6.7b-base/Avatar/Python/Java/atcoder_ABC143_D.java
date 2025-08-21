
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = arr[i];
                int b = arr[j];
                int right = bisect_left(arr, a + b);
                int left = bisect_right(arr, Math.max(a - b, b - a));
                long tmp = Math.max(0, right - left);
                if (left <= i && i < right) {
                    tmp--;
                }
                if (left <= j && j < right) {
                    tmp--;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }

    public static int bisect_left(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static int bisect_right(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

```

### Explanation:

```

```

### Complexity:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```
