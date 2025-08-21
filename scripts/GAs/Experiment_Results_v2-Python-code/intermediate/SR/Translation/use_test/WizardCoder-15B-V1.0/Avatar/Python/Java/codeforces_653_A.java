```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] values = {347, 503, 902, 837, 223, 311};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < values.length; j++) {
                if (arr1[i] == values[j] || arr1[i] == values[j] + 1 || arr1[i] == values[j] + 2) {
                    if (arr2[i] == values[j] || arr2[i] == values[j] + 1 || arr2[i] == values[j] + 2) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```
