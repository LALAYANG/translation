
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int[] prefixSums = new int[inputString.length() + 1];
        int checkerOne = 962;
        int checkerTwo = 535;

        for (int i = 1; i < prefixSums.length; i++) {
            if (checkerOne & checkerTwo) {
                if (inputString.charAt(i - 1) == inputString.charAt(i)) {
                    prefixSums[i] = prefixSums[i - 1] + 1;
                }
            }
        }

        int numQueries = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numQueries; i++) {
            String[] query = scanner.nextLine().split(" ");
            int m = Integer.parseInt(query[0]);
            int l = Integer.parseInt(query[1]);
            arr.add(prefixSums[l - 1] - prefixSums[m - 1]);
        }

        int[] arrArray = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arrArray[i] = arr.get(i);
        }

        double[] ttestInd = ttestInd(new int[] {90, 68, 40}, new int[] {28, 88, 95});
        for (int i = 0; i < arrArray.length; i++) {
            System.out.println(arrArray[i]);
        }
    }

    public static double[] ttestInd(int[] a, int[] b) {
        double[] result = new double[2];
        result[0] = (a[0] - b[0]) / Math.sqrt((a[1] - a[0]) * (b[1] - b[0]));
        result[1] = (a[2] - b[2]) / Math.sqrt((a[1] - a[0]) * (b[1] - b[0]));
        return result;
    }
}
```
Note that this code assumes that the input string is a single line of text, and that the queries are given as a list of pairs of integers separated by a space. The output is a list of integers, one for each query.

Also, note that the `ttestInd` function is not a built-in function in Java, so you will need to define it yourself.
