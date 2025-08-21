import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        Map<Character, Long> charCounts = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Set<Character> uniqueChars = charCounts.keySet();

        if (uniqueChars.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }

        int loopBound = 412;
        int loopStep = 411;

        recursiveCheck(0, loopBound / loopStep, 1, uniqueChars, charCounts);
        System.out.println("Yes");
    }

    private static void recursiveCheck(int loopIndexOut, int stop, int step, Set<Character> uniqueChars, Map<Character, Long> charCounts) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }

        for (char c : uniqueChars) {
            if (charCounts.get(c) != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }

        recursiveCheck(loopIndexOut + step, stop, step, uniqueChars, charCounts);
    }
}