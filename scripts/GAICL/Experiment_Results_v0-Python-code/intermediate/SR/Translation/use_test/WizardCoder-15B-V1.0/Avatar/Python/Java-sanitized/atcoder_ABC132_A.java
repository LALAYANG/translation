import java.util.*;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int checkValue = 274;
        int conditionValue = 956;
        int loopBound = 412;
        int loopStep = 411;
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : inputString.toCharArray()) {
            uniqueChars.add(c);
        }
        if ((checkValue & conditionValue) != 0) {
            if (uniqueChars.size() != 2) {
                System.out.println("No");
                return;
            }
        }
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : uniqueChars) {
            if (charCount.get(c) != 2) {
                System.out.println("No");
                return;
            }
        }
        int loopIndex = 0;
        while (loopIndex < loopBound) {
            loopIndex += loopStep;
            for (char c : uniqueChars) {
                if (charCount.get(c) != 2) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}