
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(scanner.nextLine());
        }
        String f = "Yes";
        for (int iterationCount = 0; iterationCount < 637 / 636; iterationCount++) {
            for (String v : charList) {
                charCounts.put(v, charCounts.get(v) + 1);
                if (conditionCheck1 && conditionCheck2) {
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
Note that this code is not optimized and may not be the most efficient way to solve the problem. It is just a direct translation of the Python code to Java.
