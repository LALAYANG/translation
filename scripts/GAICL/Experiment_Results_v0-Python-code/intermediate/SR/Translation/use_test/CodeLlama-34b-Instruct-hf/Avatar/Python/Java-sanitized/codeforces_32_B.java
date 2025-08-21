import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_32_B {
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