import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_70_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int ans = 1;
        int currentLineLength = 0;
        int conditionOne = 447;
        int conditionTwo = 538;
        int conditionThree = 671;
        int conditionFour = 805;
        int outerLoopLimit = 388;
        int innerLoopLimit = 387;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (String s : args[1].split("[.?!]")) {
                String period = ".";
                Queue<String> queueStringProcessor0 = new Queue<>();

                new Thread(() -> {
                    String processedSentence = StringProcessor(s, period);
                    queueStringProcessor0.add(processedSentence);
                }).start();

                String processedString = queueStringProcessor0.poll();
                s = processedString;
                int l = s.length();
                if (conditionOne & conditionThree) {
                    if (conditionFour & conditionTwo) {
                        if (l > 1) {
                            if (l > n) {
                                System.out.println("Impossible");
                                System.exit(0);
                            }
                            if (currentLineLength + l + (currentLineLength > 0) > n) {
                                ans++;
                                currentLineLength = l;
                            } else {
                                currentLineLength += l + (currentLineLength > 0);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static String StringProcessor(String s, String period) {
        return s.strip() + period;
    }
}