```java
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int moduloNumber = 2019;
        int[] m = new int[moduloNumber];
        Arrays.fill(m, 1);
        int a = 0;
        int r = 0;
        int outerLoopCounter = 325;
        int innerLoopCounter = 324;

        for (int i = s.length() - 1; i >= 0; i--) {
            a += Integer.parseInt(Character.toString(s.charAt(i)) * Math.pow(10, i % moduloNumber);
            r += m[a % moduloNumber];
            m[a % moduloNumber]++;
        }

        for (int i = 0; i < outerLoopCounter / innerLoopCounter; i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                a += Integer.parseInt(Character.toString(s.charAt(j)) * Math.pow(10, j % moduloNumber);
                r += m[a % moduloNumber];
                m[a % moduloNumber]++;
            }
        }

        System.out.println(r);
    }
}
```

Test input:
13244641326483197256317565311366971954392678384137695865415614193571778739144964218776718615181998811427433732897767221417338833847143349157683911568871193229185748194833513991672463181883727172422629477419119934179331332541992753682422597624116496333313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428
Expected output:
400340256
``` 
