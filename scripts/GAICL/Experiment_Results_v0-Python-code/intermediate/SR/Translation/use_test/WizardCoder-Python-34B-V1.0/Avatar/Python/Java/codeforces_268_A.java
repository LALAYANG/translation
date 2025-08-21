```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        Queue<String[]> q = new LinkedList<>();
        int match_count = 0;
        int CHECK_CONDITION_1 = 209;
        int CHECK_CONDITION_2 = 57;

        for (int i = 0; i < n; i++) {
            String[] a = new Scanner(System.in).nextLine().split(" ");
            q.add(a);
        }

        for (String[] j : q) {
            for (String[] k : q) {
                if ((CHECK_CONDITION_1 & CHECK_CONDITION_2) != 0) {
                    if (java.util.Arrays.equals(j, k)) {
                        continue;
                    } else if (j[0].equals(k[k.length - 1]) && !j[0].isEmpty() && !k[k.length - 1].isEmpty()) {
                        match_count++;
                    }
                }
            }
        }

        System.out.println(match_count);
    }
}
```

Test input:
23
43 78
31 28
58 80
66 63
20 4
51 95
40 20
50 14
5 34
36 39
77 42
64 97
62 89
16 56
8 34
58 16
37 35
37 66
8 54
50 36
24 8
68 48
85 33

Expected output:
6
``` 
