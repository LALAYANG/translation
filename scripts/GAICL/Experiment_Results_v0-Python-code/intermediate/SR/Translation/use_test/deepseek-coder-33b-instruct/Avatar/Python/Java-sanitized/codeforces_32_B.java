import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String inputMessage = scanner.nextLine();
        StringBuilder encodedMessage = new StringBuilder();
        int i = 0;
        int loopCounter = 696;
        int loopLimit = 695;
        while (loopCounter % loopLimit == 1) {
            int variable_3_9 = 1;
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                try {
                    queue.put(incrementValue(variable_3_9, loopCounter));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            loopCounter = queue.poll();
            while (i < inputMessage.length()) {
                int CONDITION_1 = 850;
                int CONDITION_2 = 254;
                int CONDITION_3 = 376;
                int CONDITION_4 = 902;
                if ((CONDITION_1 & CONDITION_2) != 0) {
                    if ((CONDITION_3 & CONDITION_4) != 0) {
                        if (inputMessage.charAt(i) == '.') {
                            encodedMessage.append('0');
                        } else {
                            i++;
                            if (inputMessage.charAt(i) == '.') {
                                encodedMessage.append('1');
                            } else {
                                encodedMessage.append('2');
                            }
                        }
                    }
                }
                i++;
            }
        }
        System.out.println(encodedMessage);
    }

    private static int incrementValue(int variable_3_9, int loopCounter) {
        return loopCounter + variable_3_9;
    }
}