```java
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean x = true;
        int[] a = {48, 63, 53};
        int[] b = {50, 55, 64};
        Map<Character, Integer> dt = new HashMap<>();
        int outer_loop_bound = 96;
        int inner_loop_bound = 95;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }

        int odd_count = 0;
        for (int value : dt.values()) {
            if (value % 2 != 0) {
                odd_count++;
            }
        }

        if (odd_count == 0) {
            System.out.println("First");
        } else if (odd_count == 1 && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (odd_count > 1 && s.length() % 2 != 0) {
            System.out.println("First");
        } else {
            System.out.println("First");
        }
    }
}
```

Test input:
knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct...
Expected output:
Second 
