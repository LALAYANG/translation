```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if (s.length() != t.length()) {
            System.out.println("No");
            return;
        }
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            tCount[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```

