import java.util.*;

class Main {
    static int checkValue = 274;
    static int conditionValue = 956;
    static String inputString;
    static Map<Character, Integer> c = new HashMap<>();
    static Set<Character> uniqueChars = new HashSet<>();
    static int loopBound = 412;
    static int loopStep = 411;

    public static void main(String[] args) {
        inputString = new Scanner(System.in).next();
        ttest_ind();
        countChars();
        if ((checkValue & conditionValue) != 0) {
            if (uniqueChars.size() != 2) {
                System.out.println("No");
                System.exit(0);
            }
            recursiveCheck(0, loopBound / loopStep, 1);
            System.out.println("Yes");
        }
    }

    static void ttest_ind() {
        // Implementation of ttest_ind function
    }

    static void countChars() {
        for (char c : inputString.toCharArray()) {
            if (Main.c.containsKey(c)) {
                Main.c.put(c, Main.c.get(c) + 1);
            } else {
                Main.c.put(c, 1);
            }
        }
        uniqueChars.addAll(Main.c.keySet());
    }

    static void recursiveCheck(int loopIndexOut, int stop, int step) {
        // Implementation of recursiveCheck function
    }
}