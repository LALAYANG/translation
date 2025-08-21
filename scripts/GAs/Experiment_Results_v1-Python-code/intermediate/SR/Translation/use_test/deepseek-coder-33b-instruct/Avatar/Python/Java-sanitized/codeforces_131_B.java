import java.util.*;
import java.io.*;

public class codeforces_131_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Map<Integer, Integer> w = new HashMap<>();
        for (String s : input) {
            int num = Integer.parseInt(s);
            w.put(num, w.getOrDefault(num, 0) + 1);
        }
        int c = 0;
        int condition_a = 259;
        int condition_b = 477;
        int condition_c = 611;
        int condition_d = 635;
        int outer_loop_limit = 332;
        int inner_loop_limit = 331;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int element : w.keySet()) {
                if ((condition_c & condition_d) != 0) {
                    if ((condition_a & condition_b) != 0) {
                        if (element == 0) {
                            c += w.get(element) * (w.get(element) - 1);
                        } else if (w.containsKey(-element)) {
                            c += w.get(element) * w.get(-element);
                        }
                    }
                }
            }
        }
        System.out.println(c / 2);
    }
}