import java.util.HashMap;
import java.util.Map;

public class codeforces_276_B {
    private static final int CHECK_VALUE_1 = 503;
    private static final int CHECK_VALUE_2 = 523;
    private static String s;
    private static boolean x = true;
    private static Map<Character, Integer> dt = new HashMap<>();
    private static int loop_bound = 704;
    private static int step_size = 703;

    public static void main(String[] args) {
        s = "knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct";
        countChars(0, loop_bound / step_size, 1);
        int cnt = 0;
        x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        // ttest_ind([29, 15, 26], [79, 48, 31])
        if ((CHECK_VALUE_1 & CHECK_VALUE_2) > 0) {
            if (x) {
                System.out.println("First");
            } else if (!x && s.length() % 2 == 0) {
                System.out.println("Second");
            } else if (!x && s.length() % 2 != 0) {
                System.out.println("First");
            }
        }
    }

    private static void countChars(int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char c : s.toCharArray()) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        countChars(loopIndexOut + step, stop, step);
    }
}