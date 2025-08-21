```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int l = 2019;
        BigInteger[] m = new BigInteger[l + 1];
        int a = 0;
        int r = 0;
        for (int i = 0; i < l; i++) {
            m[i] = BigInteger.ZERO;
        }
        m[0] = BigInteger.ONE;
        for (int i = input.length() - 1; i >= 0; i--) {
            a += Integer.parseInt(input.substring(i, i + 1)) * BigInteger.valueOf(Math.pow(10, i)).modPow(l, l);
            r += m[a.mod(l).intValue()].intValue();
            m[a.mod(l).intValue()] = m[a.mod(l).intValue()].add(BigInteger.ONE);
        }
        System.out.println(r);
    }
}
```

Test input:
1324464132648319725631756531136697195439267838413769586541561419357177873914496421877671861518199881142743373289776722141733883384714334915768391156887119322918574819483351399167246318188372717242262947741911993417933133254199275368242259762411649633313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428
Expected output:
400340256 
