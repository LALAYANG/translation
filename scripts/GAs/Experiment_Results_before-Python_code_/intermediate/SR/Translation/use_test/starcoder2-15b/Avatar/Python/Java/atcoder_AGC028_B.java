

```
import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    static long MOD = 1000000007;
    static long N;
    static long M = 1000000;
    static long[] A;
    static long[] fact;
    static long[] inv;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        A = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        int Nsq = 1000;
        fact = new long[Nsq * Nsq];
        fact[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m - 1] * fact[m] % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m] * fact[(n - 1) * Nsq + m] % MOD;
            }
        }
        inv = new long[Nsq];
        inv[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            inv[n] = inv[n - 1] * (MOD - MOD / n) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] * (inv[i] + inv[N - 1 - i] - 1) % MOD;
            ans %= MOD;
        }
        ans *= fact[(int) N];
        ans %= MOD;
        System.out.println(ans);
    }
}
```

## 2. 1000000007

```
import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    static long MOD = 1000000007;
    static long N;
    static long M = 1000000;
    static long[] A;
    static long[] fact;
    static long[] inv;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        A = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        int Nsq = 1000;
        fact = new long[Nsq * Nsq];
        fact[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m - 1] * fact[m] % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m] * fact[(n - 1) * Nsq + m] % MOD;
            }
        }
        inv = new long[Nsq];
        inv[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            inv[n] = inv[n - 1] * (MOD - MOD / n) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] * (inv[i] + inv[N - 1 - i] - 1) % MOD;
            ans %= MOD;
        }
        ans *= fact[(int) N];
        ans %= MOD;
        System.out.println(ans);
    }
}
```

## 3. 1000000009

```
import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    static long MOD = 1000000009;
    static long N;
    static long M = 1000000;
    static long[] A;
    static long[] fact;
    static long[] inv;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        A = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        int Nsq = 1000;
        fact = new long[Nsq * Nsq];
        fact[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m - 1] * fact[m] % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m] * fact[(n - 1) * Nsq + m] % MOD;
            }
        }
        inv = new long[Nsq];
        inv[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            inv[n] = inv[n - 1] * (MOD - MOD / n) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] * (inv[i] + inv[N - 1 - i] - 1) % MOD;
            ans %= MOD;
        }
        ans *= fact[(int) N];
        ans %= MOD;
        System.out.println(ans);
    }
}
```

## 4. 1000000021

```
import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    static long MOD = 1000000021;
    static long N;
    static long M = 1000000;
    static long[] A;
    static long[] fact;
    static long[] inv;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        A = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        int Nsq = 1000;
        fact = new long[Nsq * Nsq];
        fact[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m - 1] * fact[m] % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m] * fact[(n - 1) * Nsq + m] % MOD;
            }
        }
        inv = new long[Nsq];
        inv[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            inv[n] = inv[n - 1] * (MOD - MOD / n) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] * (inv[i] + inv[N - 1 - i] - 1) % MOD;
            ans %= MOD;
        }
        ans *= fact[(int) N];
        ans %= MOD;
        System.out.println(ans);
    }
}
```

## 5. 100000000003

```
import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    static long MOD = 100000000003L;
    static long N;
    static long M = 1000000;
    static long[] A;
    static long[] fact;
    static long[] inv;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        A = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        int Nsq = 1000;
        fact = new long[Nsq * Nsq];
        fact[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m - 1] * fact[m] % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m] * fact[(n - 1) * Nsq + m] % MOD;
            }
        }
        inv = new long[Nsq];
        inv[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            inv[n] = inv[n - 1] * (MOD - MOD / n) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] * (inv[i] + inv[N - 1 - i] - 1) % MOD;
            ans %= MOD;
        }
        ans *= fact[(int) N];
        ans %= MOD;
        System.out.println(ans);
    }
}
```

## 6. 100000000033

```
import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    static long MOD = 100000000033L;
    static long N;
    static long M = 1000000;
    static long[] A;
    static long[] fact;
    static long[] inv;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        A = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        int Nsq = 1000;
        fact = new long[Nsq * Nsq];
        fact[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m - 1] * fact[m] % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m] * fact[(n - 1) * Nsq + m] % MOD;
            }
        }
        inv = new long[Nsq];
        inv[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            inv[n] = inv[n - 1] * (MOD - MOD / n) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] * (inv[i] + inv[N - 1 - i] - 1) % MOD;
            ans %= MOD;
        }
        ans *= fact[(int) N];
        ans %= MOD;
        System.out.println(ans);
    }
}
```

## 7. 1000000000039

```
import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    static long MOD = 1000000000039L;
    static long N;
    static long M = 1000000;
    static long[] A;
    static long[] fact;
    static long[] inv;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        A = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        int Nsq = 1000;
        fact = new long[Nsq * Nsq];
        fact[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                fact[n * Nsq + m] = fact[n * Nsq + m - 1] * fact[m] % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int m = 
