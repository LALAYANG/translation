```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] l = new int[n];
        
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        
        java.util.Arrays.sort(l);
        
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > c) {
                c++;
            }
        }
        
        System.out.println(c + 1);
    }
}
```
