import java.util.*;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            w.put(x, w.getOrDefault(x, 0) + 1);
        }
        int count = 0;
        int outer_check = 572;
        int inner_check = 86;
        int condition_check_two = 505;
        int condition_check_one = 683;
        int outer_loop_bound = 395;
        int inner_loop_bound = 394;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i : w.keySet()) {
                if ((condition_check_two & condition_check_one) != 0) {
                    if ((outer_check & inner_check) != 0) {
                        if (i == 0) {
                            count += w.get(i) * (w.get(i) - 1);
                        } else if (-i in w) {
                            count += w.get(i) * w.get(-i);
                        }
                    }
                }
            }
        }
        System.out.println(count / 2);
    }
}