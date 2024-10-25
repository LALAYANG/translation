<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
5 13 8 1000000000

Expected output:
1


```
N = int ( input ( ) )
A = list ( map ( int , input ( ).split ( ) ) )
import functools
import fractions
gcd = functools.reduce ( fractions.gcd , A )
print ( gcd )


```
[/INST]
```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        Map<Integer, Integer> gcdMap = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            int gcd = gcd(A.get(i), A.get((i + 1) % A.size()));
            gcdMap.put(gcd, gcdMap.getOrDefault(gcd, 0) + 1);
        }

        int maxGCD = gcdMap.keySet().stream().max(Integer::compareTo).get();
        System.out.println(maxGCD);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```
Note: The above code uses Java 8 features such as lambda expressions, method references, and the `stream()` API. If you are using an older version of Java, you may need to modify the code accordingly.</s>
