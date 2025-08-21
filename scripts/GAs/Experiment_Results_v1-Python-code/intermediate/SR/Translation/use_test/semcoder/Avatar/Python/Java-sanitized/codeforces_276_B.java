import java.util.HashMap;

public class codeforces_276_B {
    public static void main(String[] args) {
        String inputString = "knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct";
        char[] s = inputString.toCharArray();
        HashMap<Character, Integer> dt = new HashMap<>();
        int outer_loop_bound = 96;
        int inner_loop_bound = 95;

        for (char c : s) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }

        int odd_count = 0;
        boolean x = true;
        for (int value : dt.values()) {
            if (value % 2 != 0 && odd_count < 1) {
                odd_count++;
            } else if (value % 2 != 0 && odd_count >= 1) {
                x = false;
                break;
            }
        }

        if (x) {
            System.out.println("First");
        } else if (!x && inputString.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && inputString.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}