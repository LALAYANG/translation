import java.util.*;
import java.util.concurrent.*;

public class codeforces_350_B {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> variable_1_3 = new ArrayList<>(Collections.nCopies(1, 0));
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<List<Integer>> future = executorService.submit(() -> {
            List<Integer> list = new ArrayList<>();
            for (String s : scanner.nextLine().split(" ")) {
                list.add(Integer.parseInt(s));
            }
            variable_1_3.addAll(list);
            return variable_1_3;
        });
        List<Integer> merged_list = future.get();
        executorService.shutdown();
        List<Integer> t = merged_list;
        // ttest_ind([46, 98, 69], [85, 61, 7])
        List<Integer> values = new ArrayList<>(Collections.nCopies(1, 0));
        for (String s : scanner.nextLine().split(" ")) {
            values.add(Integer.parseInt(s));
        }
        List<Integer> ans = new ArrayList<>();
        List<Integer> counts = new ArrayList<>(Collections.nCopies(n + 1, 0));
        for (Integer i : values) {
            counts.set(i, counts.get(i) + 1);
        }
        int check_value = 239;
        int max_value = 106;
        for (int i = 1; i <= n; i++) {
            if ((check_value & max_value) != 0) {
                if (t.get(i) == 1) {
                    List<Integer> crt = new ArrayList<>();
                    crt.add(i);
                    int x = values.get(i);
                    while (counts.get(x) == 1) {
                        crt.add(x);
                        x = values.get(x);
                    }
                    if (crt.size() > ans.size()) {
                        ans = new ArrayList<>(crt);
                    }
                }
            }
        }
        Collections.reverse(ans);
        System.out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(ans.get(i));
        }
        System.out.println();
    }
}