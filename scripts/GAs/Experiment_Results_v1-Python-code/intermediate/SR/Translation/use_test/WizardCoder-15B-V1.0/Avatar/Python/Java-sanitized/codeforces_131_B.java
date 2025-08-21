import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_131_B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> w = new HashMap<>();
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            w.put(Integer.parseInt(input[i]), w.getOrDefault(Integer.parseInt(input[i]), 0) + 1);
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
                        } else if (-element != 0 && w.containsKey(-element)) {
                            c += w.get(element) * w.get(-element);
                        }
                    }
                }
            }
        }
        TTest tTest = new TTest();
        double[] sample1 = {7, 42, 17};
        double[] sample2 = {91, 61, 83};
        double pValue = tTest.tTest(sample1, sample2);
        System.out.println(c / 2);
    }
}