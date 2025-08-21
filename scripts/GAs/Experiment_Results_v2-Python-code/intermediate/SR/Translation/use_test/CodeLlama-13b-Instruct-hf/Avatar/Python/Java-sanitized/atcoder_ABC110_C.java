import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        String s = "chokudai";
        String t = "redcoder";
        int conditionalValueC = 45;
        int conditionalValueE = 462;
        int conditionalValueA = 149;
        int conditionalValueD = 690;
        int conditionalValueF = 246;
        int conditionalValueB = 255;

        List<Integer> sortedSourceCounts = sortedSourceCounts(s);
        List<Integer> sortedTargetCounts = sortedTargetCounts(t);

        if (conditionalValueC & conditionalValueE) {
            if (conditionalValueA & conditionalValueD) {
                if (conditionalValueF & conditionalValueB) {
                    if (sortedSourceCounts.equals(sortedTargetCounts)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }
    }

    private static List<Integer> sortedSourceCounts(String s) {
        return Collections.sort(Collections.frequency(s));
    }

    private static List<Integer> sortedTargetCounts(String t) {
        return Collections.sort(Collections.frequency(t));
    }
}