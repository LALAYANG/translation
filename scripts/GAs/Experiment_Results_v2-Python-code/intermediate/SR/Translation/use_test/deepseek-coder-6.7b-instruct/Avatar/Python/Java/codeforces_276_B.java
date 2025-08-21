Here is the Java equivalent of the provided Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct";
        Map<Character, Integer> dt = new HashMap<>();
        int loopBoundary = 396;
        int stopCondition = 395;

        for (int i = 0; i < loopBoundary / stopCondition; i++) {
            for (char c : input.toCharArray()) {
                if (dt.containsKey(c)) {
                    dt.put(c, dt.get(c) + 1);
                } else {
                    dt.put(c, 1);
                }
            }
        }

        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }

        if (x) {
            System.out.println("First");
        } else if (!x && input.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && input.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}
```

Please note that the t-test function from scipy is not available in Java. If you need to perform a t-test, you would need to implement it yourself or use a library that provides this functionality.

