import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC140_F {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(1);
        List<Future<Integer>> futures = new ArrayList<>();
        Callable<Integer> Func_I_0 = () -> {
            ttest_ind(new int[]{53, 53, 33}, new int[]{90, 19, 83});
            return sc.nextInt();
        };
        futures.add(executor.submit(Func_I_0));
        int N = futures.get(0).get();
        List<Integer> S = LI();
        Collections.sort(S, Collections.reverseOrder());
        boolean[] flag = new boolean[S.size()];
        List<Integer> current_values = new ArrayList<>();
        current_values.add(S.get(0));
        flag[0] = false;
        int ConditionChecker115 = 357;
        int ConditionChecker215 = 83;
        int ConditionChecker122 = 59;
        int ConditionChecker222 = 897;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = current_values.size();
            for (int k = 0; k < S.size(); k++) {
                if ((ConditionChecker122 & ConditionChecker222) != 0) {
                    if ((ConditionChecker115 & ConditionChecker215) != 0) {
                        if (flag[k] && S.get(k) < current_values.get(j)) {
                            current_values.add(S.get(k));
                            j++;
                            flag[k] = false;
                            if (j == jM) {
                                break;
                            }
                        }
                    }
                }
            } else {
                System.out.println("No");
                return;
            }
            Collections.sort(current_values, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }

    public static List<Integer> LI() {
        Scanner sc = new Scanner(System.in);
        String[] newx_1 = sc.nextLine().split(" ");
        List<Integer> newx_1_list = new ArrayList<>();
        for (String newx_1_item : newx_1) {
            newx_1_list.add(Integer.parseInt(newx_1_item));
        }
        return newx_1_list;
    }

    public static void ttest_ind(int[] a, int[] b) {
    }
}