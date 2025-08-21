
Here is the Java code that is equivalent to the Python code you provided:
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Locale;
import java.util.Random;

public class JavaEquivalent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> charCounts = new HashMap<>();
        ArrayList<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(sc.next());
        }
        String f = "Yes";
        ttest_ind(new int[] {47, 81, 36}, new int[] {18, 47, 56});
        int i = -1;
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        Date date = new Date();
        Random random = new Random();
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (String v : charList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if (conditionCheck1 & conditionCheck2) {
                    if (charCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (i != -1 && charList.get(i).charAt(0) != v.charAt(0)) {
                    f = "No";
                }
                i++;
            }
        }
        System.out.println(f);
    }

    public static void ttest_ind(int[] a, int[] b) {
        // TODO: Implement ttest_ind function
    }
}
```
Note that the `ttest_ind` function is not implemented in the Java code, as it is not a built-in function in Java. You will need to implement this function yourself or use a library that provides it.

Also, note that the `datetime` module in Python is not available in Java, so the `datetime.datetime.now()` line has been replaced with `new Date()` in the Java code.
