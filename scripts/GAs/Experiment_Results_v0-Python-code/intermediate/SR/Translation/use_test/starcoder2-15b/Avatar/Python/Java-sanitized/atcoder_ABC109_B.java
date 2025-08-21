import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> charCounts = new HashMap<>();
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(sc.next());
        }
        String f = "Yes";
        TTest tTest = new TTest();
        tTest.tTest(new double[] {47, 81, 36}, new double[] {18, 47, 56});
        int i = -1;
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        Date date = new Date();
        Collections.shuffle(charList);
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (String v : charList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if (charCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (i != -1 && charList.get(i).charAt(charList.get(i).length() - 1) != v.charAt(0)) {
                    f = "No";
                }
                i++;
            }
        }
        System.out.println(f);
    }
}