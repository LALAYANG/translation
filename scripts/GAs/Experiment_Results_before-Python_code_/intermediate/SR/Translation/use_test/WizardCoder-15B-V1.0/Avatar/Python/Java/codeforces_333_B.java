
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] b = new boolean[n * 2];
        Arrays.fill(b, true);
        b[0] = b[n-1] = b[n] = b[2*n-1] = false;
        for(int i=0;i<m;i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            b[r-1] = b[n+c-1] = false;
        }
        if(n%2==1 && b[n/2] && b[n+n/2]){
            b[n/2] = false;
        }
        int count = 0;
        for(boolean x:b){
            if(x) count++;
        }
        System.out.println(count);
    }
}
```
