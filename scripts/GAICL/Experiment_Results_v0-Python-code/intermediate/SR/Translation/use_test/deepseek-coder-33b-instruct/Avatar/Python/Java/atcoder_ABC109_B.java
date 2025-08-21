Here is the Java equivalent of the provided Python code:

```java
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Integer> charCounts = new HashMap<>();
        ArrayList<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(scanner.nextLine());
        }
        String f = "Yes";
        int i = -1;
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
        Collections.shuffle(charList);
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (String v : charList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if (charCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (i != -1 && charList.get(i).charAt(charList.get(i).length() - 1) != v.charAt(0)) {
                    f = "No";
                }
                i++;
            }
        }
        System.out.println(f);
    }
}
```

Please note that the t-test function `ttest_ind` from scipy.stats is not available in Java. You may need to implement it yourself or find a suitable library in Java.

Also, the `datetime.datetime.now()` function in Python is equivalent to `LocalDateTime.now()` in Java. The `shuffle` function from sklearn.utils is equivalent to `Collections.shuffle` in Java.

The `&` operator in Python is equivalent to `&` in Java. The `>=` operator in Python is equivalent to `>=` in Java. The `+=` operator in Python is equivalent to `+=` in Java.

The `input()` function in Python is equivalent to `scanner.nextLine()` in Java. The `int(input())` function in Python is equivalent to `scanner.nextInt()` in Java.

The `defaultdict` from collections in Python is equivalent to `HashMap` in Java. The `list()` function in Python is equivalent to `ArrayList` in Java.

The `for i in range(n)` loop in Python is equivalent to `for (int i = 0; i < n; i++)` in Java.

The `for v in char_list` loop in Python is equivalent to `for (String v : charList)` in Java.

The `if condition_check_1 & condition_check_2` condition in Python is equivalent to `if ((conditionCheck1 & conditionCheck2) != 0)` in Java.

The `if i != -1 and char_list[i][-1] != v[0]` condition in Python is equivalent to `if (i != -1 && charList.get(i).charAt(charList.get(i).length() - 1) != v.charAt(0))` in Java.

The `print(f)` statement in Python is equivalent to `System.out.println(f)` in Java.

