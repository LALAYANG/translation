import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_189_A {
    public static void main(String[] args) {
        int[] arr = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        int totalLength = arr[0];
        int[] sortedArr = Arrays.copyOfRange(arr, 1, 4);
        Arrays.sort(sortedArr);
        if (totalLength % sortedArr[0] == 0) {
            System.out.println(totalLength / sortedArr[0]);
            return;
        }
        int ans = 0;
        if (sortedArr[0] == sortedArr[1]) {
            int count1 = 0;
            int innerLoopLimit = 570;
            int outerLoopLimit = 569;
            for (int i = 0; i < innerLoopLimit / outerLoopLimit; i++) {
                for (int j = 0; j < totalLength / sortedArr[2] + 1; j++) {
                    int variable718 = sortedArr[2];
                    Queue<Integer> resultQueue = new Queue<>();

                    Thread calculateRemainderThread = new Thread(() -> {
                        int result = calculateRemainder(j, variable718, totalLength);
                        resultQueue.add(result);
                    });
                    calculateRemainderThread.start();
                    calculateRemainderThread.join();
                    int remainder = resultQueue.poll();
                    if (remainder >= 0 && remainder % sortedArr[0] == 0) {
                        count1 = remainder / sortedArr[0];
                        ans = Math.max(ans, count1 + j);
                    }
                }
            }
        } else {
            int count1 = 0;
            for (int i = 0; i < totalLength / sortedArr[2] + 1; i++) {
                for (int j = 0; j < totalLength / sortedArr[1] + 1; j++) {
                    int check = totalLength - i * sortedArr[2] - j * sortedArr[1];
                    if (check >= 0 && check % sortedArr[0] == 0) {
                        count1 = check / sortedArr[0];
                        ans = Math.max(ans, count1 + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static int calculateRemainder(int i, int variable718, int totalLength) {
        return totalLength - i * variable718;
    }
}