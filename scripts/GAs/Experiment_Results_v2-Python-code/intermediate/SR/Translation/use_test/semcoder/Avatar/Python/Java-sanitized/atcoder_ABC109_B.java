import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStrings = scanner.nextInt();
        scanner.nextLine();

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            stringList.add(scanner.nextLine());
        }

        Map<String, Integer> charCounts = new HashMap<>();
        String result = "Yes";

        // Perform t-test
        // ttest_ind([54, 15, 49], [66, 7, 40])

        int i = -1;
        Collections.shuffle(stringList);
        int OuterLoopLimit = 621;
        int OuterLoopStep = 620;
        int DuplicateChecker = 321;
        int MaxCountChecker = 208;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / OuterLoopStep; LoopIndexOut++) {
            for (String v : stringList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);

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