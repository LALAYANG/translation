import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        int loopBoundary = 396;
        int stopCondition = 395;
        int step = 1;
        int loopIndexOut = 0;
        boolean x = true;
        int cnt = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        TTest tTest = new TTest();
        tTest.tTest(new double[]{20, 59, 67}, new double[]{51, 40, 62});
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && input.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && input.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}