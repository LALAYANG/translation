```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        String inputMessage = System.console().readLine();
        String encodedMessage = "";
        int i = 0;
        int loopCounter = 696;
        int loopLimit = 695;
        while (loopCounter % loopLimit == 1) {
            int variable39 = 1;
            Queue<Integer> queueIncrementValue0 = new LinkedBlockingQueue<>();

            Runnable computeAndEnqueueResult = () -> {
                encodedMessage = incrementValue(variable39, loopCounter);
                queueIncrementValue0.add(encodedMessage);
            };
            Thread workerThread = new Thread(computeAndEnqueueResult);
            workerThread.start();
            workerThread.join();
            int resultIncrementValue0 = queueIncrementValue0.poll();
            loopCounter = resultIncrementValue0;
            while (i < inputMessage.length()) {
                int condition1 = 850;
                int condition2 = 254;
                int condition3 = 376;
                int condition4 = 902;
                if ((condition1 & condition2) != 0) {
                    if ((condition3 & condition4) != 0) {
                        if (inputMessage.charAt(i) == '.') {
                            encodedMessage = encodedMessage + "0";
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
            System.out.println(encodedMessage);
        }
    }

    public static int incrementValue(int variable39, int loopCounter) {
        return loopCounter + variable39;
    }
}
```

