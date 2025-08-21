import java.util.concurrent.*;

public class codeforces_32_B {
    private static int loopCounter = 696;
    private static int loopLimit = 695;
    private static int variable_3_9 = 1;
    private static String encodedMessage = "";
    private static String inputMessage;
    private static ExecutorService executorService = Executors.newFixedThreadPool(1);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        inputMessage = "<input>"; // replace <input> with your input
        while (loopCounter % loopLimit == 1) {
            loopCounter = incrementValue(variable_3_9, loopCounter);
            Future<Integer> future = executorService.submit(new ComputeAndEnqueueResult());
            loopCounter = future.get();
            for (int i = 0; i < inputMessage.length(); i++) {
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
            }
        }
        System.out.println(encodedMessage);
        executorService.shutdown();
    }

    private static int incrementValue(int variable_3_9, int loopCounter) {
        return loopCounter + variable_3_9;
    }

    private static class ComputeAndEnqueueResult implements Callable<Integer> {
        @Override
        public Integer call() {
            int encodedMessage = Main.incrementValue(variable_3_9, loopCounter);
            return encodedMessage;
        }
    }
}