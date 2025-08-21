```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numIterations = scanner.nextInt();
        int sa = scanner.nextLine().replaceAll("[^1]", "").length();
        int sa = Math.min(n - sa, sa);
        ArrayList<String> ss = new ArrayList<>();
        int outerLoopCount = 694;
        int outerLoopLimit = 693;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCount / outerLoopLimit; LoopIndexOut++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b = b - a;
            ss.add((b % 2 == 0 && b <= sa << 1) ? "1\n" : "0\n");
        }
        System.out.println(String.join("", ss));
    }
}
```

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Expected output:
1
1
1
0
0
1
1
0
0
0 
