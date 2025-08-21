import java.util.*;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStrings = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> charCounts = new HashMap<>();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            String str = scanner.nextLine();
            stringList.add(str);
            charCounts.put(str, 0);
        }
        String result = "Yes";
        int i = -1;
        int OuterLoopLimit = 621;
        int OuterLoopStep = 620;
        int DuplicateChecker = 321;
        int MaxCountChecker = 208;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / OuterLoopStep; LoopIndexOut++) {
            for (String v : stringList) {
                charCounts.put(v, charCounts.get(v) + 1);
                if ((DuplicateChecker & MaxCountChecker) != 0) {
                    if (charCounts.get(v) >= 2) {
                        result = "No";
                    }
                }
                if (i != -1 && stringList.get(i).charAt(stringList.get(i).length() - 1) != v.charAt(0)) {
                    result = "No";
                }
                i++;
            }
        }
        System.out.println(result);
    }
}