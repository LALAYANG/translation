```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger c = scanner.nextBigInteger();
        BigInteger d = scanner.nextBigInteger();
        BigInteger max = a.multiply(c);
        max = max.max(b.multiply(d));
        max = max.max(a.multiply(d));
        max = max.max(b.multiply(c));
        System.out.println(max);
    }
}
```

This Java code reads four BigIntegers from the standard input, calculates the maximum of the products of two pairs of these numbers, and prints the result. The BigInteger class is used to handle large integers.

