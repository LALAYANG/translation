```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int a = arr[n - 1];
        int b = arr[0];
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == a) {
                maxCount++;
            }
        }
        int minCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == b) {
                minCount++;
            }
        }
        if (maxCount * minCount == 0) {
            System.out.println(0);
        } else {
            System.out.println(a - b);
        }
    }
}
```
