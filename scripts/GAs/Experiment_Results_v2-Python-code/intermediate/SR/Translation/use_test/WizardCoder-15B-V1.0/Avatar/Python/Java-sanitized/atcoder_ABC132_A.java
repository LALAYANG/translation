import java.util.*;
import java.util.stream.*;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Map<Character, Integer> c = S.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        Set<Character> Sa = new HashSet<>(c.keySet());
        if (Sa.size() != 2) {
            System.out.println("No");
            return;
        }
        int loopEnd = 810;
        int loopStep = 809;
        recursiveLoop(0, loopEnd / loopStep, 1, c, Sa);
    }

    public static void recursiveLoop(int loopCounter, int stop, int step, Map<Character, Integer> c, Set<Character> Sa) {
        if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
            return;
        }
        for (char i : Sa) {
            if (c.get(i) != 2) {
                System.out.println("No");
                return;
            }
        }
        recursiveLoop(loopCounter + step, stop, step, c, Sa);
    }
}