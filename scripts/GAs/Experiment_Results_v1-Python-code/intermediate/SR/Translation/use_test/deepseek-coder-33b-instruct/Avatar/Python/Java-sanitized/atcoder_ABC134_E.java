import java.util.*;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        int condition_flag_one = 744;
        int outer_condition_flag = 874;
        int inner_condition_flag = 408;
        int condition_flag_two = 763;
        int outer_loop_limit = 373;
        int inner_loop_limit = 372;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                int A = scanner.nextInt();
                int insert_index = binarySearch(ans, A);
                if ((inner_condition_flag & condition_flag_two) != 0) {
                    if ((condition_flag_one & outer_condition_flag) != 0) {
                        if (insert_index == ans.size()) {
                            ans.add(new ArrayList<>(Arrays.asList(A)));
                        } else {
                            ans.get(insert_index).add(A);
                        }
                    }
                }
            }
        }
        System.out.println(ans.size());
    }

    public static int binarySearch(List<List<Integer>> ans, int key) {
        int bad = -1;
        int good = ans.size();
        while (good - bad > 1) {
            int middle_index = (bad + good) / 2;
            if (ans.get(middle_index).get(ans.get(middle_index).size() - 1) < key) {
                good = middle_index;
            } else {
                bad = middle_index;
            }
        }
        return good;
    }
}