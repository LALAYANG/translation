```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        
        int minA = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            minA = Math.min(minA, A[i]);
        }
        
        int result = (int) Math.ceil((double) N / minA) + 4;
        System.out.println(result);
    }
}
```
