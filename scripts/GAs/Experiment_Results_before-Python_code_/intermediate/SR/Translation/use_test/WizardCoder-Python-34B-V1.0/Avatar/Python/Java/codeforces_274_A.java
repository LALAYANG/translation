```java
import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        HashSet<Integer> different = new HashSet<>();
        int temp = 0;
        Arrays.sort(arr);
        for (int x : arr) {
            if (x % k != 0 || !different.contains(x / k)) {
                different.add(x / k);
            }
            temp = Math.max(different.size(), temp);
        }
        System.out.println(temp);
    }
}
```

Test input:
4 1000
1 100 1000000 100000000

Expected output:
2 
