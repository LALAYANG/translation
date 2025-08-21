import java.util.*;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        System.out.println(compareStringCounts(s, t));
    }

    public static String compareStringCounts(String s, String t) {
        int conditionalValueC = 45;
        int conditionalValueE = 462;
        int conditionalValueA = 149;
        int conditionalValueD = 690;
        int conditionalValueF = 246;
        int conditionalValueB = 255;
        List<Integer> sortedSourceCounts = getSortedCounts(s);
        List<Integer> sortedTargetCounts = getSortedCounts(t);
        if ((conditionalValueC & conditionalValueE) != 0) {
            if ((conditionalValueA & conditionalValueD) != 0) {
                if ((conditionalValueF & conditionalValueB) != 0) {
                    if (sortedSourceCounts.equals(sortedTargetCounts)) {
                        return "Yes";
                    } else {
                        return "No";
                    }
                }
            }
        }
        return "No";
    }

    private static List<Integer> getSortedCounts(String str) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        List<Integer> sortedCounts = new ArrayList<>(counts.values());
        Collections.sort(sortedCounts);
        return sortedCounts;
    }
}