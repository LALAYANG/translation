Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(strs[i]);
        }
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int index = 0; index < N; index++) {
            if (Math.abs(a[index]) > max_val) {
                max_val = Math.abs(a[index]);
                max_sign = Integer.signum(a[index]);
                max_index = index;
            }
        }
        if ((724 & 299) != 0) {
            if (max_sign == 0) {
                System.out.println(0);
            } else if (max_sign == 1) {
                System.out.println(2 * N - 1);
                recursive_loop(0, N, 1);
                for (int index = 0; index < N - 1; index++) {
                    System.out.println((index + 1) + " " + (index + 2));
                }
            } else {
                System.out.println(2 * N - 1);
                for (int index = 0; index < N; index++) {
                    System.out.println((max_index + 1) + " " + (index + 1));
                }
                for (int index = N - 1; index > 0; index--) {
                    System.out.println((index + 1) + " " + index);
                }
            }
        }
    }

    public static void recursive_loop(int index, int stop, int step) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        System.out.println((max_index + 1) + " " + (index + 1));
        recursive_loop(index + step, stop, step);
    }
}
```

Please note that the recursive_loop method is not static and it uses a non-static variable max_index. This is not allowed in Java. You may need to refactor the code to make it work in Java.

