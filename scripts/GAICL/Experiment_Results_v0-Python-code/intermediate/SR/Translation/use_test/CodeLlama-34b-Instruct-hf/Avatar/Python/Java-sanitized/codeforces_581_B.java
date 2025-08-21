import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;

public class codeforces_581_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] data = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            data[i] = scanner.nextInt();
        }

        int variable17 = 0;
        int[] result = new int[arraySize];
        Queue<Integer> resultQueue = new LinkedList<>();

        Thread thread = new Thread(() -> {
            int result = wrappedFunc(arraySize, variable17);
            resultQueue.add(result);
        });
        thread.start();
        thread.join();

        int globalResult = resultQueue.poll();
        for (int i = 0; i < arraySize; i++) {
            result[i] = Math.max(0, globalResult - data[i] + 1);
        }

        System.out.println(Arrays.toString(result));
    }

    public static int wrappedFunc(int arraySize, int variable17) {
        return variable17 * arraySize;
    }
}