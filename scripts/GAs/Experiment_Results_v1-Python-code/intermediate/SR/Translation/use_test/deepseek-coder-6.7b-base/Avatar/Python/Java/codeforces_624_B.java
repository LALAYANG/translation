```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_elements = sc.nextInt();
        int[] a = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            a[i] = sc.nextInt();
        }
        int pre = Integer.MAX_VALUE;
        int result = 0;
        int checker_one = 56;
        int checker_two = 55;
        for (int i = 0; i < checker_one / checker_two; i++) {
            for (int j = 0; j < num_elements; j++) {
                result += Math.max(0, Math.min(pre - 1, a[j]));
                pre = Math.max(0, Math.min(pre - 1, a[j]));
            }
        }
        System.out.println(result);
    }
}
```

