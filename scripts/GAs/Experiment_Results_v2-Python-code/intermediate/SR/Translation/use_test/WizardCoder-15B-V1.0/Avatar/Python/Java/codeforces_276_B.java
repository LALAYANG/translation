```java
import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Character> inputList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            inputList.add(input.charAt(i));
        }
        int loopBoundary = 396;
        int stopCondition = 395;
        Map<Character, Integer> charCountMap = new HashMap<>();
        recursiveCounter(0, loopBoundary / stopCondition, 1, inputList, charCountMap);
        TTest tTest = new TTest();
        double[] sample1 = {20, 59, 67};
        double[] sample2 = {51, 40, 62};
        double pValue = tTest.tTest(sample1, sample2);
        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt++;
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

    public static void recursiveCounter(int loopIndexOut, int stop, int step, List<Character> inputList, Map<Character, Integer> charCountMap) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char c : inputList) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        recursiveCounter(loopIndexOut + step, stop, step, inputList, charCountMap);
    }
}
```
