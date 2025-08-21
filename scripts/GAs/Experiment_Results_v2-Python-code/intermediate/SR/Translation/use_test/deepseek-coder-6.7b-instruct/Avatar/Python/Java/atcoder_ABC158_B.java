```java
import java.util.*;
import java.lang.*;
import org.apache.commons.math3.stat.inference.*;

class Main {
    private static int mod = 1000000007;
    private static Queue<Integer> inputQueue = new LinkedList<>();

    public static void main(String[] args) {
        new Thread(() -> {
            Scanner in = new Scanner(System.in);
            inputQueue.add(in.nextInt());
            inputQueue.add(in.nextInt());
            inputQueue.add(in.nextInt());
        }).start();

        int result_MI0 = inputQueue.remove();
        int N = result_MI0;
        int A = inputQueue.remove();
        int B = inputQueue.remove();

        int ans = 0;
        int rep = N / (A + B);
        ans += rep * A;
        int res = N - rep * (A + B);
        ans += Math.min(res, A);

        System.out.println(ans);
    }
}
```

Please note that the Apache Commons Math library is used for the T-test. You can download it from here: https://commons.apache.org/proper/commons-math/download_math.cgi

Also, the T-test is not used in the provided Python code, so it has been omitted in the Java version.

