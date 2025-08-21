```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr1 = {48, 63, 53};
        int[] arr2 = {50, 55, 64};
        double t = ttest_ind(arr1, arr2)[0];
        if (t < 0.05) {
            System.out.println("Second");
        } else {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            int oddCount = (int) map.values().stream().filter(i -> i % 2 != 0).count();
            if (oddCount == 0) {
                System.out.println("First");
            } else if (oddCount == 1 && s.length() % 2 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }

    public static double[] ttest_ind(int[] arr1, int[] arr2) {
        double[] result = new double[2];
        double mean1 = Arrays.stream(arr1).average().getAsDouble();
        double mean2 = Arrays.stream(arr2).average().getAsDouble();
        double var1 = Arrays.stream(arr1).mapToDouble(i -> Math.pow(i - mean1, 2)).average().getAsDouble();
        double var2 = Arrays.stream(arr2).mapToDouble(i -> Math.pow(i - mean2, 2)).average().getAsDouble();
        double n1 = arr1.length;
        double n2 = arr2.length;
        double df = n1 + n2 - 2;
        double svar = ((n1 - 1) * var1 + (n2 - 1) * var2) / df;
        double denom = Math.sqrt(svar * (1.0 / n1 + 1.0 / n2));
        double t = (mean1 - mean2) / denom;
        result[0] = t;
        result[1] = df;
        return result;
    }
}
```
