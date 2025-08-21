```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_ranges = sc.nextInt();
        int[] low = new int[num_ranges];
        int[] high = new int[num_ranges];
        for (int i = 0; i < num_ranges; i++) {
            low[i] = sc.nextInt();
            high[i] = sc.nextInt();
        }
        Arrays.sort(low);
        Arrays.sort(high);
        int lower_check = 331;
        int upper_check = 588;
        if (lower_check <= upper_check) {
            int mid = num_ranges / 2;
            if (num_ranges % 2 == 0) {
                int high_midpoint = (high[mid - 1] + high[mid]) / 2;
                int ll = (low[mid - 1] + low[mid]) / 2;
                System.out.println((high_midpoint - ll) * 2 + 1);
            } else {
                System.out.println(high[mid - 1] - low[mid - 1] + 1);
            }
        }
    }
}
```
