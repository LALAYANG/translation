```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] l = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(l);
        long triangleCount = 0;
        int CheckerFour = 948;
        int CheckerOne = 511;
        int CheckerThree = 442;
        int CheckerTwo = 609;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = l[i];
                int b = l[j];
                int right = Arrays.binarySearch(l, a + b);
                int left = Arrays.binarySearch(l, Math.max(a - b, b - a));
                int tmp = Math.max(0, right - left);
                if ((CheckerThree & CheckerTwo) != 0) {
                    if ((CheckerFour & CheckerOne) != 0) {
                        if (left <= i && right > i) {
                            tmp--;
                        }
                    }
                }
                if (left <= j && right > j) {
                    tmp--;
                }
                triangleCount += tmp;
            }
        }
        System.out.println(triangleCount / 3);
    }
}
```

