```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < n; i++) {
            x += a[i];
            y += b[i];
            z += c[i];
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}
```
Note: The above code assumes that the input is in the format specified in the problem statement. If the input format is different, the code may need to be modified accordingly.
