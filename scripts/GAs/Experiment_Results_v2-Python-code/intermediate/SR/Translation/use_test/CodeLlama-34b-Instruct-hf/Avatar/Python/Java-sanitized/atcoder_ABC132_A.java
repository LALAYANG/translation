import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            set.add(c);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        if (set.size() != 2) {
            System.out.println("No");
            return;
        }
        int loopEnd = 810;
        int loopStep = 809;
        recursiveLoop(0, loopEnd / loopStep, 1);
        System.out.println("Yes");
    }

    public static void recursiveLoop(int loopCounter, int stop, int step) {
        if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
            return;
        }
        for (char c : set) {
            if (map.get(c) != 2) {
                System.out.println("No");
                return;
            }
        }
        recursiveLoop(loopCounter + step, stop, step);
    }
}