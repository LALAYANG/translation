
Here is the Java code that implements the same functionality as the Python code:
```java
import java.util.HashMap;
import java.util.Map;

public class MyDecorator {
    public static void main(String[] args) {
        String input = "knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct...";
        int CHECK_VALUE_1 = 503;
        int CHECK_VALUE_2 = 523;
        int loop_bound = 704;
        int step_size = 703;

        Map<Character, Integer> dt = new HashMap<>();
        for (int i = 0; i < loop_bound; i += step_size) {
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
                cnt++;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }

        if (CHECK_VALUE_1 & CHECK_VALUE_2) {
            if (x) {
                System.out.println("First");
            } else if (!x && input.length() % 2 == 0) {
                System.out.println("Second");
            } else if (!x && input.length() % 2 != 0) {
                System.out.println("First");
            }
        }
    }
}
```
Note that the Java code uses a `HashMap` to store the character counts, which is more efficient than using a `List` as in the Python code. Additionally, the Java code uses a `for` loop to iterate over the characters in the input string, which is more concise than the Python code's use of the `map` function.
