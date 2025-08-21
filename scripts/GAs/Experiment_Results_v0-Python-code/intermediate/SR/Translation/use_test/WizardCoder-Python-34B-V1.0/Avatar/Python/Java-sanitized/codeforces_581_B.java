import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_581_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int[] data = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            data[i] = scanner.nextInt();
        }
        int[] ans = new int[array_size];
        int current_max = data[array_size - 1];
        for (int i = array_size - 2; i >= 0; i--) {
            ans[i] = Math.max(0, current_max - data[i] + 1);
            if (data[i] > current_max) {
                current_max = data[i];
            }
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}