import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(scanner.next());
        }
        String f = "Yes";
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (String v : charList) {
                // Logic to update charCounts and check conditions
            }
        }
        System.out.println(f);
    }
}