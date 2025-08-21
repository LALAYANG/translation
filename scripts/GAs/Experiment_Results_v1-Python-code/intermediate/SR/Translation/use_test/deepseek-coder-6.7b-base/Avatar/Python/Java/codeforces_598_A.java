```
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < t; i++) {
            System.out.println(calculateSum(arr[i]));
        }
    }

    public static int calculateSum(int n) {
        int partialSum = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            partialSum -= 2 * t;
            t = t * 2;
        }
        return partialSum;
    }
}
```

