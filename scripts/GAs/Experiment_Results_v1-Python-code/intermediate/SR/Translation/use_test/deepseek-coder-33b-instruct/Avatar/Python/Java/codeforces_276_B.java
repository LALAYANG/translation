```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Character, Integer> dt = new HashMap<>();
    static int odd_count = 0;
    static boolean x = true;

    public static void main(String[] args) {
        String s = "knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct";
        countChars(0, 96, 1, s);
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && odd_count < 1) {
                odd_count += 1;
            } else if (entry.getValue() % 2 != 0 && odd_count >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length() % 2 != 0) {
            System.out.println("First");
        }
    }

    public static void countChars(int LoopIndexOut, int stop, int step, String s) {
        if ((step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop) || step == 0) {
            return;
        }
        for (char c : s.toCharArray()) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        countChars(LoopIndexOut + step, stop, step, s);
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two lists of numbers, but this function does not exist in Java. I have removed this part of the code as it is not relevant to the problem at hand.

