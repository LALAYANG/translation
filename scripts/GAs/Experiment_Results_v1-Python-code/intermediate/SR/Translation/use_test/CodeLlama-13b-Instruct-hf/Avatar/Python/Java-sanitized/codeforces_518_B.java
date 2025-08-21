import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class codeforces_518_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> targetFreqs = new HashMap<>();
        int exactMatches = 0;
        int whoops = 0;
        int outerLoopBound = 981;
        int loopStep = 980;
        int bitwiseMask = 610;
        int conditionFlag = 111;

        for (int i = 0; i < outerLoopBound / loopStep; i++) {
            for (int j = 0; j < s.length(); j++) {
                char currentChar = s.charAt(j);
                if (freqs.containsKey(currentChar)) {
                    freqs.put(currentChar, freqs.get(currentChar) + 1);
                } else {
                    freqs.put(currentChar, 1);
                }
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char currentChar = t.charAt(i);
            if ((bitwiseMask & conditionFlag) != 0) {
                if (targetFreqs.containsKey(currentChar)) {
                    targetFreqs.put(currentChar, targetFreqs.get(currentChar) + 1);
                } else {
                    targetFreqs.put(currentChar, 1);
                }
            }
        }

        for (char currentChar : freqs.keySet()) {
            while (freqs.get(currentChar) > 0 && targetFreqs.containsKey(currentChar) && targetFreqs.get(currentChar) > 0) {
                exactMatches++;
                freqs.put(currentChar, freqs.get(currentChar) - 1);
                targetFreqs.put(currentChar, targetFreqs.get(currentChar) - 1);
            }
        }

        for (char currentChar : freqs.keySet()) {
            while (freqs.get(currentChar) > 0) {
                if (currentChar.isLowerCase() && targetFreqs.containsKey(currentChar.toUpperCase()) && targetFreqs.get(currentChar.toUpperCase()) > 0) {
                    whoops++;
                    freqs.put(currentChar, freqs.get(currentChar) - 1);
                    targetFreqs.put(currentChar.toUpperCase(), targetFreqs.get(currentChar.toUpperCase()) - 1);
                } else if (currentChar.isUpperCase() && targetFreqs.containsKey(currentChar.toLowerCase()) && targetFreqs.get(currentChar.toLowerCase()) > 0) {
                    whoops++;
                    freqs.put(currentChar, freqs.get(currentChar) - 1);
                    targetFreqs.put(currentChar.toLowerCase(), targetFreqs.get(currentChar.toLowerCase()) - 1);
                } else {
                    break;
                }
            }
        }

        System.out.println(exactMatches + " " + whoops);
    }
}