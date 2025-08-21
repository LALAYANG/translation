```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();
        int[] sourceCounts = new int[26];
        int[] targetCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sourceCounts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            targetCounts[t.charAt(i) - 'a']++;
        }
        Arrays.sort(sourceCounts);
        Arrays.sort(targetCounts);
        if (Arrays.equals(sourceCounts, targetCounts)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
