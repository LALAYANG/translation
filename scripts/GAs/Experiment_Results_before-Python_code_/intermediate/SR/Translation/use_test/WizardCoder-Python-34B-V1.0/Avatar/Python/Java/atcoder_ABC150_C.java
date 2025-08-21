```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] orig = new int[n];
        for (int i = 0; i < n; i++) {
            orig[i] = i + 1;
        }
        int[] p = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] q = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int pn = Arrays.asList(orig).indexOf(Arrays.asList(p));
        int qn = Arrays.asList(orig).indexOf(Arrays.asList(q));
        System.out.println(Math.abs(pn - qn));
    }
}
```

Test input:
8
7 3 5 4 2 1 6 8
3 8 2 5 4 6 7 1

Expected output:
17517 
