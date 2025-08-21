import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queueLI0 = new Queue<>();

        Thread threadLI0 = new Thread(() -> {
            int[] result = Func_LI_0();
            queueLI0.add(result);
        });
        threadLI0.start();
        threadLI0.join();
        int[] resultLI0 = queueLI0.poll();
        int a = resultLI0[0];
        int b = resultLI0[1];
        int multiplier = resultLI0[2];
        int d = resultLI0[3];
        System.out.println(Math.max(a * multiplier, b * d, a * d, b * multiplier));
    }

    public static int[] Func_LI_0() {
        int[] result = new int[4];
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        for (int i = 0; i < 4; i++) {
            result[i] = Integer.parseInt(tokens[i]);
        }
        return result;
    }
}