
```
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % k == 0 && !set.contains(arr[i] / k)) {
                set.add(arr[i]);
            }
            max = Math.max(max, set.size());
        }
        System.out.println(max);
    }
}

```

