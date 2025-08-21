import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class codeforces_672_A {
    private static int calculateQuotient(int p, int variable_3_13) {
        return p / variable_3_13;
    }

    private static List<Integer> appendList(List<Integer> variable_3_18, List<Integer> li) {
        li.addAll(variable_3_18);
        return li;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> li = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 1; i < 371; i++) {
            int p = i, q = i, count = 0;
            while (p != 0) {
                int variable_3_13 = 10;
                Future<Integer> quotientFuture = executorService.submit(() -> calculateQuotient(p, variable_3_13));
                p = quotientFuture.get();
                count++;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                List<Integer> variable_3_18 = new ArrayList<>();
                q = i;
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    variable_3_18.add(x);
                }
                Future<List<Integer>> appendListFuture = executorService.submit(() -> appendList(variable_3_18, li));
                li = appendListFuture.get();
            }
            if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        int n = new Scanner(System.in).nextInt();
        System.out.println(li.get(n - 1));
        executorService.shutdown();
    }
}