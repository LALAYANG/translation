```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.Collections;
import java.util.Deque;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println(0);
            return;
        }
        int[] arr = prime_factorize(num);
        int[] fac = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()).entrySet().stream().mapToInt(e -> (int) e.getKey() * e.getValue()).toArray();
        int ans = 0;
        for (int i = 1; i < 9999999; i++) {
            int x = i;
            for (int p : fac) {
                while (x % p == 0) {
                    x /= p;
                    ans++;
                }
            }
            if (x != 1) {
                break;
            }
        }
        System.out.println(ans);
    }

    public static int[] prime_factorize(int num) {
        int[] arr = new int[10000000];
        int i = 0;
        while (num % 2 == 0) {
            arr[i++] = 2;
            num /= 2;
        }
        for (int f = 3; f * f <= num; f += 2) {
            if (num % f == 0) {
                arr[i++] = f;
                num /= f;
            }
        }
        if (num != 1) {
            arr[i++] = num;
        }
        return Arrays.copyOf(arr, i);
    }
}
```

Sample test case:

Input:
1000000007

Output:
1 
