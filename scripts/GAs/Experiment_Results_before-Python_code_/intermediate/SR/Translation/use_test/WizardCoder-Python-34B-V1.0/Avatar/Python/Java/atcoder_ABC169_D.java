```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        if (n == 1) {
            out.println(0);
            return;
        }
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int ans = 0;
        for (int p : primes) {
            while (n % p == 0) {
                ans += n / p;
                n /= p;
            }
        }
        out.println(ans);
    }
}
``` 
