import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_581_B {
    public static void main(String[] args) {
        int array_size = 10;
        int[] data = {55, 50, 51, 53, 53, 52, 50, 54, 54, 53};
        int[] ans = new int[array_size];
        int current_max = data[array_size - 1];

        for (int i = array_size - 2; i >= 0; i--) {
            ans[i] = Math.max(0, current_max - data[i] + 1);
            if (data[i] > current_max) {
                current_max = data[i];
            }
        }

        for (int i = 0; i < array_size; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}