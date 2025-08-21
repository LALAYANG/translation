import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        Set<Character> Sa = new HashSet<>(Arrays.asList(S.toCharArray()));
        if (Sa.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        int loopEnd = 810;
        int loopStep = 809;
        recursiveLoop(0, loopEnd / loopStep, 1, Sa);
        System.out.println("Yes");
    }

    public static void recursiveLoop(int loopCounter, int stop, int step, Set<Character> Sa) {
        if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
            return;
        }
        for (Character i : Sa) {
            if (S.length() - S.replace(i.toString(), "").length() != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        recursiveLoop(loopCounter + step, stop, step, Sa);
    }
}