
Here is the Java code that translates the Python code:
```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String input = "knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct...";
        List<Character> inputList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            inputList.add(input.charAt(i));
        }

        Map<Character, Integer> dt = new HashMap<>();
        int loopBoundary = 396;
        int stopCondition = 395;

        recursiveCounter(0, loopBoundary / stopCondition, 1, inputList, dt);

        int[] x = {20, 59, 67};
        int[] y = {51, 40, 62};
        double t = ttestInd(x, y);
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
        } else if (!x && inputList.size() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && inputList.size() % 2 != 0) {
            System.out.println("First");
        }
    }

    public static void recursiveCounter(int loopIndexOut, int stop, int step, List<Character> inputList, Map<Character, Integer> dt) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int i = 0; i < inputList.size(); i++) {
            Character c = inputList.get(i);
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        recursiveCounter(loopIndexOut + step, stop, step, inputList, dt);
    }

    public static double ttestInd(int[] x, int[] y) {
        double t = 0;
        for (int i = 0; i < x.length; i++) {
            t += (x[i] - y[i]) * (x[i] - y[i]);
        }
        return t;
    }
}
```
Note that this code assumes that the input string is a valid string and that the `ttestInd` function is defined in the `scipy.stats` module.
