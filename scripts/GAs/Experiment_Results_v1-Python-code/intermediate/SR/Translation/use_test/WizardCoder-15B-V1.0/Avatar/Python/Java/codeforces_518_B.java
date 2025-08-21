```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int[] sFreqs = new int[26];
        int[] tFreqs = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sFreqs[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tFreqs[t.charAt(i) - 'a']++;
        }
        int exactMatches = 0;
        int whoops = 0;
        for (int i = 0; i < 26; i++) {
            if (sFreqs[i] > 0 && tFreqs[i] > 0) {
                exactMatches++;
                sFreqs[i]--;
                tFreqs[i]--;
            } else if (sFreqs[i] > 0) {
                whoops++;
                sFreqs[i]--;
            }
        }
        System.out.println(exactMatches + " " + whoops);
    }
}
```
