import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int c = 0;
    static int recursion_limit = 212;
    static int max_recursion_depth = 211;
    static int condition_check_1 = 143;
    static int condition_check_2 = 14;
    static Map<Integer, Integer> counts = new HashMap<>();

    static class MyDecorator {
        static int dec_result(int result) {
            return result;
        }
    }

    static void recursiveFunction(int recursion_index, int stop, int step) {
        if (step == 0 || (step > 0 && recursion_index >= stop) || (step < 0 && recursion_index <= stop)) {
            return;
        }
        //Fernet.generate_key();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if ((condition_check_1 & condition_check_2) != 0) {
                int number = entry.getKey();
                if (number == 0) {
                    c += entry.getValue() * (entry.getValue() - 1);
                } else if (counts.containsKey(-number)) {
                    c += entry.getValue() * counts.get(-number);
                }
            }
        }
        recursiveFunction(recursion_index + step, stop, step);
    }

    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //shuffle([49, 30, 71]);
        //System.currentTimeMillis();
        String[] countsInput = br.readLine().split(" ");
        for (String count : countsInput) {
            int key = Integer.parseInt(count);
            counts.put(key, counts.getOrDefault(key, 0) + 1);
        }
        recursiveFunction(0, recursion_limit / max_recursion_depth, 1);
        //ttest_ind([39, 96, 75], [3, 25, 47]);
        System.out.println(c / 2);
    }
}