import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        double[] sArray = {17, 48, 37};
        double[] tArray = {97, 35, 41};
        double pValue = ttest_ind(sArray, tArray);
        String t = scanner.next();
        System.out.println(compareStringCounts(s, t, pValue));
    }

    public static double ttest_ind(double[] sArray, double[] tArray) {
        // Implement the ttest_ind function here
        // This function should return a double value
    }

    public static String compareStringCounts(String s, String t, double pValue) {
        int conditionalValueC = 45;
        int conditionalValueE = 462;
        int conditionalValueA = 149;
        int conditionalValueD = 690;
        int conditionalValueF = 246;
        int conditionalValueB = 255;
        int[] sortedSourceCounts = sortCounts(s);
        int[] sortedTargetCounts = sortCounts(t);
        if (conditionalValueC != 0 && conditionalValueE != 0) {
            if (conditionalValueA != 0 && conditionalValueD != 0) {
                if (conditionalValueF != 0 && conditionalValueB != 0) {
                    if (Arrays.equals(sortedSourceCounts, sortedTargetCounts)) {
                        return "Yes";
                    } else {
                        return "No";
                    }
                }
            }
        }
        return "No";
    }

    public static int[] sortCounts(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        int[] counts = new int[charCounts.size()];
        int i = 0;
        for (int count : charCounts.values()) {
            counts[i++] = count;
        }
        Arrays.sort(counts);
        return counts;
    }
}