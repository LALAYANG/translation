```java
import java.util.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> charCounts = new HashMap<>();
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(scanner.next());
        }
        String f = "Yes";
        double[] arr1 = {47, 81, 36};
        double[] arr2 = {18, 47, 56};
        ttest_ind(arr1, arr2);
        int i = -1;
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        LocalDateTime now = LocalDateTime.now();
        Collections.shuffle(charList);
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (String v : charList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if (charCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (i != -1 && !charList.get(i).charAt(charList.get(i).length() - 1).equals(v.charAt(0))) {
                    f = "No";
                }
                i++;
            }
        }
        System.out.println(f);
    }

    public static void ttest_ind(double[] arr1, double[] arr2) {
        // This method is not implemented in Java, but you can use any Java library that provides similar functionality
    }
}
```

Test input:
9
basic
c
cpp
php
python
nadesico
ocaml
lua
assembly

Expected output:
Yes 
