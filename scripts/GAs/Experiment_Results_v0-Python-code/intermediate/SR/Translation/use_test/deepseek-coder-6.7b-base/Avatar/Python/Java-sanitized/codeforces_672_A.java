import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_672_A {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        int[] li = new int[370];
        int ind = 0;
        for (int i = 1; i <= 370; i++) {
            int[] temp = new int[10];
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                int variable_3_13 = 10;
                Future<Integer> quotientFuture = executorService.submit(() -> calculateQuotient(p, variable_3_13));
                p = quotientFuture.get();
                count++;
            }
            if (count == 1) {
                li[ind++] = i;
            }
            if (count == 2) {
                int[] variable_3_18 = new int[10];
                Future<int[]> appendListFuture0 = executorService.submit(() -> appendList(variable_3_18, li));
                li = appendListFuture0.get();
            }
            if (count == 3) {
                int[] temp1 = new int[10];
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp1[ind++] = x;
                }
                li = li + temp1;
            }
        }
        li.pop();
        li.pop();
        System.out.println(li[n - 1]);
    }

    public static int calculateQuotient(int p, int variable_3_13) {
        return p / variable_3_13;
    }

    public static int[] appendList(int[] variable_3_18, int[] li) {
        return li + variable_3_18;
    }
}