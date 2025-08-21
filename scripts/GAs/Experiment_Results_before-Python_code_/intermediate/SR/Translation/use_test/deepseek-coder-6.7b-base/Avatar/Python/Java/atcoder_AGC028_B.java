
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int MOD = 1000000007;
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        long[] fact = new long[N + 1];
        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        long[] inv = new long[N + 1];
        inv[0] = 1;
        for (int i = 1; i <= N; i++) {
            inv[i] = (MOD - MOD / i) * inv[MOD % i] % MOD;
        }
        long[] invFact = new long[N + 1];
        invFact[0] = 1;
        for (int i = 1; i <= N; i++) {
            invFact[i] = (invFact[i - 1] * inv[i]) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += (A[i] * (invFact[i] * invFact[N - i - 1] % MOD)) % MOD;
            ans %= MOD;
        }
        ans = (ans * fact[N]) % MOD;
        System.out.println(ans);
    }
}

```

### Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:


