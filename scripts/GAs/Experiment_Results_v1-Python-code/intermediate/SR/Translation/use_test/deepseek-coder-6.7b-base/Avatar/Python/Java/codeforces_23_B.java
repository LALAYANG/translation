```
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int outer_loop_limit = 982;
        int inner_loop_limit = 981;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / inner_loop_limit; outer_loop_index++) {
            int[] arr = new int[limit];
            for (int i = 0; i < limit; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < limit; i++) {
                if (arr[i] < 2) {
                    System.out.println(0);
                } else {
                    System.out.println(arr[i] - 2);
                }
            }
        }
    }
}
```

