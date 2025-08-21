```java
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 55, 1};
        int[] arr2 = {52, 53, 71};
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 1, 1, 1, 1};
        int n = 3, m = 5;
        int[] arr5 = new int[n];
        int[] arr6 = new int[m];
        for (int i = 0; i < n; i++) {
            arr5[i] = arr3[i];
        }
        for (int i = 0; i < m; i++) {
            arr6[i] = arr4[i];
        }
        int[] arr7 = new int[n];
        int[] arr8 = new int[m];
        for (int i = 0; i < n; i++) {
            arr7[i] = arr5[i];
        }
        for (int i = 0; i < m; i++) {
            arr8[i] = arr6[i];
        }
        Arrays.sort(arr7);
        Arrays.sort(arr8);
        int index = 0, j = 0;
        while (index < n && j < m) {
            if (arr7[index] <= arr8[j]) {
                index++;
            }
            j++;
        }
        System.out.println(n - index);
    }
}
```
