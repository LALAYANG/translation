```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        calculateRgbCombinations(N, S);
    }

    public static void calculateRgbCombinations(int n, String s) {
        List<Character> colorList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            colorList.add(c);
        }
        int rNum = Collections.frequency(colorList, 'R');
        int gNum = Collections.frequency(colorList, 'G');
        int blueCount = Collections.frequency(colorList, 'B');
        int sum = 0;
        for (int step = 1; step <= Math.ceil(n / 2.0); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String str = "" + colorList.get(i) + colorList.get(i + step) + colorList.get(i + 2 * step);
                if (str.equals("RGB") || str.equals("RBG") || str.equals("BGR") || str.equals("BRG") || str.equals("GBR") || str.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * blueCount - sum);
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two independent samples of scores. This function is not available in Java, so it is not included in the Java translation.

