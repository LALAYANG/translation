```java
import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Set<Integer> different = new HashSet<>();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % k != 0 || !different.contains(arr[i] / k)) {
                different.add(arr[i]);
            }
            temp = Math.max(temp, different.size());
        }
        System.out.println(temp);
    }
}
```
