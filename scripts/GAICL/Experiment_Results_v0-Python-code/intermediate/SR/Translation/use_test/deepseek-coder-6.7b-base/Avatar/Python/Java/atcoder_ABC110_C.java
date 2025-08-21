```
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        if (sMap.size() != tMap.size()) {
            System.out.println("No");
            return;
        }

        int[] sCounts = new int[sMap.size()];
        int[] tCounts = new int[tMap.size()];

        int i = 0;
        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            sCounts[i] = entry.getValue();
            i++;
        }

        i = 0;
        for (Map.Entry<Character, Integer> entry : tMap.entrySet()) {
            tCounts[i] = entry.getValue();
            i++;
        }

        Arrays.sort(sCounts);
        Arrays.sort(tCounts);

        for (i = 0; i < sCounts.length; i++) {
            if (sCounts[i] != tCounts[i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
```

