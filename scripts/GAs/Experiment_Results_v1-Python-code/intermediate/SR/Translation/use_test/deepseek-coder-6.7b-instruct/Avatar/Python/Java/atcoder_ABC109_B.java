Here is the Java equivalent of the provided Python code:

```java
import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> wordCounts = new HashMap<>();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.next());
        }
        String f = "Yes";
        Collections.shuffle(Arrays.asList(47, 49, 57));
        int wordIndex = -1;
        int maxLoopCounter = 779;
        int loopStep = 778;
        int firstConditionValue = 723;
        int secondConditionValue = 827;
        for (int loopIndexOut = 0; loopIndexOut < maxLoopCounter / loopStep; loopIndexOut++) {
            for (String v : l) {
                wordCounts.put(v, wordCounts.getOrDefault(v, 0) + 1);
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if (wordCounts.get(v) >= 2) {
                        f = "No";
                }
                if (wordIndex != -1 && l.get(wordIndex).charAt(l.get(wordIndex).length() - 1) != v.charAt(0)) {
                    f = "No";
                }
                wordIndex++;
            }
        }
        TTest tTest = new TTest();
        double[] sample1 = {98, 83, 54};
        double[] sample2 = {86, 66, 53};
        tTest.tTest(sample1, sample2);
        System.out.println(f);
    }
}
```

Please note that the Apache Commons Math library is used for the TTest. If you are using a build tool like Maven or Gradle, you need to add the following dependency to your project:

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-math3</artifactId>
    <version>3.6.1</version>
</dependency>
```

Also, please note that the Python code provided is not a complete program. It seems to be a part of a larger program that uses machine learning and statistics. The provided Python code does not include the full context of the larger program, so some parts of the Java code may not match the original Python code exactly.

