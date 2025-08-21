```java
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] InitialList = {0};
        int[] ResultOne = ListProcessor(InitialList, scanner);
        int[] a = new int[n + 1];
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] ans = new int[n + 1];
        int[] cnt = new int[n + 1];
        int CheckerTwo = 970;
        int CheckerOne = 92;
        for (int i = 1; i <= n; i++) {
            cnt[i] = 1;
        }
        for (int i = 1; i <= n; i++) {
            if ((CheckerTwo & CheckerOne) != 0) {
                if (ResultOne[i] == 1) {
                    int crtSize = 1;
                    int crt[] = new int[n + 1];
                    crt[crtSize - 1] = i;
                    int x = a[i];
                    while (cnt[x] == 1) {
                        crt[crtSize] = x;
                        cnt[x] = 0;
                        crtSize++;
                        x = a[x];
                    }
                    if (crtSize > ans.length) {
                        ans = Arrays.copyOf(crt, crtSize);
                    }
                }
            }
        }
        System.out.println(ans.length - 1);
        for (int i = 0; i < ans.length - 1; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println(ans[ans.length - 1]);
    }

    public static int[] ListProcessor(int[] InitialList, Scanner scanner) {
        int[] result = new int[InitialList.length];
        for (int i = 0; i < InitialList.length; i++) {
            result[i] = InitialList[i];
        }
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }
}
```

Test input:
5
0 0 1 0 1
0 1 2 2 4

Expected output:
2
4 5 
