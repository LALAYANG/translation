```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        int addend = 7;
        int base = 10;
        int exponent = 9;
        BigInteger mod = BigInteger.valueOf(base).modPow(BigInteger.valueOf(exponent), BigInteger.valueOf(Long.MAX_VALUE)).add(BigInteger.valueOf(addend));
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Integer[] c = new Integer[count];
        for (int i = 0; i < count; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c, Collections.reverseOrder());
        BigInteger b = BigInteger.valueOf(2).modPow(BigInteger.valueOf(2 * count - 2), mod);
        BigInteger a = b.multiply(BigInteger.valueOf(2)).mod(mod);
        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < count; i++) {
            ans = ans.add(BigInteger.valueOf(c[i]).multiply(a.add(b.multiply(BigInteger.valueOf(i)))).mod(mod));
        }
        System.out.println(ans.mod(mod));
    }
}
```

