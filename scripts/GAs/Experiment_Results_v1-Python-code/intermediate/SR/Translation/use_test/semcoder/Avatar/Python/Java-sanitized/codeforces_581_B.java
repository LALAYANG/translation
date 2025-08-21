import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_581_B {
    public static int calculateProduct(int initialValue, int n) {
        return initialValue * n;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] inputArray = {55, 50, 51, 53, 53, 52, 50, 54, 54, 53};
        int[] resultArray = new int[n];
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
}