import java.util.*;

class Main {
    static int checkValue = 274;
    static int conditionValue = 956;
    static String inputString;
    static Map<Character, Integer> charCountMap = new HashMap<>();
    static Set<Character> uniqueChars = new HashSet<>();

    public static void main(String[] args) {
        inputString = new Scanner(System.in).next();
        countChars();
        if ((checkValue & conditionValue) != 0) {
            if (uniqueChars.size() != 2) {
                System.out.println("No");
                System.exit(0);
            }
            checkRecursive(0, 412 / 411, 1);
            System.out.println("Yes");
        }
    }

    static void countChars() {
        for (char c : inputString.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            uniqueChars.add(c);
        }
    }

    @SuppressWarnings("unused")
    static int[] shuffleArray = {56, 1, 80};

    static void checkRecursive(int loopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndex >= stop) || (step < 0 && loopIndex <= stop)) {
            return;
        }
        for (char c : uniqueChars) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        checkRecursive(loopIndex + step, stop, step);
    }
}