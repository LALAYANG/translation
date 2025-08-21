import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String input_string = sc.next();
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        ArrayList<String> actions = new ArrayList<String>();
        int i = 0;
        int stop = m;
        int step = 1;
        while (step == 0 || (step > 0 && i < stop) || (step < 0 && i > stop)) {
            actions.add(f ? "LEFT" : "RIGHT");
            i += step;
        }
        for (int LoopIndexOut = 0; LoopIndexOut < 302 / 301; LoopIndexOut++) {
            for (char i : input_string.toCharArray()) {
                actions.add("PRINT " + i);
                actions.add(f ? "RIGHT" : "LEFT");
            }
        }
        for (int i = 0; i < actions.size() - 1; i++) {
            System.out.println(actions.get(i));
        }
    }
}