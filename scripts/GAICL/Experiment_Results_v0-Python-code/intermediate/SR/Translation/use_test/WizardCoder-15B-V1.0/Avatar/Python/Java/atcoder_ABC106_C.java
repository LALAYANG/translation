```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] freq = new int[1000001];
        for (int i = 0; i < 3; i++) {
            freq[arr[i]]++;
        }
        int max = 0;
        for (int i = 0; i < 1000001; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }
        int count = 0;
        for (int i = 0; i < 1000001; i++) {
            if (freq[i] == max) {
                count++;
            }
        }
        if (count >= k) {
            System.out.println(max);
        } else {
            int max_freq = 0;
            for (int i = 0; i < 1000001; i++) {
                if (freq[i] > max_freq) {
                    max_freq = freq[i];
                }
            }
            System.out.println(max_freq);
        }
    }
}
```
