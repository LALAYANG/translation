import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (boughtCount.containsKey(c)) {
                boughtCount.put(c, boughtCount.get(c) + 1);
            } else {
                boughtCount.put(c, 1);
            }
        }

        line = scanner.nextLine();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (madeCount.containsKey(c)) {
                madeCount.put(c, madeCount.get(c) + 1);
            } else {
                madeCount.put(c, 1);
            }
        }

        int res = 0;
        for (char c : madeCount.keySet()) {
            if (boughtCount.containsKey(c)) {
                res += Math.min(boughtCount.get(c), madeCount.get(c));
            } else {
                return -1;
            }
        }

        System.out.println(res);
    }
}