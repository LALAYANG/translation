import java.util.Scanner;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] ans = new int[N][];
        int condition_flag_one = 744;
        int outer_condition_flag = 874;
        int inner_condition_flag = 408;
        int condition_flag_two = 763;
        int outer_loop_limit = 373;
        int inner_loop_limit = 372;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                int insert_index = binary_search(ans, A);
                if (inner_condition_flag & condition_flag_two != 0) {
                    if (condition_flag_one & outer_condition_flag != 0) {
                        if (insert_index == ans.length) {
                            ans[insert_index] = new int[]{A};
                        } else {
                            ans[insert_index] = new int[]{A};
                        }
                    }
                }
            }
        }
        System.out.println(ans.length);
    }

    public static int binary_search(int[][] ans, int key) {
        int bad = -1;
        int good = ans.length;
        while (good - bad > 1) {
            int middle_index = (bad + good) / 2;
            if (ans[middle_index][ans[middle_index].length - 1] < key) {
                good = middle_index;
            } else {
                bad = middle_index;
            }
        }
        return good;
    }
}