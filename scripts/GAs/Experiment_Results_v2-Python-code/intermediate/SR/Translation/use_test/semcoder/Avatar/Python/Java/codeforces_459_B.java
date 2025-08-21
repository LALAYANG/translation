```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = scanner.nextInt();
        }
        Arrays.sort(NewList);
        int a = NewList[n - 1];
        int b = NewList[0];
        if (a == b) {
            System.out.println(a - b + " " + n * (n - 1) / 2);
        } else {
            int MaxCount = Arrays.stream(NewList).filter(x -> x == a).count();
            long bc = Arrays.stream(NewList).filter(x -> x == b).count();
            System.out.println(a - b + " " + MaxCount * bc);
        }
    }
}
```
