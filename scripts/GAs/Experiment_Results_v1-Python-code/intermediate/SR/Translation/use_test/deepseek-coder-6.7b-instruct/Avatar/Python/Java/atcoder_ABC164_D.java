Here is the Java version of your Python code:

```java
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    static BigInteger moduloNumber = BigInteger.valueOf(2019);
    static BigInteger[] m = new BigInteger[2019];
    static BigInteger a = BigInteger.ZERO;
    static BigInteger r = BigInteger.ZERO;
    static String s = "13244641326483197256317565311366971954392678384137695865415614193571778739144964218776718615181998811427433732897767221417338833847143349157683911568871193229185748194833513991672463181883727172422629477419119934179331332541992753682422597624116496333313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428";

    public static void main(String[] args) {
        Arrays.fill(m, BigInteger.ZERO);
        BigInteger outerLoopCounter = BigInteger.valueOf(325);
        BigInteger innerLoopCounter = BigInteger.valueOf(324);
        recursiveLoop(BigInteger.ZERO, outerLoopCounter.divide(innerLoopCounter), BigInteger.ONE);
        System.out.println(r);
    }

    static void recursiveLoop(BigInteger loopIndexOut, BigInteger stop, BigInteger step) {
        if (step.compareTo(BigInteger.ZERO) == 0 || (step.compareTo(BigInteger.ZERO) > 0 && loopIndexOut.compareTo(stop) >= 0) || (step.compareTo(BigInteger.ZERO) < 0 && loopIndexOut.compareTo(stop) <= 0)) {
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            a = a.add(BigInteger.valueOf(Long.parseLong(String.valueOf(s.charAt(i)))).multiply(BigInteger.TEN.modPow(BigInteger.valueOf(i), moduloNumber)));
            r = r.add(m[a.mod(moduloNumber).intValue()]);
            m[a.mod(moduloNumber).intValue()] = m[a.mod(moduloNumber).intValue()].add(BigInteger.ONE);
        }
        recursiveLoop(loopIndexOut.add(step), stop, step);
    }
}
```

Please note that the `pow` function in Java is not the same as the `pow` function in Python. In Java, `pow(a, b, modulo)` is equivalent to `a**b % modulo` in Python. Also, Java does not have built-in support for BigIntegers, so you have to use the BigInteger class to handle large numbers.

