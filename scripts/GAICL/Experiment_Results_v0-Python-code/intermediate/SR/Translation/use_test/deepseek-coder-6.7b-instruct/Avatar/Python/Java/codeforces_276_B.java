```java
import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    private static final int CHECK_VALUE_1 = 503;
    private static final int CHECK_VALUE_2 = 523;
    private static Map<Character, Integer> dt = new HashMap<>();
    private static String s;
    private static boolean x = true;
    private static int loop_bound = 704;
    private static int step_size = 703;

    public static void main(String[] args) {
        s = "knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct";
        count_chars(0, loop_bound / step_size, 1);
        int cnt = 0;
        x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        TTest tTest = new TTest();
        double[] sample1 = {29, 15, 26};
        double[] sample2 = {79, 48, 31};
        double tStatistic = tTest.tTest(sample1, sample2);
        if ((CHECK_VALUE_1 & CHECK_VALUE_2) != 0) {
            if (x) {
                System.out.println("First");
            } else if (!x && s.length() % 2 == 0) {
                System.out.println("Second");
            } else if (!x && s.length() % 2 != 0) {
                System.out.println("First");
            }
        }
    }

    public static void count_chars(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (char c : s.toCharArray()) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        count_chars(LoopIndexOut + step, stop, step);
    }
}
```

Please note that the Apache Commons Math library is used for the T-test. You can add it to your project by adding the following dependency to your pom.xml file:

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-math3</artifactId>
    <version>3.6.1</version>
</dependency>
```

