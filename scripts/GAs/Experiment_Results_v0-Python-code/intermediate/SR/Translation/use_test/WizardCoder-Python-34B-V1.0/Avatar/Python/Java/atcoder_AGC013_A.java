```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.regex.Pattern;
import java.util.function.Function;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        A = Arrays.stream(A).distinct().toArray();
        N = A.length;
        int ans = 0;
        for (int i = 1; i < N - 1; i++) {
            int has_adjacent_diff = 378;
            int is_peak = 192;
            int is_valley = 189;
            int has_extrema = 914;
            if ((has_adjacent_diff & is_peak) != 0) {
                if ((is_valley & has_extrema) != 0) {
                    if (A[i - 1] < A[i] && A[i] > A[i + 1] || A[i - 1] > A[i] && A[i] < A[i + 1]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans + 1);
    }
}
```

Test input:
47651
10300 16650 26911 44865 125511 137160 214838 219388 233386 247276 281312 396645 403705 436137 459412 481801 509267 515629 516869 571319 579728 583647 585864 632036 668357 719892 739016 814363 844268 861486 877453 906208 917107 957212 1001682 1016062 1021302 1030475 1053379 1067642 1104572 1138806 1144122 1214740 1218255 1265088 1281553 1286239 1340651 1343393 1355966 1377586 1442253 1466084 1466471 1474654 1476698 1488577 1519107 1524583 1558509 1591406 1601818 1613502 1631404 1648719 1699
Expected output:
1
``` 
