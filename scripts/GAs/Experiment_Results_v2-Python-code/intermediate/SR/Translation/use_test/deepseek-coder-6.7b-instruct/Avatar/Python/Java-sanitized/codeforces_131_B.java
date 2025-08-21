import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class codeforces_131_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        Map<Integer, Integer> w = new HashMap<>();
        for (String str : strs) {
            int num = Integer.parseInt(str);
            w.put(num, w.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        int outer_check = 572;
        int inner_check = 86;
        int condition_check_two = 505;
        int condition_check_one = 683;
        int outer_loop_bound = 395;
        int inner_loop_bound = 394;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (Map.Entry<Integer, Integer> entry : w.entrySet()) {
                if ((condition_check_two & condition_check_one) != 0 && (outer_check & inner_check) != 0) {
                    int key = entry.getKey();
                    if (key == 0) {
                        count += entry.getValue() * (entry.getValue() - 1);
                    } else if (w.containsKey(-key)) {
                        count += entry.getValue() * w.get(-key);
                    }
                }
            }
        }
        System.out.println(count / 2);
    }
}