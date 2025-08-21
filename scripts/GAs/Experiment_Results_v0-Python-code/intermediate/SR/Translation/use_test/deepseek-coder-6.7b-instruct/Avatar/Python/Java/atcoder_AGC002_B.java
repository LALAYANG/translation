```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.text.*;
import java.math.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int[][] balls = new int[N][2];
        for(int i = 0; i < M; i++) {
            s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]) - 1;
            int y = Integer.parseInt(s[1]) - 1;
            if(balls[x][0] >= 1 && balls[y][1] >= 1) {
                balls[x][0]--;
                balls[y][1]++;
            }
            else if(balls[x][0] == 0) {
                balls[x][1]--;
                balls[y][1]++;
            }
            else {
                balls[x][0]--;
                balls[x][1]++;
            }
        }
        int ans = 0;
        int condition_a = 489;
        int condition_b = 420;
        for(int i = 0; i < N; i++) {
            if((condition_a & condition_b) != 0 && balls[i][1] != 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

Please note that the Java code provided above is a direct translation of the Python code you provided. However, the Python code uses some libraries that do not have direct equivalents in Java, such as `cryptography.fernet`, `dateutil.parser`, `scipy.stats`, `http.client`, and others. Therefore, the Java code may not work as expected without these libraries.

