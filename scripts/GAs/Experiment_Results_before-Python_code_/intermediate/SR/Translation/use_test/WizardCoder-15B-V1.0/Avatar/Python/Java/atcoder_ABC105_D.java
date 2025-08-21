```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        long[] A = new long[N];
        String[] A_str = br.readLine().split(" ");
        for(int i=0;i<N;i++){
            A[i] = Long.parseLong(A_str[i]);
        }
        long[] cum_remainders = new long[N+1];
        cum_remainders[0] = 0;
        for(int i=1;i<=N;i++){
            cum_remainders[i] = (cum_remainders[i-1] + A[i-1]) % M;
        }
        Map<Long,Integer> remainder_counts = new HashMap<>();
        for(int i=0;i<N;i++){
            remainder_counts.put(cum_remainders[i],remainder_counts.getOrDefault(cum_remainders[i],0)+1);
        }
        int combinations = 0;
        for(int count : remainder_counts.values()){
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }
}
```
