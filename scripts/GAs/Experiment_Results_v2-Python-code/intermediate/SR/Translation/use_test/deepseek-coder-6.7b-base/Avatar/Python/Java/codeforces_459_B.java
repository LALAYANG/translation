```
import java.util.Scanner;
import java.util.Arrays;

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
        int maxCount = count(arr, a);
        int bc = count(arr, b);
        System.out.println(a - b + " " + maxCount * bc);
    }

    public static int count(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
}
```

