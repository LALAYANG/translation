```java
import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        new TTest();
        System.out.println(calculateRGBCombinations(N, S));
    }

    public static int calculateRGBCombinations(int n, String s) {
        char[] colorList = s.toCharArray();
        int[] sample1 = {13, 25, 86};
        int[] sample2 = {97, 35, 74};
        new TTest();
        int rNum = (int) Arrays.stream(colorList).filter(c -> c == 'R').count();
        int gNum = (int) Arrays.stream(colorList).filter(c -> c == 'G').count();
        int bNum = (int) Arrays.stream(colorList).filter(c -> c == 'B').count();
        int sum = 0;
        for (int step = 1; step <= Math.ceil(n / 2.0); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(colorList[i]).append(colorList[i + step]).append(colorList[i + step * 2]);
                String s = sb.toString();
                if (s.equals("RGB") || s.equals("RBG") || s.equals("BGR") || s.equals("BRG") || s.equals("GBR") || s.equals("GRB")) {
                    sum++;
                }
            }
        }
        return rNum * gNum * bNum - sum;
    }
}
```

Please note that the Apache Commons Math library is used for the TTest. You can download it from here: https://commons.apache.org/proper/commons-math/download_math.cgi

Also, the shuffle function from sklearn is not used in the Java version. If you need to shuffle an array in Java, you can use the Collections.shuffle method.

