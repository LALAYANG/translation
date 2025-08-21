Here is the Java version of your Python code:

```java
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int n = 118;
        int ans = 1;
        int currentLineLength = 0;
        int conditionFour = 805;
        int conditionTwo = 538;
        int conditionOne = 447;
        int conditionThree = 671;
        int outerLoopLimit = 388;
        int innerLoopLimit = 387;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            String input = "gweVo bjbEKaZQw PpSi AWOYt sQSvAHNRswh vUaGuLbtExNECz! USsQxMCjaGOmUESwHvyY SshkERibaWkmNLSZOtWZy FFTUWQgekPRjLRetAdSFt! sIhcimZTisFvndrYioLF HetLn wjoaDUKfbkagupl QdYb fFiV GNqBygStKQw. XLiYZEOGnTLSHmCwktEr pVBePMoRGopNt LdEujxuxzmlbycQdR?";
            String[] sentences = Pattern.compile("[.?!]").split(input);
            for (String s : sentences) {
                String period = ".";
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<String> future = executor.submit(() -> StringProcessor(s, period));
                s = future.get();
                int L = s.length();
                if ((conditionOne & conditionThree) != 0) {
                    if ((conditionFour & conditionTwo) != 0) {
                        if (L > 1) {
                            if (L > n) {
                                System.out.println("Impossible");
                                System.exit(0);
                            }
                            if (currentLineLength + L + (currentLineLength > 0 ? 1 : 0) > n) {
                                ans++;
                                currentLineLength = L;
                            } else {
                                currentLineLength = currentLineLength + L + (currentLineLength > 0 ? 1 : 0);
                            }
                        }
                    }
                }
                executor.shutdown();
            }
        }
        System.out.println(ans);
    }

    public static String StringProcessor(String s, String period) {
        return s.strip() + period;
    }
}
```

This Java code does the same thing as your Python code. It uses the `ExecutorService` to create a new thread for each sentence, and the `Future.get()` method to wait for the thread to finish and get the result. The `Pattern.compile("[.?!]").split(input)` method is used to split the input into sentences. The `String.strip()` method is used to remove leading and trailing whitespace. The rest of the code is a direct translation of your Python code.

