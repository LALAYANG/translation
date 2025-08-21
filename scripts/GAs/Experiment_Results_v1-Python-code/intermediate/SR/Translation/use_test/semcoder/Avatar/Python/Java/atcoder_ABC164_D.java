Thought process:
1. Understand the given code snippet and the problem it aims to solve.
2. Translate the Python code to Java code while maintaining the logic and functionality.
3. Ensure the Java code is correct and free from syntax errors.

```java
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        String s = "13244641326483197256317565311366971954392678384137695865415614193571778739144964218776718615181998811427433732897767221417338833847143349157683911568871193229185748194833513991672463181883727172422629477419119934179331332541992753682422597624116496333313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428";
        int moduloNumber = 2019;
        int[] m = new int[moduloNumber + 1];
        int a = 0;
        int r = 0;

        for (int i = 1; i < s.length(); i++) {
            a = (a * 10 + Integer.parseInt(String.valueOf(s.charAt(i)))) % moduloNumber;
            r += m[a];
            m[a]++;
        }

        System.out.println(r);
    }
}
```

This Java code snippet translates the given Python code snippet to Java, ensuring the correct functionality and output.
