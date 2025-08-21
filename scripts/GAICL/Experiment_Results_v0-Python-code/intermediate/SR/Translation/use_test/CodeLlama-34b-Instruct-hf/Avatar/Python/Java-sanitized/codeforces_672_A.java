import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_672_A {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        int ConditionChecker110 = 79;
        int ConditionChecker210 = 639;
        for (int i = 1; i <= 371; i++) {
            int p = i;
            int newq_1 = i;
            int count = 0;
            while (p != 0) {
                p = p / 10;
                count++;
            }
            if (ConditionChecker110 & ConditionChecker210) {
                if (count == 1) {
                    li.add(i);
                }
            }
            if (count == 2) {
                List<Integer> temp = new ArrayList<>();
                while (newq_1 != 0) {
                    int x = newq_1 % 10;
                    newq_1 = newq_1 / 10;
                    temp.add(x);
                }
                List<Integer> variable_3_21 = temp;
                Queue<Integer> queue_newFunc0_210 = new LinkedList<>();
                ExecutorService executor = Executors.newSingleThreadExecutor();
                executor.submit(() -> {
                    List<Integer> result = newFunc0_21(li, variable_3_21);
                    queue_newFunc0_210.add(result);
                });
                executor.shutdown();
                List<Integer> result_newFunc0_210 = queue_newFunc0_210.poll();
                li = result_newFunc0_210;
            }
            if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                while (newq_1 != 0) {
                    int x = newq_1 % 10;
                    newq_1 = newq_1 / 10;
                    temp.add(x);
                }
                li = li + temp;
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        int newn_1 = Integer.parseInt(args[0]);
        System.out.println(li.get(newn_1 - 1));
    }

    private static List<Integer> newFunc0_21(List<Integer> li, List<Integer> variable_3_21) {
        return li + variable_3_21;
    }
}