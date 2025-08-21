import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_621_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] input = args[1].split(" ");
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(lst);
        Arrays.parallelSort(lst);
        int od = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 != 0) {
                od++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                if (ok || od > 1) {
                    sum += lst[i];
                    od--;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }
}