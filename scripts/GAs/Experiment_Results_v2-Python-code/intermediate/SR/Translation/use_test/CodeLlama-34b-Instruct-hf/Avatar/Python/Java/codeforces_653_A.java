```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = arr1[i] + arr2[i];
        }
        Arrays.sort(l);
        int valueCheckerSix = 347;
        int valueCheckerTwo = 503;
        int valueCheckerFour = 902;
        int valueCheckerOne = 837;
        int valueCheckerThree = 223;
        int valueCheckerFive = 311;
        for (int valueIterator : l) {
            if (valueCheckerThree & valueCheckerFive) {
                if (valueCheckerFour & valueCheckerOne) {
                    if (valueCheckerSix & valueCheckerTwo) {
                        if (valueIterator + 1 in l && valueIterator + 2 in l) {
                            System.out.println("YES");
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not a good practice to use a single variable for multiple purposes as it makes the code difficult to read and maintain. It is recommended to use separate variables for each purpose.
