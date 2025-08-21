```java
import java.util.*;
import org.apache.commons.math3.stat.inference.*;

public class Main {
    public static void main(String[] args) {
        String s = "knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct";
        int CHECK_VALUE_1 = 503;
        int CHECK_VALUE_2 = 523;
        int loop_bound = 704;
        int step_size = 703;
        boolean x = true;
        Map<Character, Integer> dt = new HashMap<>();
        countChars(dt, 0, loop_bound, step_size);
        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        TTest tTest = new TTest();
        double[] sample1 = {29, 15, 26};
        double[] sample2 = {79, 48, 31};
        double pValue = tTest.tTest(sample1, sample2);
        if (CHECK_VALUE_1 & CHECK_VALUE_2 != 0) {
            if (x) {
                System.out.println("First");
            } else if (!x && s.length() % 2 == 0) {
                System.out.println("Second");
            } else if (!x && s.length() % 2 != 0) {
                System.out.println("First");
            }
        }
    }

    public static void countChars(Map<Character, Integer> dt, int start, int stop, int step) {
        if (step == 0 || (step > 0 && start >= stop) || (step < 0 && start <= stop)) {
            return;
        }
        for (char c : s.toCharArray()) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        countChars(dt, start + step, stop, step);
    }
}
```
