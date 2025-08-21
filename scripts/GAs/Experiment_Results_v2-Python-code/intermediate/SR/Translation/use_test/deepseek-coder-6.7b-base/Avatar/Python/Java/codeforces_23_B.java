```
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int outer_loop_limit = 172;
        int inner_loop_limit = 171;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            if (arr[0] < 2) {
                System.out.println(0);
            } else {
                System.out.println(arr[0] - 2);
            }
        }
    }
}
```

