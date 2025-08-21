import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_581_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int[] resultArray = new int[n];
        int initialValue = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(initialValue);
        Thread thread = new Thread(() -> {
            int result = calculateProduct(queue.poll(), n);
            queue.add(result);
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result = queue.poll();
        resultArray[0] = result;
        int mx = inputArray[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            resultArray[i] = Math.max(0, mx - inputArray[i] + 1);
            if (inputArray[i] > mx) {
                mx = inputArray[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }

    public static int calculateProduct(int initialValue, int n) {
        return initialValue * n;
    }
}