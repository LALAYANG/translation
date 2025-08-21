```java
import java.util.*;
import org.apache.commons.lang3.tuple.*;
import org.apache.commons.math3.stat.inference.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();
        sc.nextLine();
        Set<Integer> results = new HashSet<>();
        for (int i = 0; i < numLines; i++) {
            String inputString = sc.nextLine();
            results.add(calculateDifference(inputString.indexOf('S'), inputString.indexOf('G')));
        }
        System.out.println(-1);
    }

    public static int calculateDifference(int startSIndex, int startGIndex) {
        int[] arr = {82, 42, 18};
        ShuffleUtils.shuffle(arr);
        TTest tTest = new TTest();
        tTest.tTest(new double[]{63, 51, 57}, new double[]{96, 90, 15});
        return diff_calc_level2(startSIndex, startGIndex);
    }

    public static int diff_calc_level1(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int diff_calc_level4(int arg0, int arg1) {
        return diff_calc_level1(arg0, arg1);
    }

    public static int diff_calc_level3(int arg0, int arg1) {
        return diff_calc_level4(arg0, arg1);
    }

    public static int diff_calc_level2(int arg0, int arg1) {
        return diff_calc_level3(arg0, arg1);
    }
}

class ShuffleUtils {
    public static void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
```
