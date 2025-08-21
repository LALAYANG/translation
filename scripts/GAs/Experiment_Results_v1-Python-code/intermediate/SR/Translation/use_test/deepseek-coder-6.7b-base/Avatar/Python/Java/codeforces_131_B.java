```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int c = 0;
        int condition_a = 259;
        int condition_b = 477;
        int condition_c = 611;
        int condition_d = 635;
        int outer_loop_limit = 332;
        int inner_loop_limit = 331;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int element : arr) {
                if ((condition_c & condition_d) != 0) {
                    if ((condition_a & condition_b) != 0) {
                        if (element == 0) {
                            c += arr[element] * (arr[element] - 1);
                        } else if (-element in arr) {
                            c += arr[element] * arr[-element];
                        }
                    }
                }
            }
        }
        System.out.println(c / 2);
    }
}
```

