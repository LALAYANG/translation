import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> inputQueue = new LinkedBlockingQueue<>();

        Thread inputThread = new Thread(() -> {
            int[] result = readMultipleInputs(scanner);
            inputQueue.put(result);
        });
        inputThread.start();
        inputThread.join();

        int[] resultMI0 = inputQueue.take();
        int N = resultMI0[0];
        int A = resultMI0[1];
        int B = resultMI0[2];
        int ans = 0;
        int rep = N / (A + B);
        ans += rep * A;
        int res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }

    private static int[] readMultipleInputs(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }
}