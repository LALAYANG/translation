import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        int threshold_a = 14;
        int threshold_b = 850;
        int od = 0;
        int sum = 0;
        int ok = 0;
        for (int i = 0; i < n; i++) {
            if (threshold_a & threshold_b) {
                if (lst[i] % 2 == 1) {
                    od++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok || od > 1) {
                sum += lst[i];
                od--;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }
}