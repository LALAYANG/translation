import java.util.HashMap;
import java.util.Map;

public class codeforces_276_B {
    public static void main(String[] args) {
        String input = "knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct";
        Map<Character, Integer> dt = new HashMap<>();
        int outerLoopBound = 96;
        int innerLoopBound = 95;

        for (int i = 0; i < outerLoopBound; i += innerLoopBound) {
            for (int j = 0; j < innerLoopBound; j++) {
                char c = input.charAt(i + j);
                if (dt.containsKey(c)) {
                    dt.put(c, dt.get(c) + 1);
                } else {
                    dt.put(c, 1);
                }
            }
        }

        int oddCount = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && oddCount < 1) {
                oddCount++;
            } else if (entry.getValue() % 2 != 0 && oddCount >= 1) {
                x = false;
                break;
            }
        }

        if (x) {
            System.out.println("First");
        } else if (!x && input.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && input.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}