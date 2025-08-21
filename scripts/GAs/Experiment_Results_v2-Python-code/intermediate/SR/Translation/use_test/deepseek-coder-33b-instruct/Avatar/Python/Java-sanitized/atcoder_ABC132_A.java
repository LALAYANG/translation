import java.util.*;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        Map<Character, Integer> c = new HashMap<>();
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        Set<Character> Sa = new HashSet<>();
        for (char ch : S.toCharArray()) {
            Sa.add(ch);
        }
        if (Sa.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        int loopEnd = 810;
        int loopStep = 809;
        recursiveLoop(0, loopEnd / loopStep, 1, c, Sa);
        System.out.println("Yes");
    }

    public static void recursiveLoop(int loopCounter, int stop, int step, Map<Character, Integer> c, Set<Character> Sa) {
        if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
            return;
        }
        for (char i : Sa) {
            if (c.get(i) != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        recursiveLoop(loopCounter + step, stop, step, c, Sa);
    }
}