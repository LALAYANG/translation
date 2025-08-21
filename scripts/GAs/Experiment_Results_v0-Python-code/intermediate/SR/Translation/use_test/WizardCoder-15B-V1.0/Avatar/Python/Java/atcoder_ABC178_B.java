```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Math.max(arr[0] * arr[2], arr[1] * arr[3]);
        max = Math.max(max, arr[0] * arr[3]);
        max = Math.max(max, arr[1] * arr[2]);
        max = Math.max(max, arr[0] * arr[1] * arr[3]);
        max = Math.max(max, arr[0] * arr[2] * arr[3]);
        max = Math.max(max, arr[1] * arr[2] * arr[3]);
        System.out.println(max);
    }
}
```
