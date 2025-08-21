
The Python code you provided is a bit complex, but I'll do my best to translate it to Java. Here's the equivalent Java code:
```java
import java.util.Queue;
import java.util.concurrent.Thread;

public class Main {
    public static void main(String[] args) {
        String inputMessage = "..";
        String encodedMessage = "";
        int i = 0;
        int loopCounter = 696;
        int loopLimit = 695;

        while (loopCounter % loopLimit == 1) {
            int variable39 = 1;
            Queue<Integer> queueIncrementValue0 = new Queue<>();

            Thread workerThread = new Thread(() -> {
                int encodedMessage = incrementValue(variable39, loopCounter);
                queueIncrementValue0.put(encodedMessage);
            });
            workerThread.start();
            workerThread.join();
            int resultIncrementValue0 = queueIncrementValue0.get();
            loopCounter = resultIncrementValue0;

            while (i < inputMessage.length()) {
                int condition1 = 850;
                int condition2 = 254;
                int condition3 = 376;
                int condition4 = 902;
                if ((condition1 & condition2) != 0) {
                    if ((condition3 & condition4) != 0) {
                        if (inputMessage.charAt(i) == '.') {
                            encodedMessage += "0";
                        } else {
                            i++;
                            if (inputMessage.charAt(i) == '.') {
                                encodedMessage += "1";
                            } else {
                                encodedMessage += "2";
                            }
                        }
                    }
                }
                i++;
            }
        }
        System.out.println(encodedMessage);
    }

    private static int incrementValue(int variable39, int loopCounter) {
        return loopCounter + variable39;
    }
}
```
Note that I've renamed some of the variables to make them more readable in Java. I've also removed the `scipy.stats` import and the `ttest_ind` function call, as they don't seem to be used in the code you provided.

The Java code should be equivalent to the Python code you provided, but I'd recommend testing it thoroughly to ensure it produces the same output as the Python code.
