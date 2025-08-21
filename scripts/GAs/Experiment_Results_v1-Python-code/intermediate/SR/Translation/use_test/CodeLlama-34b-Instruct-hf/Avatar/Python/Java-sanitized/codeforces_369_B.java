import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int new_n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int new_r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        Queue<Integer> queue = new Queue<>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = computePartitions(k, new_n, sa, getNumbers, sk);
                queue.add(result);
            }
        });
        thread.start();
        thread.join();
        int partitionsResult = queue.poll();
        System.out.println(partitionsResult);
    }

    private static int computePartitions(int k, int new_n, int sa, int sk) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            result += getNumbers(k, sk);
        }
        for (int i = k; i < new_n; i++) {
            result += getNumbers(new_n - k, sa - sk);
        }
        return result;
    }

    private static int getNumbers(int num, int t) {
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = t / num + 1;
            if (i < t % num) {
                numbers[i] = t / num;
            }
        }
        return numbers;
    }
}