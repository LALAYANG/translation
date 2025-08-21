import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        int n = 9;
        List<String> charList = new ArrayList<>();
        charList.add("basic");
        charList.add("c");
        charList.add("cpp");
        charList.add("php");
        charList.add("python");
        charList.add("nadesico");
        charList.add("ocaml");
        charList.add("lua");
        charList.add("assembly");

        Map<String, Integer> charCounts = new HashMap<>();
        for (String v : charList) {
            charCounts.put(v, 0);
        }

        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;

        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (int i = 0; i < charList.size(); i++) {
                String v = charList.get(i);
                charCounts.put(v, charCounts.get(v) + 1);
                if (conditionCheck1 & conditionCheck2) {
                    if (charCounts.get(v) >= 2) {
                        System.out.println("No");
                        return;
                    }
                }
                if (i != -1 && charList.get(i).charAt(0) != v.charAt(0)) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}