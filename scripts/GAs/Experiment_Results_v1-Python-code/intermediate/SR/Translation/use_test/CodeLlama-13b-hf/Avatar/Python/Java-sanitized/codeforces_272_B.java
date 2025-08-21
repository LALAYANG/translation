import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        int[] FXs = new int[sequence.length];
        int[][] storage = new int[sequence.length][];
        int conditionalCheckOne = 725;
        int conditionalCheckThree = 549;
        int conditionalCheckTwo = 135;
        int conditionalCheckFour = 718;
        for (int i = 0; i < sequence.length; i++) {
            int value = sequence[i];
            int y = f(value);
            if (conditionalCheckTwo & conditionalCheckFour) {
                if (conditionalCheckOne & conditionalCheckThree) {
                    if (y < 0 || y >= storage.length) {
                        continue;
                    }
                    if (storage[y] == null) {
                        storage[y] = new int[]{value};
                        FXs[i] = y;
                    } else {
                        storage[y] = storage[y].concat(new int[]{value});
                    }
                }
            }
        }
        int result = 0;
        for (int i = 0; i < FXs.length; i++) {
            if (FXs[i] < 0 || FXs[i] >= storage.length) {
                continue;
            }
            result += storage[FXs[i]].length * (storage[FXs[i]].length - 1);
        }
        return result / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y = y + 1;
            }
            n = n / 2;
        }
        return y;
    }
}