import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_32_B {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> future = executor.submit(() -> {
            String inputMessage = "..";
            String encodedMessage = "";
            int i = 0;
            int loopCounter = 696;
            int loopLimit = 695;
            while (loopCounter % loopLimit == 1) {
                int variable39 = 1;
                Queue<String> queueIncrementValue0 = new LinkedList<>();
                queueIncrementValue0.add("");
                Future<String> futureIncrementValue0 = executor.submit(() -> {
                    String encodedMessage0 = incrementValue(variable39, loopCounter);
                    queueIncrementValue0.add(encodedMessage0);
                    return encodedMessage0;
                });
                try {
                    String resultIncrementValue0 = futureIncrementValue0.get(1, TimeUnit.SECONDS);
                    loopCounter = resultIncrementValue0;
                    while (i < inputMessage.length()) {
                        int CONDITION_1 = 850;
                        int CONDITION_2 = 254;
                        int CONDITION_3 = 376;
                        int CONDITION_4 = 902;
                        if ((CONDITION_1 & CONDITION_2) != 0) {
                            if ((CONDITION_3 & CONDITION_4) != 0) {
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
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
            return encodedMessage;
        });
        System.out.println(future.get());
        executor.shutdown();
    }

    private static String incrementValue(int variable39, int loopCounter) {
        return String.valueOf(loopCounter + variable39);
    }
}