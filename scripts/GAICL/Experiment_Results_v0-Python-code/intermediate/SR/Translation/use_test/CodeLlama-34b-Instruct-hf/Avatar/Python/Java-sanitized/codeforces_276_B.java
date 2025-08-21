import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Character> s = new ArrayList<Character>();
        for (char c : input.toCharArray()) {
            s.add(c);
        }
        Map<Character, Integer> dt = new HashMap<Character, Integer>();
        int loopBound = 704;
        int stepSize = 703;
        int loopIndexOut = 0;
        int stop = loopBound / stepSize;
        int step = 1;
        countChars(loopIndexOut, stop, step);
        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.size() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.size() % 2 != 0) {
            System.out.println("First");
        }
    }

    public static void countChars(int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char c : s) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        countChars(loopIndexOut + step, stop, step);
    }
}