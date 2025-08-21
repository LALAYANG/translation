import java.util.*;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        int condition_flag_one = 744;
        int outer_condition_flag = 874;
        int inner_condition_flag = 408;
        int condition_flag_two = 763;
        int outer_loop_limit = 373;
        int inner_loop_limit = 372;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            List<Integer> innerList = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                int insert_index = binarySearch(ans, A);
                if (inner_condition_flag & condition_flag_two != 0) {
                    if (condition_flag_one & outer_condition_flag != 0) {
                        if (insert_index == ans.size()) {
                            innerList.add(A);
                            ans.add(innerList);
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
        int low = 0;
        int high = ans.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (ans.get(mid).get(ans.get(mid).size() - 1) < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}