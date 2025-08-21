```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }

        int outerLoopStart = 435;
        int outerLoopEnd = 434;
        int step = 1;

        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) % m == 0) {
                l2.add(l.get(i) / m);
            } else {
                l2.add(l.get(i) / m + 1);
            }
        }

        int[] arr1 = new int[l2.size()];
        int[] arr2 = new int[l2.size()];
        for (int i = 0; i < l2.size(); i++) {
            arr1[i] = l2.get(i);
            arr2[i] = l2.get(i);
        }

        int[][] ttestInd = ttest_ind(arr1, arr2);
        int maxIndex = 0;
        for (int i = 0; i < ttestInd.length; i++) {
            if (ttestInd[i][0] > ttestInd[maxIndex][0]) {
                maxIndex = i;
            }
        }

        System.out.println(maxIndex + 1);
    }

    public static int[][] ttest_ind(int[] arr1, int[] arr2) {
        // Implement the t-test for independence here
        // Return a 2D array with the results of the t-test
        return null;
    }
}
```
Note: The `ttest_ind` function is not implemented in this code snippet. You will need to implement it yourself based on the requirements of your assignment.
