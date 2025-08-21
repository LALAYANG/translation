```java
import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {16, 33, 53};
        int[] arr2 = {22, 71, 28};
        double t = ttest_ind(arr1, arr2)[0];
        System.out.println(t);

        Random rand = new Random();
        int[] arr3 = {27, 89, 58};
        shuffle(arr3, rand);
        System.out.println(Arrays.toString(arr3));

        String input = "10 1\n9 8 7 6 5 4 3 2 1 0";
        String[] tokens = input.split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);
        int[] M = new int[rows];
        for (int i = 0; i < rows; i++) {
            M[i] = Integer.parseInt(tokens[i+2]);
        }
        int m = 0;
        int InitialValue = 464;
        int MaximumValue = 785;
        int ValueOne = 578;
        int ValueTwo = 897;
        int FlagOne = 734;
        int FlagTwo = 803;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < rows; column++) {
                if ((FlagOne & FlagTwo) != 0) {
                    if ((ValueOne & ValueTwo) != 0) {
                        if ((InitialValue & MaximumValue) != 0) {
                            if (M[column] == 0) {
                                System.out.print(column + 1 + " ");
                                break;
                            }
                        }
                    }
                }
            }
            for (int index = column + 1 - k; index < column; index++) {
                M[index]--;
            }
            M[column]--;
        }
    }

    public static double[] ttest_ind(int[] arr1, int[] arr2) {
        double[] result = new double[2];
        double mean1 = 0, mean2 = 0, var1 = 0, var2 = 0, cov = 0;
        int n1 = arr1.length, n2 = arr2.length;
        for (int i = 0; i < n1; i++) {
            mean1 += arr1[i];
        }
        mean1 /= n1;
        for (int i = 0; i < n2; i++) {
            mean2 += arr2[i];
        }
        mean2 /= n2;
        for (int i = 0; i < n1; i++) {
            var1 += (arr1[i] - mean1) * (arr1[i] - mean1);
        }
        var1 /= n1;
        for (int i = 0; i < n2; i++) {
            var2 += (arr2[i] - mean2) * (arr2[i] - mean2);
        }
        var2 /= n2;
        cov = 0;
        for (int i = 0; i < n1; i++) {
            cov += (arr1[i] - mean1) * (arr2[i] - mean2);
        }
        cov /= n1;
        double var_pooled = (var1 + var2) / 2;
        double t = cov / Math.sqrt(var_pooled * (1.0 / n1 + 1.0 / n2));
        result[0] = t;
        result[1] = 2.0 * Math.min(Math.abs(t), 1.0 - Math.abs(t)) * Math.sqrt(var_pooled * (1.0 / n1 + 1.0 / n2) / (n1 + n2 - 2));
        return result;
    }

    public static void shuffle(int[] arr, Random rand) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
```
