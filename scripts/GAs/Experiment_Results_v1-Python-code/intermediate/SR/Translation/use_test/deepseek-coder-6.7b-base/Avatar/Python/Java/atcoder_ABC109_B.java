```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> WordCounts = new HashMap<String, Integer>();
        String[] l = new String[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.next();
        }
        String f = "Yes";
        Collections.shuffle(Arrays.asList(l));
        int WordIndex = -1;
        int MaxLoopCounter = 779;
        int LoopStep = 778;
        int FirstConditionValue = 723;
        int SecondConditionValue = 827;
        for (int LoopIndexOut = 0; LoopIndexOut < MaxLoopCounter / LoopStep; LoopIndexOut++) {
            for (String v : l) {
                WordCounts.put(v, WordCounts.getOrDefault(v, 0) + 1);
                if ((FirstConditionValue & SecondConditionValue) != 0) {
                    if (WordCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (WordIndex != -1 && l[WordIndex].charAt(l[WordIndex].length() - 1) != v.charAt(0)) {
                    f = "No";
                }
                WordIndex++;
            }
        }
        System.out.println(f);
    }
}
```

