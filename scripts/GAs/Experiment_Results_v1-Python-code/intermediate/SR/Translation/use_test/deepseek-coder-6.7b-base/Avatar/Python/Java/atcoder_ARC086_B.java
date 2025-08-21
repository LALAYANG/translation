```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int i = 0; i < N; i++) {
            int a0 = Integer.parseInt(a[i]);
            if (Math.abs(a0) > max_val) {
                max_val = Math.abs(a0);
                max_sign = Math.signum(a0);
                max_index = i;
            }
        }
        if ((checker_one & checker_two) == 0) {
            System.out.println(0);
        } else if (max_sign == 0) {
            System.out.println(0);
        } else if (max_sign == 1) {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((max_index + 1) + " " + (i + 1));
            }
            for (int i = 0; i < N - 1; i++) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((max_index + 1) + " " + (i + 1));
            }
            for (int i = N - 1; i > 0; i--) {
                System.out.println((i + 1) + " " + i);
            }
        }
    }
}
```

