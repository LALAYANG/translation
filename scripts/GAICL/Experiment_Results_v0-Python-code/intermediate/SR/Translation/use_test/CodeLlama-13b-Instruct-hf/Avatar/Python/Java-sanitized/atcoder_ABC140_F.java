import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            try {
                queue.put(Func_I_0());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
        thread.join();

        int result = queue.take();
        int N = result;
        int[] S = scanner.nextLine().split(" ").mapToInt(Integer::parseInt).sorted().toArray();
        boolean[] flag = new boolean[S.length];
        Arrays.fill(flag, true);
        int[] currentValues = new int[S.length];
        currentValues[0] = S[0];
        flag[0] = false;

        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = currentValues.length;
            for (int k = 0; k < S.length; k++) {
                if (S[k] < currentValues[j]) {
                    currentValues[j] = S[k];
                    j++;
                    flag[k] = false;
                    if (j == jM) {
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(currentValues));
    }

    private static int Func_I_0() {
        // Perform t-test and return result
        return 0;
    }
}