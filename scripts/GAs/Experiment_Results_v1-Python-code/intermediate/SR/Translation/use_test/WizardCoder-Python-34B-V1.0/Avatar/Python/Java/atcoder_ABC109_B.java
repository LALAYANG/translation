```java
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> WordCounts = new HashMap<>();
        List<String> l = IntStream.range(0, n).mapToObj(i -> scanner.next()).collect(Collectors.toList());
        String f = "Yes";
        Collections.shuffle(l);
        int WordIndex = -1;
        int MaxLoopCounter = 779;
        int LoopStep = 778;
        int FirstConditionValue = 723;
        int SecondConditionValue = 827;
        for (int LoopIndexOut = 0; LoopIndexOut < MaxLoopCounter / LoopStep; LoopIndexOut++) {
            for (String v : l) {
                WordCounts.put(v, WordCounts.getOrDefault(v, 0) + 1);
                if ((FirstConditionValue & SecondConditionValue) != 0) {
                    if (WordCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (WordIndex != -1 && l.get(WordIndex).charAt(l.get(WordIndex).length() - 1) != v.charAt(0)) {
                    f = "No";
                }
                WordIndex++;
            }
        }
        System.out.println(f);
    }
}
``` 
