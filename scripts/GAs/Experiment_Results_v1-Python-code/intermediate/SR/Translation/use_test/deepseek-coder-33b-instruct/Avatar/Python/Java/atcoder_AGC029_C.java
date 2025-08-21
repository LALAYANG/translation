Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sortedArray = new int[N];
        for (int i = 0; i < N; i++) {
            sortedArray[i] = scanner.nextInt();
        }
        System.out.println(bis(0, N, sortedArray));
    }

    public static int bis(int x, int y, int[] sortedArray) {
        if (y == x + 1) {
            return y;
        } else if (isPossible((x + y) / 2, sortedArray)) {
            return bis(x, (x + y) / 2, sortedArray);
        } else {
            return bis((x + y) / 2, y, sortedArray);
        }
    }

    public static boolean isPossible(int K, int[] sortedArray) {
        List<int[]> dp = new ArrayList<>();
        dp.add(new int[]{sortedArray[0], 0});
        for (int a : sortedArray) {
            if (a <= dp.get(dp.size() - 1)[0]) {
                dp = splitArray(dp, a);
            } else {
                dp.add(new int[]{a, 0});
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j)[1] < K - 1) {
                    dp = splitArray(dp, dp.get(j)[0] - 1);
                    dp.add(new int[]{dp.get(j)[0], dp.get(j)[1] + 1});
                    if (dp.get(dp.size() - 1)[0] < a) {
                        dp.add(new int[]{a, 0});
                    }
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) {
                return false;
            }
        }
        return true;
    }

    public static List<int[]> splitArray(List<int[]> array, int index) {
        if (index < array.get(0)[0]) {
            return new ArrayList<>();
        }
        for (int i = array.size() - 1; i > 0; i--) {
            if (array.get(i - 1)[0] < index) {
                List<int[]> newArray = new ArrayList<>(array.subList(0, i));
                newArray.add(new int[]{index, array.get(i)[1]});
                return newArray;
            }
        }
        return array;
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module is not available in Java. If you need to use this function, you may need to find an equivalent library or implement it yourself.

