```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] XY = new int[N*2];
        for(int i=0;i<N*2;i++){
            XY[i] = sc.nextInt();
        }
        double[] x = new double[N];
        double[] y = new double[N];
        for(int i=0;i<N;i++){
            x[i] = XY[i*2];
            y[i] = XY[i*2+1];
        }
        double[] d = new double[N];
        for(int i=0;i<N;i++){
            double dx = x[i]-x[0];
            double dy = y[i]-y[0];
            d[i] = Math.atan2(dy,dx);
        }
        Arrays.sort(d);
        double ans = 0;
        for(int i=0;i<N;i++){
            double a = d[i];
            double b = d[(i+1)%N];
            if(b-a>=Math.PI){
                ans += (b-a)-Math.PI;
            }
        }
        ans = ans/(2*Math.PI);
        System.out.println(ans);
    }
}
```
