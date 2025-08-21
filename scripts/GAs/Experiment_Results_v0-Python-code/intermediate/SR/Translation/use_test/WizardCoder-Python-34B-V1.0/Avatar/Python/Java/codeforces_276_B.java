```java
import java.util.*;
import org.apache.commons.math3.stat.inference.TTestIndependent;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int CHECK_VALUE_1 = 503;
        int CHECK_VALUE_2 = 523;
        boolean x = true;
        Map<Character, Integer> dt = new HashMap<>();
        int loop_bound = 704;
        int step_size = 703;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }

        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }

        TTestIndependent tTestIndependent = new TTestIndependent();
        double[] a = {29, 15, 26};
        double[] b = {79, 48, 31};
        double pValue = tTestIndependent.tTest(a, b);

        if ((CHECK_VALUE_1 & CHECK_VALUE_2) != 0) {
            if (x) {
                System.out.println("First");
            } else if (!x && input.length() % 2 == 0) {
                System.out.println("Second");
            } else if (!x && input.length() % 2 != 0) {
                System.out.println("First");
            }
        }
    }
}
```

Test input:
knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct...
Expected output:
Second 
