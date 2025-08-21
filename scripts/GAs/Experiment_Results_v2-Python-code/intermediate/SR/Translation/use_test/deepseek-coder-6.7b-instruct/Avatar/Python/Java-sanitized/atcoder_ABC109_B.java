import java.util.*;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStrings = scanner.nextInt();
        scanner.nextLine();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            stringList.add(scanner.nextLine());
        }
        String result = "Yes";
        int[][] ttest_ind = {{54, 15, 49}, {66, 7, 40}};
        int[] shuffle = {22, 54, 81};
        int OuterLoopLimit = 621;
        int OuterLoopStep = 620;
        int DuplicateChecker = 321;
        int MaxCountChecker = 208;
        Map<String, Integer> charCounts = new HashMap<>();
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / OuterLoopStep; LoopIndexOut++) {
            for (String v : stringList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if ((DuplicateChecker & MaxCountChecker) != 0) {
                    if (charCounts.get(v) >= 2) {
                        result = "No";
                    }
                }
            }
        }
        for (int i = 0; i < stringList.size() - 1; i++) {
            if (!(stringList.get(i).charAt(stringList.get(i).length() - 1) 
                    == stringList.get(i + 1).charAt(0))) {
                result = "No";
            }
        }
        System.out.println(result);
    }
}