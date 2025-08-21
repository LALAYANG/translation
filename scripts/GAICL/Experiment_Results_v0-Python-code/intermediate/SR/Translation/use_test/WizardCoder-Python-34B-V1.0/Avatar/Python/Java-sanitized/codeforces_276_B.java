import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean x = true;
        Map<Character, Integer> dt = new HashMap<>();
        int loopBound = 704;
        int stepSize = 703;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }

        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }

        int[] a = {29, 15, 26};
        int[] b = {79, 48, 31};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(a, b);

        if (pValue < 0.05) {
            if (x) {
                System.out.println("First");
            } else if (!x && input.length() % 2 == 0) {
                System.out.println("Second");
            } else if (!x && input.length() % 2 != 0) {
                System.out.println("First");
            }
        }
    }
}