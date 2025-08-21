```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int ans = 1;
        int CurrentLineLength = 0;
        int ConditionFour = 805;
        int ConditionTwo = 538;
        int ConditionOne = 447;
        int ConditionThree = 671;
        int OuterLoopLimit = 388;
        int InnerLoopLimit = 387;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            String input = args[1];
            String[] sentences = input.split("[.?!]");
            for (String s : sentences) {
                String Period = ".";
                Queue<String> queue_StringProcessor0 = new LinkedList<>();

                class StringProcessor_thread implements Runnable {
                    public void run() {
                        String ProcessedSentence = StringProcessor(s, Period);
                        queue_StringProcessor0.offer(ProcessedSentence);
                    }
                }
                Thread thread_StringProcessor0 = new Thread(new StringProcessor_thread());
                thread_StringProcessor0.start();
                try {
                    thread_StringProcessor0.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String ProcessedString = queue_StringProcessor0.poll();
                s = ProcessedString;
                int L = s.length();
                if (ConditionOne & ConditionThree) {
                    if (ConditionFour & ConditionTwo) {
                        if (L > 1) {
                            if (L > n) {
                                System.out.println("Impossible");
                                System.exit(0);
                            }
                            if (CurrentLineLength + L + (CurrentLineLength > 0) > n) {
                                ans++;
                                CurrentLineLength = L;
                            } else {
                                CurrentLineLength = CurrentLineLength + L + (CurrentLineLength > 0);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static String StringProcessor(String s, String Period) {
        return s.trim() + Period;
    }
}
```
