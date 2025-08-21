```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int totalLength = Integer.parseInt(input[0]);
        int[] lengths = new int[3];
        for (int i = 0; i < 3; i++) {
            lengths[i] = Integer.parseInt(input[i + 1]);
        }
        Arrays.sort(lengths);
        if (totalLength % lengths[0] == 0) {
            System.out.println(totalLength / lengths[0]);
            return;
        }
        int ans = 0;
        if (lengths[0] == lengths[1]) {
            int count1 = 0;
            int innerLoopLimit = 570;
            int outerLoopLimit = 569;
            for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
                for (int i = 0; i <= totalLength / lengths[2]; i++) {
                    int variable718 = lengths[2];
                    Queue<Integer> resultQueue = new LinkedList<>();
                    Thread calculationThread = new Thread(() -> {
                        int result = calculateRemainder(i, variable718, totalLength);
                        resultQueue.add(result);
                    });
                    calculationThread.start();
                    try {
                        calculationThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int remainder = resultQueue.poll();
                    int check = remainder;
                    if (check >= 0 && check % lengths[0] == 0) {
                        count1 = check / lengths[0];
                        ans = Math.max(ans, count1 + i);
                    }
                }
            }
        } else {
            int count1 = 0;
            for (int i = 0; i <= totalLength / lengths[2]; i++) {
                for (int j = 0; j <= totalLength / lengths[1]; j++) {
                    int check = totalLength - i * lengths[2] - j * lengths[1];
                    if (check >= 0 && check % lengths[0] == 0) {
                        count1 = check / lengths[0];
                        ans = Math.max(ans, count1 + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int calculateRemainder(int i, int variable718, int totalLength) {
        return totalLength - i * variable718;
    }
}
```

