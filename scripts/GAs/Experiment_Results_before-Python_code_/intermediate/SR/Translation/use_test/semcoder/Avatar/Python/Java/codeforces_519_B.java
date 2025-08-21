```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n-1];
        int[] c = new int[n-2];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n-1; i++) {
            b[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n-2; i++) {
            c[i] = sc.nextInt();
        }
        
        int x = 0, y = 0, z = 0;
        for (int i : a) {
            x += i;
        }
        for (int i : b) {
            y += i;
        }
        for (int i : c) {
            z += i;
        }
        
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}
```
