```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        
        int m = 0;
        for (int a = 0; a < n - 1; a++) {
            if (x[a] >= x[a + 1]) {
                int q = (int) Math.ceil((x[a] - x[a + 1]) / (double) d);
                m += q;
                x[a + 1] += q * d;
            }
        }
        
        System.out.println(m);
    }
}
```
